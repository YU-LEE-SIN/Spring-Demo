package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserInfoServiceTest {
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private UserInfoService service;
    @Test
    public void txDemo() {
        //UserInfoService service = ctx.getBean(UserInfoService.class);
        service.txDemo();
    }
}