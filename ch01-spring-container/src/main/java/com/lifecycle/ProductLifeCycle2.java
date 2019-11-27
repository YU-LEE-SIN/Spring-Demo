package com.lifecycle;

public class ProductLifeCycle2 {
    public void init(){
        System.out.println("这个类的初始化代码1，全局的初始化方法");
    }

    public void destroy(){
        System.out.println("销毁");
    }

    private void init2() {
        System.out.println("这个类的初始化代码2，设置了init-method");
    }
}
