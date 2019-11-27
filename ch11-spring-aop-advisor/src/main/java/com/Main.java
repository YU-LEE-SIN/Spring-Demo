package com;

import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = ctx.getBean("userService", UserService.class);
        int result=service.add(6, 6);
        System.out.println("result=="+result);
    }
}
