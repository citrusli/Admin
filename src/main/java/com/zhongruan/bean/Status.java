package com.zhongruan.bean;

public class Status {
    private int id;
    private String statusName;
    private String description;

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Status(){}

    public Status(String statusName, String description) {
        this.statusName = statusName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
