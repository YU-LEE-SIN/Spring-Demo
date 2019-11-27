package com.practice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;

public class Advices implements MethodInterceptor {
    private Connection conn;
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        conn.setAutoCommit(false);
        Object result = methodInvocation.proceed();
        conn.commit();
        conn.setAutoCommit(true);
        conn.close();
        return result;
    }
}
