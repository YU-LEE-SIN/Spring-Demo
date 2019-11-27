package com.factory;

public class AFactory {

    private static A ainstance =new A();
    /**
     * 返回一个A（）对象
     * @return
     */
    public static A createA(){
        return ainstance;
    }
    public A createB(){
        return new A();
    }

}
