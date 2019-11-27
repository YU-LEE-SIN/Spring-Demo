package com.service.impl;

import com.dao.UserInfoDao;
import com.entity.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao dao;

    @Override
    public List<UserInfo> pageListAll(int pageNum, int pageSize) {
        return dao.pageListAll(pageNum, pageSize);
    }

    @Override
    public void insert(UserInfo userInfo) {

    }

    @Override
    public void deleteByDeptId(int deptid) {

    }

    @Override
    public void updateByid(UserInfo userInfo) {

    }
}
