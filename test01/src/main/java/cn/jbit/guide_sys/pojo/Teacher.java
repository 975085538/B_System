package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Teacher implements Serializable {

    private Integer id;
    private String tId;
    private String tname;
    private String yuanyi;
    private String tPass;
    private String fangxiang;
    private String email;


    public String getYuanyi() {
        return yuanyi;
    }

    public void setYuanyi(String yuanyi) {
        this.yuanyi = yuanyi;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettPass() {
        return tPass;
    }

    public void settPass(String tPass) {
        this.tPass = tPass;
    }

    public String getFangxiang() {
        return fangxiang;
    }

    public void setFangxiang(String fangxiang) {
        this.fangxiang = fangxiang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
