package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/success")
    public String index2(){
        return "login";
    }

    @PostMapping("/verify")
    public String index2(HttpServletRequest req , HttpSession session){
        String pwd = req.getParameter("password");
        System.out.println("pwd = " + pwd);
        String user = req.getParameter("username");
        System.out.println("user = " + user);

        if ("123".equalsIgnoreCase(pwd) && "123".equalsIgnoreCase(pwd)){
            session=req.getSession();
            session.setAttribute("uname",user);
            return "forward:success";
        }else{
            return "forward:index";
        }
    }
}
