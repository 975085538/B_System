package cn.jbit.guide_sys.service;

import cn.jbit.guide_sys.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {
    //查询老师信息
    List<Teacher> selTeacher();
    //删除老师信息
    int delTeacher(@Param("id") int id);
    //添加老师信息
    int addTeacher(Teacher teacher);
    //修改老师信息
    int updTeacher(Teacher teacher);
    //老师登录
    int selTeacherById(@Param("tId") String tId,@Param("tPass") String tPass);
    //找回密码
    int updTeacherMima(Teacher teacher);
    //根据Id查询老师信息
    List<Teacher> selTeacherByname(@Param("tId") String tId);
    //根据类型查看老师
    List<Teacher> selTeacherType(@Param("type") String type);
}
