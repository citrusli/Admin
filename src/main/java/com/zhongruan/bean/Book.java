package com.zhongruan.bean;

import java.util.Date;

public class Book {
    private String isbn;
    private int id;
    private String title;
    private String author;
    private int pubId;
    private String version;
    private Date publishDate;
    private String introduction;
    private int type2;
    private int markNum;
    private int saleNum;
    private String pictureUrl;

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubId=" + pubId +
                ", version='" + version + '\'' +
                ", publishDate=" + publishDate +
                ", introduction='" + introduction + '\'' +
                ", type2=" + type2 +
                ", markNum=" + markNum +
                ", saleNum=" + saleNum +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }

    public Book(){}

    public Book(String isbn, int id, String title, String author, int pubId, String version, Date publishDate, String introduction, int type2, int markNum, int saleNum, String pictureUrl) {
        this.isbn = isbn;
        this.id = id;
        this.title = title;
        this.author = author;
        this.pubId = pubId;
        this.version = version;
        this.publishDate = publishDate;
        this.introduction = introduction;
        this.type2 = type2;
        this.markNum = markNum;
        this.saleNum = saleNum;
        this.pictureUrl = pictureUrl;
    }

    public Book(String isbn, String title, String author, int pubId, String version, Date publishDate, String introduction, int type2, int markNum, int saleNum, String pictureUrl) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pubId = pubId;
        this.version = version;
        this.publishDate = publishDate;
        this.introduction = introduction;
        this.type2 = type2;
        this.markNum = markNum;
        this.saleNum = saleNum;
        this.pictureUrl = pictureUrl;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public int getMarkNum() {
        return markNum;
    }

    public void setMarkNum(int markNum) {
        this.markNum = markNum;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
