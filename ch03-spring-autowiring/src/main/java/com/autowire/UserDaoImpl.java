package com.autowire;

public class UserDaoImpl implements UserDao{

    @Override
    public void insert() {
        System.out.println("insert into userDaoImpl");
    }
}
