package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.StudentMapper;
import cn.jbit.guide_sys.pojo.Student;
import cn.jbit.guide_sys.pojo.Teacher;
import cn.jbit.guide_sys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selStudent() {
        return studentMapper.selStudent();
    }

    @Override
    public int delStudent(int id) {
        return studentMapper.delStudent(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updStudent(Student student) {
        return studentMapper.updStudent(student);
    }

    @Override
    public int selStudentById(String stuId, String stuPass) {
        return studentMapper.selStudentById(stuId, stuPass);
    }

    @Override
    public int updStuMima(Student student) {
        return studentMapper.updStuMima(student);
    }

    @Override
    public List<Student> selStudentByname(String stuId) {
        return studentMapper.selStudentByname(stuId);
    }
}
