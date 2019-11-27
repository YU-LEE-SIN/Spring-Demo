package com.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public int deleteUserById(Connection conn, int id){
        String sql="delete from userinfo where pk_id=?";
        int row=0;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            row=stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }
}
