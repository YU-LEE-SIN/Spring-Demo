package com.service;

import com.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> pageListAll(int pageNum, int pageSize);

    void insert(UserInfo userInfo);

    void deleteByDeptId(int deptid);

    void updateByid(UserInfo userInfo);
}
