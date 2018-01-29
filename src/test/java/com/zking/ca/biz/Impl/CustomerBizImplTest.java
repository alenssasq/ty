package com.zking.ca.biz.Impl;

import com.zking.ca.biz.ICustomerBiz;
import com.zking.ca.model.Customer;
import com.zking.ca.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerBizImplTest extends BaseTestCase{

    @Autowired
    private ICustomerBiz customerBiz;

    private Customer customer;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        customer=new Customer();
    }

    @Test
    public void load() {
        customer.setCustomerId(1);

        Customer c = customerBiz.load( customer );
        System.out.println(c);
        for(Order o:c.getOrderList()){
            System.out.println(o);
        }
    }
}