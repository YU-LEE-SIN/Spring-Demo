package com.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

    public void before() {
        System.out.println("before执行*********");
    }

}
