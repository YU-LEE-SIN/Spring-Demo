package com.dao;

import com.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> getUserInfoByPage(@Param("pageNum") int pageNo, @Param("pageSize") int pageSize);
}
