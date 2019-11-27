package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitialzerImpl implements MyAppInitializer {
    @Override
    public void dangQiDongShi(ServletContext sc) {
        ServletRegistration.Dynamic servletRegistration =
                sc.addServlet("xx", new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
