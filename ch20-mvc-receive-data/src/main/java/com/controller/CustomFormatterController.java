package com.controller;

import com.entity.Emp;
import com.entity.TestEntity;
import com.formatter.EmpFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/formatter")
public class CustomFormatterController {

    @InitBinder
    public void xxxx(WebDataBinder dataBinder) {
        dataBinder.addCustomFormatter(new EmpFormatter());
        dataBinder.addCustomFormatter(new DateFormatter());
    }
    /**
     * 请求地址 :/formatter/emp?xxx=yu,ge就可以转换成功
     * 通过指定RequestParam就明确表明把请求参数中xxx的值转换为一个Emp
     * 这是必须指定的,否则会导致Emp类型无法绑定,也就用不到自定义的Formatter了
     * @param entity
     * @return
     */
    @GetMapping("/emp")
    public String receiveEmp(@RequestParam("xxx") Emp entity){
        System.out.println("-----debug: emp = " + entity);
        return "index";
    }
}
