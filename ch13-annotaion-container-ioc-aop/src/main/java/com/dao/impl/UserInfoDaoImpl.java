package com.dao.impl;

import com.dao.UserInfoDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public void update() {
        System.out.println("update in UserInfoImpl----");
    }
}
