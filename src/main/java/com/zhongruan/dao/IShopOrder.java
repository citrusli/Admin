package com.zhongruan.dao;

import com.zhongruan.bean.ShopOrder;

import java.util.List;

public interface IShopOrder {
    public void changeOrderStatus(String orderId, int statusId);
    public List<ShopOrder> findAllOrder();
}
