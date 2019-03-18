package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Ti;
import cn.jbit.guide_sys.service.TiService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ti")
public class TiController {

    @Autowired
    private TiService tiService;

    @ResponseBody
    @RequestMapping("selTi")
    public String selTi(){
        List<Ti> list=tiService.selTi();
        return JSON.toJSONString(list);
    }
}
