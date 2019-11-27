package com;

public class ServiceImpl {
    public void insert(){
        System.out.println("开始添加(insert)-----");
        throw new RuntimeException("异常");
    }
    public void update(){
        System.out.println("开始修改(update)-----");
    }

    public int add(int x,int y){
        System.out.println("add---------");
        return x + y;
    }
}
