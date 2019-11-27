package com.controller;

import com.entity.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserInfoService service;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<UserInfo> list(
            @RequestParam(value = "pageNum", defaultValue = "1", required = false) int pageNum,
            @RequestParam(value = "pageSize", defaultValue = "3", required = false) int pageSize) {

        return service.pageListAll(pageNum, pageSize);
    }
}
