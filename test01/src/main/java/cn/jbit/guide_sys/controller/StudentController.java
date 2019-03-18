package cn.jbit.guide_sys.controller;

import cn.jbit.guide_sys.pojo.Student;
import cn.jbit.guide_sys.pojo.Teacher;
import cn.jbit.guide_sys.service.StudentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @ResponseBody
    @RequestMapping("/selStudent")
    public String selStudent(){
        List<Student> list=studentService.selStudent();
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("/delStudent/{id}")
    public String delStudent(@PathVariable int id){
        int num=studentService.delStudent(id);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        int num=studentService.addStudent(student);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping(value="/updStudent",produces="text/html;charset=UTF-8")
    public String updStudent(Student student){
        int num=studentService.updStudent(student);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/selStudentById/{stuId}/{stuPass}")
    public String updStudent(@PathVariable String stuId,@PathVariable String stuPass){
        int num=studentService.selStudentById(stuId, stuPass);
        return JSON.toJSONString(num);
    }

    @ResponseBody
    @RequestMapping("/updStuMima")
    public String updStuMima(Student student){
        int num=studentService.updStuMima(student);
        return JSON.toJSONString(num);
    }


    @ResponseBody
    @RequestMapping("/selStudentByname/{stuId}")
    public String selStudentByname(@PathVariable String stuId){
        List<Student> list=studentService.selStudentByname(stuId);
        return JSON.toJSONString(list);
    }

}
