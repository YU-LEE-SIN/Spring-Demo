package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Spring自带的日期处理方式有2种方式
 * 第二种方式:
 *     a) 在处理方法参数上"不"加DateTimeFormat注解
 *     b) 直接利用在xml中配置或是InitBinder注解添加日期格式化器DateFormatter
 *     c) 这种方式不需要在xml中添加mvc:annotation-driven
 */
@Controller
public class Date2FormatterController {
    @Autowired(required = false)
    private ConversionService conversionService;

    /**
     * InitBinder注解对绑定器做的设定,只在本控制器有效,
     * 也就是说只对本控制器的所有请求方法是有效的,但是对其它控制器的
     * 请求方法是无效
     * <p>
     * 所以需要掌握如何注册全局的格式化器.
     * 1.利用ControllerAdvice注解
     * 2.在spring 配置元数据中设定
     *
     * 如果既添加了DateFormatter也加了@DateTimeFormat注解,以添加的DateFormatter为准
     * @param dataBinder
     */
    @InitBinder
    public void xxxx( WebDataBinder dataBinder) {
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        dataBinder.addCustomFormatter(dateFormatter);
    }
}
