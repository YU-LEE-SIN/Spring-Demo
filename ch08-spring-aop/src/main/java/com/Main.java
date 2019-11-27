package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceImpl service = ctx.getBean("service", ServiceImpl.class);
        service.insert();
        service.update();
    }
}
