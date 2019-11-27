package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextInstantiateListener implements ServletContextListener {
    public static final String SPRING_CONTAINER_KEY = "SPRING_CONTAINER";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext = servletContextEvent.getServletContext();
        //放进作用域
        servletContext.setAttribute(SPRING_CONTAINER_KEY,context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
