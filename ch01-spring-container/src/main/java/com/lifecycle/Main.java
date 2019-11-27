package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent-lifecycle.xml");

        //ProductLifeCycle productLifeCycle1 = context.getBean("lifeCycle1", ProductLifeCycle.class);
        //自定义 init-method
        //ProductLifeCycle2 productLifeCycle2 = context.getBean("lifeCycle2", ProductLifeCycle2.class);
        //销毁
        //((ConfigurableApplicationContext)context).close();
    }
}
