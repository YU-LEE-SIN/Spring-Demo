package com;

import com.service.UserInfoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInfoServiceImpl service = ctx.getBean("service", UserInfoServiceImpl.class);
        service.deleteWholeById(5);
    }
}
