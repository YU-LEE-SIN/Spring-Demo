package com.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextInstantiateListener implements ServletContextListener {
    public static final String SPRING_CONTAINER_KEY = "SPRING_CONTAINER";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String configFille = servletContext.getInitParameter("configFile");
        ApplicationContext context = new ClassPathXmlApplicationContext(configFille);
        servletContext.setAttribute(SPRING_CONTAINER_KEY,context);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
