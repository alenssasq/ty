package com.zking.ca.biz;

import com.zking.ca.model.Book;
import com.zking.ca.util.PageBean;

import java.util.List;

public interface IBookBiz {

    public Integer add(Book book);

    public void edit(Book book);

    public void del(Book book);

    public Book load(Book book);

    public List<Book> list(Book book, PageBean pageBean);

}
