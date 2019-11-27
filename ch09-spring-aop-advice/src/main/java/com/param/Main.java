package com.param;

import com.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-param.xml");
        ServiceImpl service = ctx.getBean("serivce", ServiceImpl.class);
        int result = service.add(6, 6);
        System.out.println("result====="+result);
    }
}
