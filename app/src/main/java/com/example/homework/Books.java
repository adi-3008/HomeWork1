package com.example.homework;

public class Books {
    private int id;
    private String Name;
    private String author;
    private int Pages;
    private String imgUrl;
    private String shortDesc;
    private String longDesc;
    private boolean isExpanded;

    public Books(int id, String name, String author, int pages, String imgUrl, String shortDesc, String longDesc) {
        this.id = id;
        Name = name;
        this.author = author;
        Pages = pages;
        this.imgUrl = imgUrl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.isExpanded = false;
    }

    public int getId() {
        return id ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Id =" + id  +
                ", Name='" + Name + '\'' +
                ", author='" + author + '\'' +
                ", Pages=" + Pages +
                ", imgUrl='" + imgUrl + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                '}';
    }
}