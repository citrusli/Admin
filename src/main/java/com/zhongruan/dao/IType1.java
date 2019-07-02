package com.zhongruan.dao;

import com.zhongruan.bean.BookType1;
import com.zhongruan.bean.BookType2;

import java.util.List;

public interface IType1 {
    public List<BookType1> findType1ByName(String name);
    public void addType1(BookType1 type1);
    public List<BookType1> findAllType1();
}
