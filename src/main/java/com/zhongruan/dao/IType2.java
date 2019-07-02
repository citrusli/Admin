package com.zhongruan.dao;

import com.zhongruan.bean.BookType1;
import com.zhongruan.bean.BookType2;

import java.util.List;

public interface IType2 {
    public List<BookType2> findType2ByName(String name);
    public void addType2(BookType2 type2);
    public List<BookType2> findType2ByType1(int type1Id);
}
