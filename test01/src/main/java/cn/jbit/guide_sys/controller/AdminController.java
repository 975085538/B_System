package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.service.IAdminService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService service;

    @ResponseBody
    @RequestMapping("/loginAdmin/{name}/{pass}")
    public Object loginAdmin(@PathVariable String name,@PathVariable String pass) {
        return JSON.toJSON(service.loadByUsername(name, pass));
    }
}
