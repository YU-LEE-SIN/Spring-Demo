package com.dao;

import com.aspect.MyAspect;
import com.entity.UserOne;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserOneDao {
    List<UserOne> getPageAll(@Param("pageNum") int pageNo, @Param("pageSize") int pageSize);
}
