package com.controller;

import com.entity.UserInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.service.UserInfoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userList")
public class UserInfopageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        UserInfoServiceImpl service = ctx.getBean("userInfoService", UserInfoServiceImpl.class);
        int pageNum = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
        int pageSize = req.getParameter("pageSize") == null ? 3 : Integer.parseInt(req.getParameter("pageSize"));
        Page<UserInfo> userInfoList = (Page<UserInfo>) service.getUserInfoByPage(pageNum, pageSize);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList,4);
        System.out.println(userInfoList);
        req.setAttribute("pageInfo", pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
