package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.mapper.TiMapper;
import cn.jbit.guide_sys.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tiao")
public class tiaoController {


    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/index")
    public ModelAndView index(String name){
        ModelAndView model=new ModelAndView();
        Admin a=new Admin();
        a.setA_name(name);
        model.addObject("a", a);
        model.setViewName("index");
        return model;
    }

    @RequestMapping("/index1")
    public ModelAndView index1(String name){
        ModelAndView model=new ModelAndView();
        Teacher t=new Teacher();
        t.setTname(name);
        model.addObject("t", t);
        model.setViewName("index1");
        return model;
    }

    @RequestMapping("/index2")
    public ModelAndView index2(String name){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuName(name);
        model.addObject("s", s);
        model.setViewName("index2");
        return model;
    }

    @RequestMapping("/introduce")
    public String introduce(){
        return "introduce";
    }


    @RequestMapping("/jishu")
    public ModelAndView jishu(int id){
        ModelAndView model=new ModelAndView();
        Jishu j=new Jishu();
        j.setBigId(id);
        model.addObject("j", j);
        model.setViewName("jishu");
        return model;
    }
    @RequestMapping("/jishu1")
    public ModelAndView jishu1(int id){
        ModelAndView model=new ModelAndView();
        Jishu j=new Jishu();
        j.setBigId(id);
        model.addObject("j", j);
        model.setViewName("jishu1");
        return model;
    }


    @RequestMapping("/addjishu")
    public String addjishu(){
        return "addjishu";
    }

    @RequestMapping("/teacher")
    public String teacher(){
        return "teacher";
    }

    @RequestMapping("/addteacher")
    public String addteacher(){
        return "addteacher";
    }

    @RequestMapping("/updteacher")
    public ModelAndView updteacher(String name,String pass,String yuanyi,String fangxiang,String email,int id){
        ModelAndView model=new ModelAndView();
        Teacher t=new Teacher();
        t.setTname(name);
        t.settPass(pass);
        t.setYuanyi(yuanyi);
        t.setFangxiang(fangxiang);
        t.setEmail(email);
        t.setId(id);
        model.addObject("t", t);
        model.setViewName("updteacher");
        return model;
    }
    @RequestMapping("/updteacher1")
    public ModelAndView updteacher1(String name,String pass,String yuanyi,String fangxiang,String email,int id,String tId){
        ModelAndView model=new ModelAndView();
        Teacher t=new Teacher();
        t.setTname(name);
        t.settPass(pass);
        t.setYuanyi(yuanyi);
        t.setFangxiang(fangxiang);
        t.setEmail(email);
        t.setId(id);
        t.settId(tId);
        model.addObject("t", t);
        model.setViewName("updteacher1");
        return model;
    }
    @RequestMapping("/student")
    public String student(){
        return "student";
    }

    @RequestMapping("/student1")
    public ModelAndView student1(String name){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuId(name);
        model.addObject("s", s);
        model.setViewName("student1");
        return model;
    }
    @RequestMapping("/teacher1")
    public ModelAndView teacher1(String name){
        ModelAndView model=new ModelAndView();
        Teacher t=new Teacher();
        t.settId(name);
        model.addObject("t", t);
        model.setViewName("teacher1");
        return model;
    }

    @RequestMapping("/addstudent")
    public String addstudent(){
        return "addstudent";
    }

    @RequestMapping(value="/updstudent",produces="text/html;charset=UTF-8")
    public ModelAndView updstudent(String name,String pass,String yuanyi,String zhuangye,String email,int id){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuName(name);
        s.setStuPass(pass);
        s.setYuanyi(yuanyi);
        s.setZhuangye(zhuangye);
        s.setEmail(email);
        s.setId(id);
        model.addObject("s", s);
        model.setViewName("updstudent");
        return model;
    }

    @RequestMapping(value="/updstudent1",produces="text/html;charset=UTF-8")
    public ModelAndView updstudent1(String name,String pass,String yuanyi,String zhuangye,String email,int id,String stuId){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuName(name);
        s.setStuPass(pass);
        s.setYuanyi(yuanyi);
        s.setZhuangye(zhuangye);
        s.setEmail(email);
        s.setId(id);
        s.setStuId(stuId);
        model.addObject("s", s);
        model.setViewName("updstudent1");
        return model;
    }
    @RequestMapping("/gonggao")
    public String gonggao(){
        return "gonggao";
    }

    @RequestMapping("/gonggao1")
    public String gonggao1(){
        return "gonggao1";
    }
    @RequestMapping("/addgonggao")
    public String addgonggao(){
        return "addgonggao";
    }

    @RequestMapping("/updgonggao")
    public ModelAndView updgonggao(String name,String xinxi,int id){
        ModelAndView model=new ModelAndView();
        Gonggao g=new Gonggao();
        g.setId(id);
        g.setName(name);
        g.setXinxi(xinxi);
        model.addObject("g", g);
        model.setViewName("updgonggao");
        return model;
    }
    @RequestMapping("/updgonggao1")
    public ModelAndView updgonggao1(String name,String xinxi,int id){
        ModelAndView model=new ModelAndView();
        Gonggao g=new Gonggao();
        g.setId(id);
        g.setName(name);
        g.setXinxi(xinxi);
        model.addObject("g", g);
        model.setViewName("updgonggao1");
        return model;
    }
    @RequestMapping("/zhuce")
    public String zhuce(){
        return "zhuce";
    }
    @RequestMapping("/zhuce1")
    public String zhuce1(){
        return "zhuce1";
    }

    @RequestMapping("/mima")
    public String mima(){
        return "mima";
    }

    @Autowired
    private TiMapper mapper;

    @RequestMapping("/ti")
    public String ti(Model model){
        List<Ti> list = mapper.selTi();
        model.addAttribute("answer", list.stream().map(Ti::getDaan).toArray());
        model.addAttribute("res", list);

        return "ti";
    }
    @RequestMapping("/download")
    public String download(){
        return "download";
    }

    @RequestMapping("/wenti")
    public String wenti(){
        return "wenti";
    }

    @RequestMapping("/wenti1")
    public ModelAndView  wenti1(String name){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuName(name);
        model.addObject("s", s);
        model.setViewName("wenti1");
        return model;
    }

    @RequestMapping("/wenti2")
    public ModelAndView  wenti2(String name){
        ModelAndView model=new ModelAndView();
        Student s=new Student();
        s.setStuName(name);
        model.addObject("s", s);
        model.setViewName("wenti2");
        return model;
    }

    @RequestMapping("/addwenti")
    public String addwenti(){
        return "addwenti";
    }

    @RequestMapping("/chakanwenti")
    public ModelAndView chakanwenti(String name,String desc,String type,int id,int count,String stuName){
        ModelAndView model=new ModelAndView();
        Wenti w=new Wenti();
        Liuyan l=new Liuyan();
        w.setName(name);
        w.setDesc(desc);
        w.setType(type);
        w.setWenId(id);
        l.setS_name(stuName);
        w.setCount1(count);
        model.addObject("w", w);
        model.addObject("l", l);
        model.setViewName("chakanwenti");
        return model;
    }

    @RequestMapping("/chakanwenti1")
    public ModelAndView chakanwenti1(String name,String desc,String type,int id,int count,String stuName){
        ModelAndView model=new ModelAndView();
        Wenti w=new Wenti();
        Liuyan l=new Liuyan();
        w.setName(name);
        w.setDesc(desc);
        w.setType(type);
        w.setWenId(id);
        l.setS_name(stuName);
        w.setCount1(count);
        model.addObject("w", w);
        model.addObject("l", l);
        model.setViewName("chakanwenti1");
        return model;
    }

}
