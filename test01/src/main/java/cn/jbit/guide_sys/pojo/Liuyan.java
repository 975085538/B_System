package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Liuyan implements Serializable {
    private Integer id;
    private Integer wen_id;
    private String t_name;
    private String s_name;
    private String message;
    private String reply;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWen_id() {
        return wen_id;
    }

    public void setWen_id(Integer wen_id) {
        this.wen_id = wen_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
