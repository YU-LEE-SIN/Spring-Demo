package com.service;

import com.dao.DeptDao;
import com.entity.Dept;

public class DeptServiceImpl implements DeptService {

    private DeptDao deptDao;
    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
    @Override
    public Dept getById() {
        return deptDao.getById();
    }
}
