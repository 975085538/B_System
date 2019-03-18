package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.TeacherMapper;
import cn.jbit.guide_sys.pojo.Teacher;
import cn.jbit.guide_sys.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<Teacher> selTeacher() {
        return teacherMapper.selTeacher();
    }

    @Override
    public int delTeacher(int id) {
        return teacherMapper.delTeacher(id);
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int updTeacher(Teacher teacher) {
        return teacherMapper.updTeacher(teacher);
    }

    @Override
    public int selTeacherById(String tId, String tPass) {
        return teacherMapper.selTeacherById(tId, tPass);
    }

    @Override
    public int updTeacherMima(Teacher teacher) {
        return teacherMapper.updTeacherMima(teacher);
    }

    @Override
    public List<Teacher> selTeacherByname(String tId) {
        return teacherMapper.selTeacherByname(tId);
    }

    @Override
    public List<Teacher> selTeacherType(String type) {
        return teacherMapper.selTeacherType(type);
    }
}
