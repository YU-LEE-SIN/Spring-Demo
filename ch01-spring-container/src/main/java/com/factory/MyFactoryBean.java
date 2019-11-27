package com.factory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<A> {
    /**
     * 用来创建一个对象
     * @return A()对象
     * @throws Exception
     */
    @Override
    public A getObject() throws Exception {
        return new A();
    }
    /**
     * 这个方法是用来表明此工厂Bean创建出来的对象的class
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return A.class;
    }
    /**
     * 这个方法表明此工厂Bean创建出来的对象,在spinrg管理下的作用域
     * true表示是singleton
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
