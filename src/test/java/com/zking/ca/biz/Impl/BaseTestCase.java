package com.zking.ca.biz.Impl;

import com.zking.ca.util.PageBean;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Rollback(value = false)//true回滚事务，false提交事务
@Transactional(transactionManager = "transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTestCase {

    protected PageBean pageBean;

    @Before
    public void setUp() throws Exception {
        pageBean = new PageBean();
    }

    @After
    public void tearDown() throws Exception {

    }

}
