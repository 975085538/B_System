package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Gonggao;
import cn.jbit.guide_sys.service.GonggaoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/gonggao")
public class GonggaoController {
    @Autowired
    private GonggaoService gonggaoService;

    @ResponseBody
    @RequestMapping("/selGonggao")
    public String selGonggao(){
        List<Gonggao> list=gonggaoService.selGonggao();
        return JSON.toJSONString(list);
    }


    @ResponseBody
    @RequestMapping("/delGonggao/{id}")
    public String delGonggao(@PathVariable int id){
        int num=gonggaoService.delGonggao(id);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/addGonggao")
    public String addGonggao(Gonggao gonggao){
        int num=gonggaoService.addGonggao(gonggao);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/updGonggao")
    public String updGonggao(Gonggao gonggao){
        int num=gonggaoService.updGonggao(gonggao);
        return JSON.toJSONString(num);
    }
}
