package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer id;
    private String a_name;
    private String a_pass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pass() {
        return a_pass;
    }

    public void setA_pass(String a_pass) {
        this.a_pass = a_pass;
    }
}
