package com.zhongruan.dao;

import com.zhongruan.bean.Stock;

import java.util.List;

public interface IStock {
    public List<Stock> findStockById(int id);
    public void changeStock(int id,int num);
    public void changePrice(int id,double price);
    public void addStock(Stock stock);
}
