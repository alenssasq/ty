package com.zking.ca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class News implements Serializable{
    private Integer newsId;

    private String title;

    private Integer categoryId;

    private List<Category> categoryList=new ArrayList<Category>();

    public News(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public News() {
        super();
    }

    public Integer getCategoryId () {
        return categoryId;
    }

    public void setCategoryId (Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString () {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                '}';
    }
}