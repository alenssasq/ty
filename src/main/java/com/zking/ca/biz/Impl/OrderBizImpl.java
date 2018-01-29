package com.zking.ca.biz.Impl;

import com.zking.ca.biz.IOrderBiz;
import com.zking.ca.mapper.OrderMapper;
import com.zking.ca.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBizImpl implements IOrderBiz {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order load(Order order) {
        return orderMapper.selectByPrimaryKey(order.getOrderId());
    }
}
