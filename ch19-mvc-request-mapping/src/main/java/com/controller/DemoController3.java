package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController3 {
    /**
     * 这个方法只用来处理get请求,请求的地址为/index
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    /**
     * 这个方法只用来处理post请求,请求的地址为/index2
     * @return
     */
    @RequestMapping(value = "/index2",method = RequestMethod.POST)
    public String index2(){
        return "index";
    }
    /**
     * 下面的这个配置意思是:
     * 1.请求地址为/index3
     * 2.请求必须有参数a并且值为1
     * 3.请求头部必须有b,并且值为2
     * 4.请求accept里面必须有application/json:表示本处理方法必须响应application/json的内容
     * 5.请求必须传递的是text/html内容类型的数据
     * 满足这5个条件,此方法才会处理这样的请求
     * @return
     */
    @RequestMapping(value = "index3",
    params = "a=1",
    headers = "b=2",
    produces = "application/json",
    consumes = "text/html")
    public String index3(){
        return "index";
    }
}