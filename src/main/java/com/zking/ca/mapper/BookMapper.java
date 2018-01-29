package com.zking.ca.mapper;

import com.zking.ca.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    public List<Book> list(Book book);
}