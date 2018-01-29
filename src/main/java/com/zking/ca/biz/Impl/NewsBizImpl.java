package com.zking.ca.biz.Impl;

import com.zking.ca.biz.INewsBiz;
import com.zking.ca.mapper.NewsMapper;
import com.zking.ca.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsBizImpl implements INewsBiz {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News loadNews (News news) {
        return newsMapper.load(news);
    }

    @Override
    public void addCategory (News news) {
        newsMapper.addCategory( news );
    }


    @Override
    public void delCategory (News news) {
        newsMapper.delCategory( news);
    }

    @Override
    public void del (News news) {
        newsMapper.delNid( news.getNewsId() );
        newsMapper.deleteByPrimaryKey( news.getNewsId() );
    }
}
