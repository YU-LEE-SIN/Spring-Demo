package com.service;

import com.entity.UserInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserInfoServiceImplTest {

    @Test
    public void getUserInfoByPage() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInfoServiceImpl service = context.getBean("userInfoService", UserInfoServiceImpl.class);
        int pageNo = 1;
        int pageSize = 5;
        Page<UserInfo> userInfos = (Page<UserInfo>) service.getUserInfoByPage(pageNo, pageSize);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfos);
        for (UserInfo userInfo : userInfos) {
            System.out.println("userInfo = " + userInfo);
        }
    }
}