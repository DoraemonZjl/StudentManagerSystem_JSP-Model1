package com.kayoshi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kayoshi.action.DbClose;
import com.kayoshi.model.Students;
import com.kayoshi.util.DBUtil;

public class StudentsDbDAO {

	/*
	 ** 在首页列出所有的学生所有信息.getStudentsAll();
	 */
	public ArrayList<Students> getStudentsAll() throws SQLException {
		// 定义变量做状态显示
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//创建ArrayList来保存从数据库中取出的所有学生数据集合
		ArrayList<Students> studentlist = new ArrayList<Students>();
		try{
			//连接数据库，取出所有学生信息并保存到rs
			conn = DBUtil.getConn();
			String sql = "select * from tb_student;";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				//创建新的学生类来依次保存每位学生的数据
				Students student = new Students();
				student.setStudentid(rs.getInt("Student_id"));
				student.setStudentname(rs.getString("Student_name"));
				student.setStudentsex(rs.getString("Student_sex"));
				student.setStudentage(rs.getInt("Student_age"));
				student.setStudentemail(rs.getString("Student_email"));
				student.setStudentclass(rs.getString("Student_class"));
				student.setStudentmobile(rs.getString("Student_mobile"));
				student.setStudentbirthday(rs.getString("Student_birthday"));
				studentlist.add(student);
			}
			return studentlist;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			//关闭
			DbClose close = new DbClose();
			close.Closeall(rs, stmt, conn);
		}
	}
	
	/*
	 **添加学生信息功能 
	 */
	public boolean addStudent(Students student) throws SQLException{
		// 定义变量做状态显示
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			// 连接数据库
			conn = DBUtil.getConn();
			String sql = "INSERT INTO tb_student (Student_name,Student_sex,Student_age,Student_email,Student_class,Student_mobile) "
					+ "VALUES (?,?,?,?,?,?)";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, student.getStudentname());
			ptmt.setString(2, student.getStudentsex());
			ptmt.setInt(3, student.getStudentage());
			ptmt.setString(4, student.getStudentemail());
			ptmt.setString(5, student.getStudentclass());
			ptmt.setString(6, student.getStudentmobile());
			result = ptmt.executeUpdate();
			if(result==1){
				System.out.println("添加成功");
				return true;
			}else{
				System.out.println("添加失败");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			DbClose close = new DbClose();
			close.Closeall(null, ptmt, conn);
		}	
	}

	
	/*
	 ** 
	 */
	
	
}
