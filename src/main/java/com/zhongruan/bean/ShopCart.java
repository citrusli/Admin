package com.zhongruan.bean;

public class ShopCart {
    private int userId;
    private int bookId;
    private int quantity;
    private String address;

    @Override
    public String toString() {
        return "ShopCart{" +
                "userId=" + userId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                ", address='" + address + '\'' +
                '}';
    }

    public ShopCart(){}

    public ShopCart(int userId, int bookId, int quantity, String address) {
        this.userId = userId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
