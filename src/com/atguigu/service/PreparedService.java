package com.atguigu.service;

import com.atguigu.bean.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreparedService {
    private final static String DATABASE_URI = "jdbc:mysql:///day1110?useUnicode=true&characterEncoding=utf8";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private final static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

    //    类加载的时候进行类加载
    static {
        try {
            Class.forName(MYSQL_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Users> QueryList(){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
//        获取连接对象
        try {
           connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
           preparedStatement = connection.prepareStatement("select * from users");
           resultSet = preparedStatement.executeQuery();
           List<Users> list = new ArrayList<Users>();
           while (resultSet.next()){
               Users users = new Users(resultSet.getInt("id") ,resultSet.getString("username"),resultSet.getString("password"));
               list.add(users);
           }
           return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
           closeAll(connection,preparedStatement,resultSet);
        }
        return null;
    }
    public boolean add(Users users){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
//        获取连接对象
        int i = 0;
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("insert into users values (null,?,?)");
            preparedStatement.setString(1, users.getUsername());
            preparedStatement.setString(2, users.getPassword());
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,preparedStatement,resultSet);
        }
        return i>0?true:false;
    }

    public boolean updateLine(String username,String password){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
//        获取连接对象
        int i = 0;
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("update users set password=? where username=?");
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,preparedStatement,resultSet);
        }
        return i>0?true:false;
    }

    public boolean delOne(String username){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
//        获取连接对象
        int i = 0;
        try {
            connection = DriverManager.getConnection(DATABASE_URI, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("delete from users where username like ?");
            preparedStatement.setString(1, username);
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,preparedStatement,resultSet);
        }
        return i>0?true:false;
    }

    public void closeAll( Connection connection,PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(connection!=null)
                connection.close();
            if(preparedStatement!=null)
                preparedStatement.close();
            if (resultSet!=null)
                resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
