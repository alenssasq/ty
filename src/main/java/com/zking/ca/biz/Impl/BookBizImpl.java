package com.zking.ca.biz.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ca.biz.IBookBiz;
import com.zking.ca.mapper.BookMapper;
import com.zking.ca.model.Book;
import com.zking.ca.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookBizImpl implements IBookBiz {

    //    spring依赖注入
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Integer add(Book book) {
        int id = bookMapper.insert(book);
        return id;
    }

    @Override
    public void edit(Book book) {
        bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public void del(Book book) {
        bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getBookId());
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
        return bookMapper.list(book);
    }


}
