package com.complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_complex.xml");
        UserServiceImpl service = context.getBean("userService2", UserServiceImpl.class);
        service.update();
    }
}