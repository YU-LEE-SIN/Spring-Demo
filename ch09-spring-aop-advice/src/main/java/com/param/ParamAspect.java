package com.param;

import org.aspectj.lang.ProceedingJoinPoint;

public class ParamAspect {
    public void before(int x, int y) {
        System.out.println("-----debug: m = " + x);
        System.out.println("-----debug: n = " + y);
    }

    public Object aroundParam(ProceedingJoinPoint joinPoint){
        Object result=null;
        //执行目标方法
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Object[]arr=joinPoint.getArgs();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("param==="+arr[i]);
        }
        return result;
    }
}
