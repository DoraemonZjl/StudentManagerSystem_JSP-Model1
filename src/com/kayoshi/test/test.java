package com.kayoshi.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.kayoshi.dao.StudentsDbDAO;
import com.kayoshi.dao.UsersDbDAO;
import com.kayoshi.model.Students;
import com.kayoshi.util.DBUtil;

public class test {
	public static void main(String[] args) throws SQLException {
		StudentsDbDAO s = new StudentsDbDAO();
		Students student = new Students();
		student.setStudentname("ฤฮหน");
		student.setStudentemail("@qq.com");
		System.out.println(s.addStudent(student));
	}
}
