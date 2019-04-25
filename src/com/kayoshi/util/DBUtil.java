package com.kayoshi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConn() {
		String URL = "jdbc:mysql://127.0.0.1/studentmanagersystem?serverTimezone=UTC";
		String USER = "root";
		String PASSWORD = "kayoshi";
		Connection conn = null;
		try {
			//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//连接数据库
			conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			//判断是否正常连接数据库
			if(conn!=null){
				System.out.println("连接正常");
			}else{
				System.out.println("连接失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
