package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDao extends BaseDao {
    public void deleteDeptById(int id){
        String sql="delete from dept where pk_id=?";
        jdbcTemplate.update(sql,id);
        System.out.println("deleteDeptById===succeed");
    }
}
