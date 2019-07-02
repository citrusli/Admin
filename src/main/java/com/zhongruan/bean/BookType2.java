package com.zhongruan.bean;

public class BookType2 {
    private int id;
    private String typeName;
    private int type1;

    @Override
    public String toString() {
        return "BookType2{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", type1=" + type1 +
                '}';
    }

    public BookType2() {}

    public BookType2(int id, String typeName, int type1) {
        this.id = id;
        this.typeName = typeName;
        this.type1 = type1;
    }

    public BookType2(String typeName, int type1) {
        this.typeName = typeName;
        this.type1 = type1;
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

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }
}
