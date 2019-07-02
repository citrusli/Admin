package com.zhongruan.service;

import com.zhongruan.bean.*;
import com.zhongruan.pojo.GetOrderResponse;

import java.util.List;

public interface IAdminService {
    public int addBook(Book book,Stock stock);
    public int addType1(BookType1 type1);
    public int addType2(BookType2 type2);
    public int findPubByName(String pubName);
    public int findType2ByName(String type2Name);
    public int findType1ByName(String type1Name);
    public int addPublish(Publish publish);
    public List<Publish> findAllPublish();
    public List<BookType1> findAllType1();
    public List<BookType2> findType2ByType1(String type1Name);
    public int findBookIdByName(String title);
    public int addStock(int id,int num);
    public int delStock(int id,int num);
    public List<Stock> findStockById(int id);
    public void changePrice(int id,double price);
    public List<Status> getAllStatus();
    public int getIdByStatusName(String name);
    public int changeOrderStatus(String id, int status);
    public List<GetOrderResponse> getAllOrder();
    public String findBookNameById(int id);
    public double findPriceByBookId(int id);
    public String findStatusNameById(int id);
    public String findUserNameById(int id);
}
