package com.controller;

import com.service.DeptService;
import com.spring.ApplicationContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dept")
public class DeptServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeptService service = ApplicationContextHolder.getBean("deptService", DeptService.class);
        System.out.println(service.getById());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}