package com.zking.ca.biz.Impl;

import com.zking.ca.biz.INewsBiz;
import com.zking.ca.model.Category;
import com.zking.ca.model.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsBizImplTest extends BaseTestCase{

    private News news;

    @Autowired
    private INewsBiz newsBiz;

    @Override
    public void setUp () throws Exception {
        super.setUp();
        news = new News();
    }

    @Test
    public void loadNews () {
        news.setNewsId( 1 );

        News n = newsBiz.loadNews( news );

        System.out.println( n );

        for (Category c : n.getCategoryList()) {
            System.out.println( c );
        }
    }

        @Test
        public void addCategory () {
           news.setNewsId(8);
           news.setCategoryId(6);

           newsBiz.addCategory( news );
        }

        @Test
    public void delCategory () {
        news.setNewsId( 8);
        news.setCategoryId( 6 );

        newsBiz.delCategory( news );
    }

    @Test
    public void del () {
        news.setNewsId( 1);

        newsBiz.del( news );
    }
}