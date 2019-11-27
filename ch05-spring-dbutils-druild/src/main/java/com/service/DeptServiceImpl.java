package com.service;

import com.dao.DeptDao;
import com.entity.Dept;

public class DeptServiceImpl implements DeptService {
    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    private DeptDao deptDao;
    @Override
    public Dept getById() {
        return deptDao.getById();
    }
}
