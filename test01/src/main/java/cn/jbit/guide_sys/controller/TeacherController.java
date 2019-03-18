package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Teacher;
import cn.jbit.guide_sys.service.TeacherService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ResponseBody
    @RequestMapping("/selTeacher")
    public Object selTeacher(){
        List<Teacher> list =teacherService.selTeacher();
        return JSON.toJSONString(list);
    }


    @ResponseBody
    @RequestMapping("/delTeacher/{id}")
    public Object delTeacher(@PathVariable int id){
       int num=teacherService.delTeacher(id);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/addTeacher")
    public Object addTeacher(Teacher teacher){
        int num=teacherService.addTeacher(teacher);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/updTeacher")
    public Object updTeacher(Teacher teacher){
        int num=teacherService.updTeacher(teacher);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/selTeacherById/{tId}/{tPass}")
    public String selTeacherById(@PathVariable String tId,@PathVariable String tPass){
        int num=teacherService.selTeacherById(tId, tPass);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/updTeacherMima")
    public Object updTeacherMima(Teacher teacher){
        int num=teacherService.updTeacherMima(teacher);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/selTeacherByname/{tId}")
    public Object selTeacherByname(@PathVariable String tId){
        List<Teacher> list =teacherService.selTeacherByname(tId);
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("/selTeacherType/{type}")
    public Object selTeacherType(@PathVariable String type){
        List<Teacher> list =teacherService.selTeacherType(type);
        return JSON.toJSONString(list);
    }


}
