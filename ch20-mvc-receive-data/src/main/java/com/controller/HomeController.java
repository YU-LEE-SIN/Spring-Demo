package com.controller;

import com.entity.Emp;
import com.entity.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

/**
 * spring mvc支持以下类型的数据绑定(dataBinder)
 *
 * 1.基本类型
 * 2.包装类型
 * 3.复杂类型(自己写的普通的bean)
 * 4.list
 * 5.map
 * 6.set
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/wrapper)")
    public String index(String pageNo, Integer pageSize) {
        System.out.println("pageNo = " + pageNo);
        System.out.println("pageSize = " + pageSize);
        return "index";
    }

    @GetMapping("/simple")
    public String index2(int pageNo){
        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }

    /**
     * 因为设置了value,所以传递的参数就以page为准,不以方法的参数名(pageNo)为准了
     * @param pageNo
     * @return
     */
    @GetMapping("/simple2")
    public String index3(@RequestParam(value = "size",required = false,defaultValue = "1")int pageNo){
        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }

    //复杂类型(自己写的普通的bean)
    @GetMapping("/complex")
    public String index(Emp emp){

        System.out.println("-----debug: emp = " + emp);
        return "index";
    }
    //利用PathVariable,就是从url路径上取得数据
    //http://localhost:8080/simple/page/123
    @GetMapping("/simple/page/{pageNo}")
    public String index4(@PathVariable("pageNo") int pageNo){
        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }

    @GetMapping("/list")
    public String index(EmpVO empVO){

        System.out.println("-----debug: empVO = " + empVO);
        return "index";
    }


    @GetMapping("/array")
    public String index(String[] name){

        System.out.println("-----debug: name = " + name);
        return "index";
    }

    /**
     * RequestMapping注解修饰的方法,支持以下一些类型作为参数
     * 比如:
     * 1.HttpServletRequest
     * 2.HttpServletResponse
     * 3.HttpSession等等
     * 具体就看官方文档:搜索HandlerMethod,去找表格
     * @param request
     * @return
     */
    @GetMapping("/req")
    public String index(HttpServletRequest request){
        return "index";
    }
}
