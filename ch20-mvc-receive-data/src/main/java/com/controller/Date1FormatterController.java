package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * Spring自带的日期处理方式有2种方式
 * 第一种方式:
 * a) 在spring的元数据xml文件中,添加mvc:annotation-driven(会添加ConversionService,里面拥有默认的converter与Formatter)
 * b) 在相关的处理方法参数上加上@DateTimeFormat注解,并设置pattern
 */
@Controller
public class Date1FormatterController {
    /**
     * ConversionService:方便使用转换,因为有各种各样的转换机制(converter,formatter,注解),
     *     conversionService内部把所有这些转换服务全部转变成converter,便于使用.
     */
    @Autowired
    private ConversionService conversionService;

    @GetMapping("/date")
    public String receiceDate(@DateTimeFormat(pattern = "yyy-mm-dd") Date date) {
        System.out.println("-----debug: conversionService = " + conversionService);
        System.out.println("-----debug: date = " + date);
        return "index";
    }
}
