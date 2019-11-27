package com;

import com.service.UserInfoService;
import com.service.impl.UserInfoServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionTest {
    @Test
    public void testAnnoIoc(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInfoServiceImpl service = ctx.getBean(UserInfoServiceImpl.class);
        System.out.println(service);
        service.update();
        service.displayAutowireCollectionInject();
    }
}
