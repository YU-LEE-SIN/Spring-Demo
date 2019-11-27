package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> clzes, ServletContext ctx) throws ServletException {
        //方式一
    /*    ServletRegistration.Dynamic servletRegistration =
                ctx.addServlet("first", new FirstServlet());
        servletRegistration.addMapping("/first");
        */
        for (Class<?> clz : clzes) {
            //就是判断传递过来的类型是否是MyAppInitializer的实现类
            //因为HandleTypes可以填多个类型
            if (MyAppInitializer.class.isAssignableFrom(clz)) {
                try {
                    MyAppInitializer instatnce = (MyAppInitializer) clz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
