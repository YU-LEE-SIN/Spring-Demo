package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class DemoController {
    /**
     * url=http://lcolhost:8080/user/list
     * @return
     */
    @RequestMapping("/list")
    public String index(){
        return "demo";
    }
}
