package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Liuyan;
import cn.jbit.guide_sys.service.LiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/liuyan")
public class LiuyanController {
    @Autowired
    private LiuyanService liuyanService;

    @ResponseBody
    @RequestMapping("/addLiuyanT")
    public Object addLiuyanT(Liuyan liuyan){
        int num=liuyanService.addLiuyanT(liuyan);
        return num;
    }

    @ResponseBody
    @RequestMapping("/selLiuyan/{id}")
    public Object selLiuyan(@PathVariable int id){
        List<Liuyan> list=liuyanService.selLiuyan(id);
        return list;
    }

    @ResponseBody
    @RequestMapping("/addhuifu")
    public Object addhuifu(Liuyan liuyan){
        int num=liuyanService.addhuifu(liuyan);
        return num;
    }

}
