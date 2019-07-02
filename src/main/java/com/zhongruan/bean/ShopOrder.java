package com.zhongruan.bean;

import java.util.Date;

public class ShopOrder {
    private String id;
    private int quantity;
    private Date orderDate;
    private int userId;
    private int bookId;
    private int orderStstus;
    private String address;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", orderStstus=" + orderStstus +
                ", address='" + address + '\'' +
                '}';
    }

    public ShopOrder() {}

    public ShopOrder(String id, int quantity, Date orderDate, int userId, int bookId, int orderStstus, String address) {
        this.id = id;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.userId = userId;
        this.bookId = bookId;
        this.orderStstus = orderStstus;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setOrderStstus(int orderStstus) {
        this.orderStstus = orderStstus;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getOrderStstus() {
        return orderStstus;
    }

    public String getAddress() {
        return address;
    }
}
