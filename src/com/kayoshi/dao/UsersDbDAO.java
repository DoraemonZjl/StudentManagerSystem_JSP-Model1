package com.kayoshi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kayoshi.action.DbClose;
import com.kayoshi.model.Users;
import com.kayoshi.util.DBUtil;

public class UsersDbDAO {

	/*
	 ** (��¼����)�����û���д���û��������ݿ��жԱ���ȡ���Ӧ�����벢����(String����)
	 */
	public String gerUserpassword(Users user) throws SQLException {
		//���������״̬��ʾ
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			// �������ݿ�
			conn = DBUtil.getConn();
			// SQL��䲢��ִ�У�������ŵ�rs��
			String sql = "select * from tb_user where username=?";
			ptmt = conn.prepareStatement(sql);
			//��������������ͨ���û���ȡ�����룡��������������
			ptmt.setString(1, user.getUsername());
			rs = ptmt.executeQuery();
			if (rs.next()) {
				// �����µ�Users���ϣ����˻�������user������dologin.jsp����������
				return rs.getString("password");
			} else {
				return "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} finally {
			// ��װ�������ر�˳��rs->ptmt->conn
			DbClose close = new DbClose();
			close.Closeall( rs, ptmt,conn);
		}
	}

	/*
	 ** (ע������)
	 */
	public boolean registerUser(String username, String password) throws SQLException {
		// ���������״̬��ʾ
		Connection conn = null;
		Statement stmt = null;
		try {
			// �������ݿ�
			conn = DBUtil.getConn();
			String sql = "insert into tb_user (username,password) values('"+ username + "','" + password + "');";
			stmt = conn.createStatement();
			if (stmt.executeUpdate(sql)==1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			// ��װ�������ر�˳��rs->ptmt->conn
			DbClose close = new DbClose();
			close.Closeall(null, stmt, conn);
		}
	}
	
	
	
	
	/*
	 ** 
	 */
	
	
	
	/*
	 ** 
	 */
	
	
}
