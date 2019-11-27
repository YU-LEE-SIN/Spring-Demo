package com.practice;

import java.sql.Connection;

public class UserService {
    private DeptDao deptDao;
    private UserDao userDao;
    public int deleteDeptById(Connection conn, int id){
        return deptDao.deleteDeptById(conn, id);
    }
    public int deleteUserById(Connection conn, int id){
        return userDao.deleteUserById(conn, id);
    }
}
