package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Jishu implements Serializable {
    private Integer id;
    private String name;
    private String xinxi;
    private String fazhang;
    private String href;
    private Integer bigId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXinxi() {
        return xinxi;
    }

    public void setXinxi(String xinxi) {
        this.xinxi = xinxi;
    }

    public String getFazhang() {
        return fazhang;
    }

    public void setFazhang(String fazhang) {
        this.fazhang = fazhang;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getBigId() {
        return bigId;
    }

    public void setBigId(Integer bigId) {
        this.bigId = bigId;
    }
}
