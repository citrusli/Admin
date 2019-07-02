package com.zhongruan.pojo;

import com.zhongruan.bean.ShopOrder;
import org.springframework.core.annotation.Order;

import java.util.Date;

public class GetOrderResponse {
    private String id;
    private int quantity;
    private Date orderDate;
    private int userId;
    private String userName;
    private int bookId;
    private String bookName;
    private double price;
    private int orderStstus;
    private String statusName;
    private String address;

    public GetOrderResponse() {
    }

    public GetOrderResponse(ShopOrder order) {
        this.id = order.getId();
        this.quantity = order.getQuantity();
        this.orderDate = order.getOrderDate();
        this.userId = order.getUserId();
        this.bookId = order.getBookId();
        this.orderStstus = order.getOrderStstus();
        this.address = order.getAddress();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderStstus() {
        return orderStstus;
    }

    public void setOrderStstus(int orderStstus) {
        this.orderStstus = orderStstus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
