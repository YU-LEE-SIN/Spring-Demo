package com.namespase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_namespace.xml");

        MyDataSource ds = context.getBean("dataSource", MyDataSource.class);
        System.out.println(ds);
    }
}
