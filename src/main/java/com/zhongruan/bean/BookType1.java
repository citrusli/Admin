package com.zhongruan.bean;

public class BookType1 {
    private int id;
    private String typeName;

    @Override
    public String toString() {
        return "BookType1{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public BookType1() {}

    public BookType1(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public BookType1(String typeName) {
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
