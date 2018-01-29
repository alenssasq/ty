package com.zking.ca.biz.Impl;

import com.zking.ca.biz.IOrderBiz;
import com.zking.ca.model.Customer;
import com.zking.ca.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderBizImplTest extends BaseTestCase{

    private Order order;

    @Autowired
    private IOrderBiz orderBiz;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        order=new Order();
    }

    @Test
    public void load() {
        order.setOrderId(1);

        Order o = orderBiz.load( order );
        System.out.println(o);
        System.out.println(o.getCustomer());
    }
}