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
	 ** ����ҳ�г����е�ѧ��������Ϣ.getStudentsAll();
	 */
	public ArrayList<Students> getStudentsAll() throws SQLException {
		// ���������״̬��ʾ
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//����ArrayList����������ݿ���ȡ��������ѧ�����ݼ���
		ArrayList<Students> studentlist = new ArrayList<Students>();
		try{
			//�������ݿ⣬ȡ������ѧ����Ϣ�����浽rs
			conn = DBUtil.getConn();
			String sql = "select * from tb_student;";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				//�����µ�ѧ���������α���ÿλѧ��������
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
			//�ر�
			DbClose close = new DbClose();
			close.Closeall(rs, stmt, conn);
		}
	}
	
	/*
	 **���ѧ����Ϣ���� 
	 */
	public boolean addStudent(Students student) throws SQLException{
		// ���������״̬��ʾ
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			// �������ݿ�
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
				System.out.println("��ӳɹ�");
				return true;
			}else{
				System.out.println("���ʧ��");
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
