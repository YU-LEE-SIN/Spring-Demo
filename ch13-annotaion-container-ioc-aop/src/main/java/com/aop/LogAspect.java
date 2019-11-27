package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component //表明被spring 管理起来
@Aspect // 表明此类是切面类
public class LogAspect {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointCut() {
    }

    @Before("myPointCut()")
    public void before() {
        System.out.println("before******");
    }

    @After("myPointCut()")
    public void after() {
        System.out.println("after******");
    }

    @AfterReturning(pointcut = "myPointCut()", returning = "ret")
    public void afterReturning(RuntimeException ret) {
        System.out.println("afterReturning******" + ret);
    }

    @AfterThrowing(pointcut = "myPointCut()", throwing = "re")
    public void afterThrowing(RuntimeException re) {
        System.out.println("afterThrowing******" + re);
    }
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result=null;
        System.out.println("before around******" );
        try {
            result=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
