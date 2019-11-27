package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController4 {
    @GetMapping("/get")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("demo");
        mv.addObject("msg", "get");
        return mv;
    }
    @PostMapping("/post")
    public String index2(){
        return "demo";
    }
    @DeleteMapping("/delete")
    public String index3(){
        return "demo";
    }
    @PutMapping("/put")
    public String index4(){
        return "demo";
    }
    @PatchMapping("/patch")
    public String index5(){
        return "demo";
    }
}
