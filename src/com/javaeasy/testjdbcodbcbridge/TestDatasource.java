package com.javaeasy.testjdbcodbcbridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.Class.forName;

public class TestDatasource {
    public static void main(String[] args) throws SQLException {
        String user = "root";
        String password = "mysql";
        String url = "jdbc:mysql://localhost:3306/sqltest";   //需要连接的数据库名称
        String driver = "com.mysql.jdbc.Driver";      //需要加载的数据库驱动类
        //加载数据库驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e){
            System.out.println("无法加载数据库驱动。");
            e.printStackTrace();
        }
        //创建数据库连接
        Connection conn  = null;
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e){
            System.out.println("创建数据库连接出错：");
            e.printStackTrace();
        }
        if (conn == null) {
            System.out.println("无法创建数据库链接。");
        } else {
            System.out.println("数据库创建成功");
            conn.close();
        }
    }
}
