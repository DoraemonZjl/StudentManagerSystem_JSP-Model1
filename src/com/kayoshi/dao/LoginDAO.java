package com.kayoshi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kayoshi.action.DbClose;
import com.kayoshi.model.Users;
import com.kayoshi.util.DBUtil;
import com.mysql.cj.xdevapi.Result;

public class LoginDAO {

	// 判断密码是否正确
	public boolean cheakLogin(String tbpassword, String bdpassword) {
		if (tbpassword != null) {
			if (tbpassword.equals(bdpassword)) {
				System.out.println("登录成功");
				return true;
			}
		}
		return false;
	}
}
