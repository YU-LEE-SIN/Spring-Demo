package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;


public class UserInfoDao extends BaseDao {
    public void deleteUserById(int id) {
        String sql="delete from userinfo where dept_id=?";
        jdbcTemplate.update(sql, id);
        System.out.println("deleteUserById===succeed");
    }
}
