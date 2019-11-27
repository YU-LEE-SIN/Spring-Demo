package com.nf.ssm.dao;

import com.nf.ssm.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> pageListAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void insert(UserInfo userInfo);

    void deleteByDeptId(int deptid);

    void updateByid(UserInfo userInfo);
}
