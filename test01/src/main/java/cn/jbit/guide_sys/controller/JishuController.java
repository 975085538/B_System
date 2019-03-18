package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Jishu;
import cn.jbit.guide_sys.service.JishuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/jishu")
public class JishuController {

    @Autowired
    private JishuService jishuService;


    @ResponseBody
    @RequestMapping("/selJishu/{id}")
    public String selJishu(@PathVariable int id){
        List<Jishu> list=jishuService.selJishu(id);
        return JSON.toJSONString(list);
    }
    @ResponseBody
    @RequestMapping("/addJishu")
    public Object addJishu(Jishu jishu){
        int num=jishuService.addJishu(jishu);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/selmohu/{name}")
    public String selmohu(@PathVariable String name){
        List<Jishu> list=jishuService.selmohu(name);
        return JSON.toJSONString(list);
    }
}
