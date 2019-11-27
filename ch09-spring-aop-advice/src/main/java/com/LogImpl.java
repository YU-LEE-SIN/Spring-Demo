package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

/**
 * JoinPoint参数类型是一个比较特殊的类型,所有的通知方法的
 *   第一个参数如果是JoinPoint类型,会自动帮你传进来.
 *
 *   所有的通知方法默认spring都会传递一个参数给你,就是JoinPoint类型
 *   而且这个参数只能通知方法的第一个参数.
 */
public class LogImpl {

    public void before(JoinPoint joinPoint) {
        System.out.println("----" + joinPoint);
        System.out.println("before执行*********");
    }
    public void after() {
        System.out.println("after执行*********");
    }

    /**
     * 返回后
     */
    public void afterReturn() {
        System.out.println("after return执行*********");
    }

    /**
     * 出现异常后执行
     * 业务类的异常类型和下面的异常类型要相同或者是子类
     * 否则不会执行
     * @param re
     */
    public void throwAdvice(Exception re){
        System.out.println("-----debug: re = " + re);
        System.out.println("throwAdvice*********");
    }

    /**
     环绕通知的参数类型是ProceedingJointPoint类型
     * 它是JoinPoint的子类型
     *
     * 但环绕通知的参数不能写为JoinPoint类型
     *
     * 如果方法有返回值，就在下面加返回值。
     * @param joinPoint
     * @throws Throwable
     */
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        Object result=null;
        System.out.println("aroundAdvice before*********");
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
           result = joinPoint.proceed();
            //System.out.println("aroundAdvice return********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw *********");
        }
        System.out.println("aroundAdvice after*********");
        return result;
    }

    public Object aroundAdvice2(ProceedingJoinPoint joinPoint)  {
       Object result=null;
        System.out.println("aroundAdvice2 before2********");
        //这个代码是让目标方法执行,不调用会导致目标方法不执行
        try {
            result=joinPoint.proceed();
            //System.out.println("aroundAdvice2 return********");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("aroundAdvice throwable2********");
        }
        System.out.println("aroundAdvice2 after******");
        return result;
    }
}
