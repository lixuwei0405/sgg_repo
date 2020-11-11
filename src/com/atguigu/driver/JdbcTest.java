package com.atguigu.driver;

import com.atguigu.bean.Users;

import java.sql.*;
import java.util.Scanner;

public class JdbcTest {
    private final static String DRIVER_URL = "com.mysql.jdbc.Driver";
    private final static String DATABASE_URL = "jdbc:mysql:///day1110";
    private final static String USER_LOGIN = "root";
    private final static String PASSWORD_LOGIN = "root";

    static {
        try {
            Class.forName(DRIVER_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-------欢迎来到员工管理系统------");
            System.out.print("1：注册=========2.登录 请选择：");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("==========注册中心========\n");
                    System.out.print("请输入您的管理员账号：");
                    String usernmae = sc.next();
                    System.out.print("\n请输入您的管理员密码：");
                    String password = sc.next();
                    if (register(usernmae, password)) {
                        System.out.println("注册成功！");
                        break;
                    } else {
                        System.out.println("注册失败！");
                        break;
                    }
                case 2:
                    System.out.print("请输入您的管理员账号：");
                    String u = sc.next();
                    System.out.print("\n请输入您的管理员密码：");
                    String p = sc.next();
                    if (login(u, p)) {
                        System.out.println("登录成功！");
                        System.out.println("欢迎来到员工管理系统");
                        flag = false;
                    } else {
                        System.out.println("登录失败！");
                        break;
                    }

            }
        }


    }

    public static Boolean register(String username, String password) {
        Connection coll = null;
        Statement statement = null;
        try {
            coll = DriverManager.getConnection(DATABASE_URL, USER_LOGIN, PASSWORD_LOGIN);
            statement = coll.createStatement();
            String insetSql = "INSERT INTO users VALUES(null,'" + username + "','" + password + "')";
            int i = 0;
            if (!login(username, password)) {
                i = statement.executeUpdate(insetSql);
            } else {
                System.out.println("账号已存在！！换一个试试吧");
            }
            return i > 0 ? true : false;
        } catch (SQLException e) {
            System.err.println("服务器错误！");
            e.printStackTrace();
        } finally {
            try {
                if (coll != null)
                    coll.close();
                if (statement != null)
                    coll.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static Boolean login(String username, String password) {
        Connection coll = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            coll = DriverManager.getConnection(DATABASE_URL, USER_LOGIN, PASSWORD_LOGIN);
            statement = coll.createStatement();
            String querySql = "SELECT * FROM users WHERE username='" + username + "' and password='" + password + "'";
            resultSet = statement.executeQuery(querySql);
            Users users = null;
            if (resultSet.next())
                users = new Users(resultSet.getInt("id"), resultSet.getString("username"), resultSet.getString("password"));
            return users != null ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (coll != null)
                    coll.close();
                if (statement != null)
                    coll.close();
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
