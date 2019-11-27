package com.practice;

import org.springframework.web.context.ContextLoaderListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private static String DRIVER="com.mysql.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/demo";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            new ClassCastException("驱动加载失败");
        }
    }
    public static Connection getConnection(){
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            new SQLException("连接失败");
        }
        return  conn;
    }
}
