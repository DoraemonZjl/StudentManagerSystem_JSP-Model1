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
	 ** (登录需求)根据用户填写的用户名在数据库中对比提取相对应的密码并返回(String类型)
	 */
	public String gerUserpassword(Users user) throws SQLException {
		//定义变量做状态显示
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			// 连接数据库
			conn = DBUtil.getConn();
			// SQL语句并且执行，将结果放到rs集
			String sql = "select * from tb_user where username=?";
			ptmt = conn.prepareStatement(sql);
			//！！！！！！！通过用户名取出密码！！！！！！！！
			ptmt.setString(1, user.getUsername());
			rs = ptmt.executeQuery();
			if (rs.next()) {
				// 创建新的Users集合，将账户密码存进user，返回dologin.jsp做函数参数
				return rs.getString("password");
			} else {
				return "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} finally {
			// 封装函数，关闭顺序rs->ptmt->conn
			DbClose close = new DbClose();
			close.Closeall( rs, ptmt,conn);
		}
	}

	/*
	 ** (注册需求)
	 */
	public boolean registerUser(String username, String password) throws SQLException {
		// 定义变量做状态显示
		Connection conn = null;
		Statement stmt = null;
		try {
			// 连接数据库
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
			// 封装函数，关闭顺序rs->ptmt->conn
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
