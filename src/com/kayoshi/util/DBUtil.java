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
			//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//�������ݿ�
			conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			//�ж��Ƿ������������ݿ�
			if(conn!=null){
				System.out.println("��������");
			}else{
				System.out.println("����ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
