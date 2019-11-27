package com.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aware.xml");
        SomeBean bean = context.getBean("someBean", SomeBean.class);

        ApplicationContext context2 = bean.getContext();

        System.out.println(context == context2);

    }
}
