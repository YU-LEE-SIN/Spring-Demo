package com.dao;

import com.entity.Dept;
import org.apache.ibatis.annotations.Select;

public interface DeptDao {
    @Select("select pk_id as id ,deptname from dept where pk_id=1")
    public Dept getById();
}
