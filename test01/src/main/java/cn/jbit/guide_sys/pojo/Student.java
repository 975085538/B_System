package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Student implements Serializable {
        private Integer id;
        private String stuName;
        private String stuId;
        private String stuPass;
        private String yuanyi;
        private String zhuangye;
        private String email;
        private String teacherId;
        private Teacher teacher;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass;
    }

    public String getYuanyi() {
        return yuanyi;
    }

    public void setYuanyi(String yuanyi) {
        this.yuanyi = yuanyi;
    }

    public String getZhuangye() {
        return zhuangye;
    }

    public void setZhuangye(String zhuangye) {
        this.zhuangye = zhuangye;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
