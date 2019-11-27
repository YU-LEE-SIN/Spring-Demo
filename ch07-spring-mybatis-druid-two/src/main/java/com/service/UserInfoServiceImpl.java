package com.service;

import com.dao.UserInfoDao;
import com.entity.UserInfo;

import java.util.List;

public class UserInfoServiceImpl implements UserInfoService{
    private UserInfoDao userInfoDao;

    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    @Override
    public List<UserInfo> getUserInfoByPage(int pageNo, int pageSize) {
        return userInfoDao.getUserInfoByPage(pageNo, pageSize);
    }
}