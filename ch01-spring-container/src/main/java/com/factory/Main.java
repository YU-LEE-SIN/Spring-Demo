package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factory.xml");
        // 第一种静态方法
        context.getBean("factory", A.class);
       /* // 第二种实例方法
        A instance = context.getBean("factory2", A.class);
        System.out.println("instance = " + instance);
        System.out.println("==2=="+instance.getClass().getName());
        // 第三种实例方法
        A instance2 = context.getBean("factory3", A.class);
        System.out.println("instance2 = " + instance2);
        System.out.println("==3=="+instance2.getClass().getName());*/
    }
}
