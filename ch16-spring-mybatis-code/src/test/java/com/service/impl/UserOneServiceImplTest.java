package com.service.impl;

import com.entity.UserOne;
import com.service.UserOneService;
import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)

public class UserOneServiceImplTest {
    @Autowired
    private UserOneService service;
    @Test
    public void getPageAll() {
        List<UserOne> result = service.getPageAll(1, 3);
        for (UserOne One : result) {
            System.out.println("-----debug: One = " + One);
        }
    }
}