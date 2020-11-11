package com.atguigu.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo2 {
    private final static String DATABASE_URI = "jdbc:mysql:///test?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private final static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ppst =null;
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
            ppst = connection.prepareStatement("update employee set age=? where name=?");
            ppst.setInt(1, 78);
            ppst.setString(2, "小红");
            ppst.executeUpdate();
            int i = 10 /0;
            ppst.setInt(1,90);
            ppst.setString(2, "小白");
            ppst.executeUpdate();
            connection.commit();


        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            closeAll(connection,ppst);
        }
    }
    public static void closeAll(Connection connection, PreparedStatement preparedStatement){
        try {
            if(connection!=null)
                connection.close();
            if(preparedStatement!=null)
                preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
