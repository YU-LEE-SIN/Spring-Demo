package com.dao;

import com.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoDao {

    List<UserInfo> pageListAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void insert(UserInfo userInfo);

    void deleteByDeptId(int deptid);

    void updateByid(UserInfo userInfo);
}
