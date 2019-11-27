package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellorController {
    @RequestMapping("index")
    public String handle(){
        System.out.println("index==handler==");
        //如果视图解析器不配置前缀后缀，这里可以先完整路径
        return "hello";
    }
    @RequestMapping("/indexTwo")
    public String handleTwo(){
        System.out.println("index==handler==");
        return "helloTwo";
    }
    @RequestMapping("/indexThree")
    public ModelAndView handlerThree(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("msg", "Spring MVC ModeAndView");
        return mav;
    }
}
