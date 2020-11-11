package com.atguigu.prepared;

import com.atguigu.service.PreparedService;

import java.sql.*;

public class Demo1 {
    private final static String DATABASE_URI = "jdbc:mysql:///test?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private final static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    /**
     * 测试给数据库中添加50000条数据
     * @param args
     */
    public static void main1(String[] args) {
        long start  = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement ppst =null;
//        获取连接对象
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            ppst = connection.prepareStatement("insert into student values(null,?,?,?,?,'北京')");
            for (int i = 1 ; i <= 50000; i++) {
                ppst.setString(1, "java"+i);
                ppst.setString(2, i%2==0?"男":"女");
                ppst.setString(3, "2020-11-11");
                ppst.setString(4, "尚硅谷"+i);
                ppst.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,ppst);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 未开通批处理，且直接添加数据，
     * @param args
     */
    public static void main(String[] args) {
        long start  = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement ppst =null;
//        获取连接对象
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            ppst = connection.prepareStatement("insert into student values(null,?,?,?,?,'北京')");
            for (int i = 1 ; i <= 50000; i++) {
                ppst.setString(1, "java"+i);
                ppst.setString(2, i%2==0?"男":"女");
                ppst.setString(3, "2020-11-11");
                ppst.setString(4, "尚硅谷"+i);
                ppst.addBatch();
                if(i%500==0){
                    ppst.executeBatch();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,ppst);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
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
