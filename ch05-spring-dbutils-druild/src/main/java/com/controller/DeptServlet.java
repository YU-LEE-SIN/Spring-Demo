package com.controller;

import com.entity.Dept;
import com.service.DeptService;
import com.spring.ApplicationContextInstantiateListener;
import com.spring.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeptServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = ApplicationContextUtil.getApplicationContext(req);
        DeptService deptService = context.getBean("deptService", DeptService.class);
        Dept dept = deptService.getById();
    }
}