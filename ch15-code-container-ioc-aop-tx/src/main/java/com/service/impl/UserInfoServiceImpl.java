package com.service.impl;

import com.dao.UserInfoDao;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao dao;

    public void SetDao(UserInfoDao dao) {
        this.dao = dao;
    }

    @Override
    public void update() {
        dao.update();
    }
}
