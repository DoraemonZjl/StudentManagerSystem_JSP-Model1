package com.kayoshi.model;

public class Students {
	
	//����ѧ��ģ��Javabean
	private int studentid;				//ѧ�����
	private String studentname;		//ѧ������
	private String studentsex;			//ѧ���Ա�
	private int studentage;			//ѧ������
	private String studentemail;		//ѧ������
	private String studentclass;		//ѧ���༶
	private String studentmobile;		//ѧ���ֻ�
	private String studentbirthday;	//ѧ����������
	
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
