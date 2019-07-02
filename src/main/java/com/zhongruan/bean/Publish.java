package com.zhongruan.bean;

public class Publish {
    private int id;
    private String pubName;
    private String pubPhone;
    private String pubAdd;

    @Override
    public String toString() {
        return "Publish{" +
                "id=" + id +
                ", pubName='" + pubName + '\'' +
                ", pubPhone='" + pubPhone + '\'' +
                ", pubAdd='" + pubAdd + '\'' +
                '}';
    }

    public Publish() {}

    public Publish(String pubName, String pubPhone, String pubAdd) {
        this.pubName = pubName;
        this.pubPhone = pubPhone;
        this.pubAdd = pubAdd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }

    public String getPubAdd() {
        return pubAdd;
    }

    public void setPubAdd(String pubAdd) {
        this.pubAdd = pubAdd;
    }
}
