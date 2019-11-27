package com.service.impl;

import config.ann.AnnoSupportConfig;
import config.ann.AnnoSupportTxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserInfoServiceImplTest {

    @Test
    public void update() {
        ApplicationContext context =new AnnotationConfigApplicationContext(AnnoSupportConfig.class);
        UserInfoServiceImpl service = context.getBean(UserInfoServiceImpl.class);
        service.update();
    }
}