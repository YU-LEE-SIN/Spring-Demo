package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/view")
public class ViewDemoController {
    ///转发到视图
    @RequestMapping("demo")
    public String demo1(Model model){
        model.addAttribute("f", "/view/demo");
        return "index";
    }

    @RequestMapping("demo2")
    public ModelAndView demo2(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("f", "/view/demo2");
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request){
        request.setAttribute("f","/view/demo3");
        return "forward:index";
    }

    ///重定向(redirect)
    @RequestMapping("demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("f", "/view/demo4");
        return "redirect:dis";
    }

    @RequestMapping("demo5")
    public RedirectView demo5(){
        RedirectView rv = new RedirectView("dis");
        return rv;
    }
    @RequestMapping("/dis")
    public String demos4() {
        return "index";
    }
}
