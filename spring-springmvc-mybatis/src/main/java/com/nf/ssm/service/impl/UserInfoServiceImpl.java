package com.nf.ssm.service.impl;

import com.nf.ssm.dao.UserInfoDao;
import com.nf.ssm.entity.UserInfo;
import com.nf.ssm.service.UserInfoService;
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
        dao.insert(userInfo);
    }

    @Override
    public void deleteByDeptId(int deptid) {

    }

    @Override
    public void updateByid(UserInfo userInfo) {

    }
}
