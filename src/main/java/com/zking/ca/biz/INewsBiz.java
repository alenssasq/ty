package com.zking.ca.biz;

import com.zking.ca.model.News;

public interface INewsBiz {

    public News loadNews (News news);

    public void addCategory (News news);

    public void delCategory (News news);

    public void del (News news);
}
