package cn.jbit.guide_sys.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Value("${spring.servlet.multipart.location}")
    private String locations;

    @ResponseBody
    @GetMapping("/list")
    public List<String> list() {
        try {
            return Files.list(Paths.get(locations)).map(Path::toFile).map(File::getName).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @GetMapping
    public String upload2(Model model) {
        model.addAttribute("name", "");
        return "uploadtest";
    }

    @PostMapping
    public String upload(@RequestParam MultipartFile file, RedirectAttributes redirectAttributes) {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        String suffix;
        if(file.getOriginalFilename().contains(File.separator)) {
          suffix=   file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(File.separator));
        } else {
            suffix = File.separator + file.getOriginalFilename();
        }

        System.out.println(suffix);
        try {
            file.transferTo(Paths.get(locations + suffix));
        } catch (IOException e) {
            e.printStackTrace();
        }
        redirectAttributes.addFlashAttribute("name", file.getOriginalFilename());

        return "redirect:/upload";
    }


    private static final Map<String, String> TYPE = new HashMap<>();

    static {
        TYPE.put("doc", "application/msword");
        TYPE.put("xls", "application/vnd.ms-excel");
    }

    @ResponseBody
    @GetMapping("/download2/{name}/{suffix}")
    public void download2(@PathVariable String name, @PathVariable String suffix, HttpServletResponse resp) {
        resp.setContentType("application/octet-stream");
        try (OutputStream out = resp.getOutputStream()) {
            out.write("test".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @GetMapping("/download/{name}")
    public void download(@PathVariable String name, HttpServletRequest request, HttpServletResponse resp) {
        Path path = Paths.get(locations + File.separator + name);

        try {
            byte[] values = Files.readAllBytes(path);
            String suffix = name.substring(name.indexOf('.') + 1);

            resp.setContentType("application/octet-stream");

            resp.getOutputStream().write(values);
            resp.getOutputStream().flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
