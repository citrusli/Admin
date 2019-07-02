package com.zhongruan.pojo;

import com.zhongruan.bean.Book;

public class AddBookResponse {
    private int flag;             //1:成功添加  2：isbn重复  3：title重复  4：出版社不存在  5：类型不存在  6：url错误
    private Book book;            //要添加的书籍
    private String description;   //结果描述

    public AddBookResponse() {}

    public AddBookResponse(int flag, Book book, String description) {
        this.flag = flag;
        this.book = book;
        this.description = description;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
