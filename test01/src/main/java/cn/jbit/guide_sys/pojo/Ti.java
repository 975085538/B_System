package cn.jbit.guide_sys.pojo;

import java.io.Serializable;

public class Ti implements Serializable {
    private Integer id;
    private String name;
    private String xuan1;
    private String xuan2;
    private String xuan3;
    private String daan;

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

    public String getXuan1() {
        return xuan1;
    }

    public void setXuan1(String xuan1) {
        this.xuan1 = xuan1;
    }

    public String getXuan2() {
        return xuan2;
    }

    public void setXuan2(String xuan2) {
        this.xuan2 = xuan2;
    }

    public String getXuan3() {
        return xuan3;
    }

    public void setXuan3(String xuan3) {
        this.xuan3 = xuan3;
    }

    public String getDaan() {
        return daan;
    }

    public void setDaan(String daan) {
        this.daan = daan;
    }
}
