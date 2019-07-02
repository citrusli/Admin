package com.zhongruan.bean;

public class User {
    private int id;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userEmail;
    private String userAddress1;
    private String userAddress2;
    private String userAddress3;
    private String trueName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress1='" + userAddress1 + '\'' +
                ", userAddress2='" + userAddress2 + '\'' +
                ", userAddress3='" + userAddress3 + '\'' +
                ", trueName='" + trueName + '\'' +
                '}';
    }

    public User() {}

    public User(String userName, String userPassword, String userPhone, String userEmail, String userAddress1, String userAddress2, String userAddress3, String trueName) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userAddress1 = userAddress1;
        this.userAddress2 = userAddress2;
        this.userAddress3 = userAddress3;
        this.trueName = trueName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress1() {
        return userAddress1;
    }

    public void setUserAddress1(String userAddress1) {
        this.userAddress1 = userAddress1;
    }

    public String getUserAddress2() {
        return userAddress2;
    }

    public void setUserAddress2(String userAddress2) {
        this.userAddress2 = userAddress2;
    }

    public String getUserAddress3() {
        return userAddress3;
    }

    public void setUserAddress3(String userAddress3) {
        this.userAddress3 = userAddress3;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }
}
