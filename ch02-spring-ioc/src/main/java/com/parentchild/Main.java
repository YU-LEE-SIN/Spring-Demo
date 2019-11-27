package com.parentchild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_parentchild.xml");
//        Child child = context.getBean("child", Child.class);
//        System.out.println(" == " + child);
    }
}
