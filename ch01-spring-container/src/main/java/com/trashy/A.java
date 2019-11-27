package com.trashy;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 首先实例化
 * 进行装配,注参数
 * 执行afterPropertiesSet
 * 再执行init()
 */
public class A implements InitializingBean, FactoryBean {
    private B b;
    private C c;

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", c=" + c +
                '}';
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public void init(){
        System.out.println("这个类的初始化代码1，全局的初始化方法");
    }

    public void destroy(){
        System.out.println("销毁");
    }
    @Override
    public Object getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("设置属性之后after properties set : init");
    }
}
