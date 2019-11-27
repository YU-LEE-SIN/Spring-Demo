package com.log;


import org.aspectj.lang.ProceedingJoinPoint;

public class Log {
    public void printLog(){
        System.out.println("打印日志！@！@！@！");
    }

    public Object aroundAdivce(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Object[] arr=joinPoint.getArgs();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("页码="+arr[i]);
        }
        return result;
    }
}
