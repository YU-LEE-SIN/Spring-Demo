package com.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDao {
    public int deleteDeptById(Connection conn, int id){
        String sql="delete from dept where pk_id=?";
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
