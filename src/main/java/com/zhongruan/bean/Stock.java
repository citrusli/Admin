package com.zhongruan.bean;

public class Stock {
    private int bookId;
    private int quantity;
    private double price;
    private String address;

    @Override
    public String toString() {
        return "Stock{" +
                "bookId=" + bookId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    public Stock(int quantity, double price, String address) {
        this.quantity = quantity;
        this.price = price;
        this.address = address;
    }

    public Stock(){}

    public Stock(int bookId, int quantity, double price, String address) {
        this.bookId = bookId;
        this.quantity = quantity;
        this.price = price;
        this.address = address;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
