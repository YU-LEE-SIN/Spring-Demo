package com.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_Sql.xml");
        SqlSessionFactory c = context.getBean("factory", SqlSessionFactory.class);
        System.out.println("s = " + c);
    }
}
