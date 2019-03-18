package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Wenti;
import cn.jbit.guide_sys.service.WentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/wenti")
public class WentiController {
    @Autowired
    private WentiService wentiService;


    @ResponseBody
    @RequestMapping("/selWenti")
    public Object selWenti(){
        List<Wenti> list=wentiService.selWenti();
        return list;
    }

    @ResponseBody
    @RequestMapping("/addWenti")
    public Object addWenti(Wenti wenti){
        int num=wentiService.addWenti(wenti);
        return num;
    }

    @ResponseBody
    @RequestMapping("/count/{id}")
    public void count(@PathVariable int id){
        wentiService.count(id);
    }

}
