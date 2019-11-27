package com.dao;

import com.entity.Dept;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DeptDaoImpl implements DeptDao {
    private QueryRunner queryRunner ;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Dept getById()  {
        String sql = "select pk_id as id ,deptname from dept where pk_id=1";
        BeanHandler<Dept> deptBeanHandler = new BeanHandler<>(Dept.class);
        Dept dept = null;
        try {
            dept = queryRunner.query(sql, deptBeanHandler);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("query faild...");
        }
        return dept;
    }
}