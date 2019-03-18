package cn.jbit.guide_sys.service;

import cn.jbit.guide_sys.pojo.Student;
import cn.jbit.guide_sys.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    //查询学生信息
    List<Student> selStudent();
    //删除学生信息
    int delStudent(@Param("id") int id);
    //添加学生信息
    int addStudent(Student student);
    //修改学生信息
    int updStudent(Student student);
    //学生登录
    int selStudentById(@Param("stuId") String stuId,@Param("stuPass") String stuPass);
    //找回密码
    int updStuMima(Student student);
    //根据学号查询学生信息
    List<Student> selStudentByname(@Param("stuId") String stuId);
}
