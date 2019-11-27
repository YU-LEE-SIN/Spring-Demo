package com.nf.ssm.service.impl;

import com.nf.ssm.dao.DeptDao;
import com.nf.ssm.dao.UserInfoDao;
import com.nf.ssm.service.DeptService;
import com.nf.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional
    @Override
    public void deleteByid(int id) {
        userInfoDao.deleteByDeptId(id);
        deptDao.deleteByid(id);
    }
}
