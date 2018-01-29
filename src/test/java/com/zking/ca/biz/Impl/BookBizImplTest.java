package com.zking.ca.biz.Impl;

import com.zking.ca.biz.IBookBiz;
import com.zking.ca.mapper.BookMapper;
import com.zking.ca.model.Book;
import com.zking.ca.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookBizImplTest extends BaseTestCase{

    @Autowired
    private IBookBiz bookBiz;

    private Book book;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        book = new Book();
    }

    @Test
    public void add() {
        book.setBookName("红楼梦zz");
        book.setBookPrice(77F);
        book.setBookBrief("677");
        bookBiz.add(book);
    }

    @Test
    public void edit() {
        book.setBookId(2);
        book.setBookName("sssd");
        book.setBookPrice(33f);
        book.setBookBrief("aa");

        bookBiz.edit(book);
    }

    @Test
    public void del() {
        book.setBookId(2);
        bookBiz.del(book);
    }

    @Test
    public void load() {
        book.setBookId(3);

        Book b = bookBiz.load(book);
        System.out.println(b);

        System.out.println("ddddddddddddddddddddddddddd");

        Book b1 = bookBiz.load(book);
        System.out.println(b1);

    }

    @Test
    public void list() {

        pageBean.setCurPage(1);
        pageBean.setPageRecord(3);
        List<Book> bookList = bookBiz.list(book, pageBean);

        for (Book m : bookList) {
            System.out.println(m);
        }

        System.out.println("xdxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (Book m1 : bookList) {
            System.out.println(m1);
        }
    }
}