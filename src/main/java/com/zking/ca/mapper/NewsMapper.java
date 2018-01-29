package com.zking.ca.mapper;

import com.zking.ca.model.News;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int delNid(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey (News record);

    News load(News news);

    void addCategory(News news);

    void delCategory (News news);

}