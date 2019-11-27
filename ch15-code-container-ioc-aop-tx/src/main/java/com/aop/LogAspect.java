package com.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointCut(){}

    @Before("myPointCut()")
    public void before(){
        System.out.println("before----");
    }
    @After("myPointCut()")
    public void after(){
        System.out.println("after----");
    }
}
