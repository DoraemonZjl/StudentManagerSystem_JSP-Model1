package com.kayoshi.model;

public class Students {
	
	//创建学生模型Javabean
	private int studentid;				//学生编号
	private String studentname;		//学生名字
	private String studentsex;			//学生性别
	private int studentage;			//学生年龄
	private String studentemail;		//学生邮箱
	private String studentclass;		//学生班级
	private String studentmobile;		//学生手机
	private String studentbirthday;	//学生出生日期
	
	public Students(){
		
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentsex() {
		return studentsex;
	}

	public void setStudentsex(String studentsex) {
		this.studentsex = studentsex;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public String getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}

	public String getStudentmobile() {
		return studentmobile;
	}

	public void setStudentmobile(String studentmobile) {
		this.studentmobile = studentmobile;
	}

	public String getStudentbirthday() {
		return studentbirthday;
	}

	public void setStudentbirthday(String studentbirthday) {
		this.studentbirthday = studentbirthday;
	}

	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + ", studentsex=" + studentsex
				+ ", studentage=" + studentage + ", studentemail=" + studentemail + ", studentclass=" + studentclass
				+ ", studentmobile=" + studentmobile + ", studentbirthday=" + studentbirthday + "]";
	}

	

	

	
	
	
	
	
	
	
	
	
}
