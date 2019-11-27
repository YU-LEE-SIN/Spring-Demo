package com.dao.impl;

import com.dao.UserInfoDao;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDao2 implements UserInfoDao {
    @Override
    public void update() {
        System.out.println("update int UserInfoDao2");
    }
}
