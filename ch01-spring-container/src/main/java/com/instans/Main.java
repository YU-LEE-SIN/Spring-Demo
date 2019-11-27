package com.instans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("daos.xml");
        ProductDao p=context.getBean("productDao",ProductDao.class);
        p.getProduct();
    }
}
