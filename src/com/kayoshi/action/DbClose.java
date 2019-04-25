package com.kayoshi.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbClose {
		
	// ¹Ø±Õrs,ptmt,conn
	public void Closeall(ResultSet rs,PreparedStatement ptmt,Connection conn) throws SQLException{

		if (rs != null) {
			rs.close();
			rs = null;
		}
		if (ptmt != null) {
			ptmt.close();
			ptmt = null;
		}
		if (conn != null) {
			conn.close();
			conn = null;
		}
	}
	
	// ¹Ø±Õstmt,conn
	public void Closeall(ResultSet rs,Statement stmt,Connection conn) throws SQLException{
		if (rs != null) {
			rs.close();
			rs = null;
		}
		if (stmt != null) {
			stmt.close();
			stmt = null;
		}
		if (conn != null) {
			conn.close();
			conn = null;
		}
	}
	
}
