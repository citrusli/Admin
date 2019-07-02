package com.zhongruan.dao;

import com.zhongruan.bean.Book;

import java.util.List;

public interface IBook {
    public void addBook(Book book);
    public List<Book> findBookByIsbn(String isbn);
    public List<Book> findBookByTitle(String title);
    public List<Book> findBookById(int id);
}
