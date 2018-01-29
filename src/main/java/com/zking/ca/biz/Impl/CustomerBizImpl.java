package com.zking.ca.biz.Impl;

import com.zking.ca.biz.ICustomerBiz;
import com.zking.ca.mapper.CustomerMapper;
import com.zking.ca.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBizImpl implements ICustomerBiz {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer load(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId());
    }
}
