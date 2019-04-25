<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@page import="com.kayoshi.dao.*"%>
<%@page import="com.kayoshi.model.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="STUDENT" scope="page" class="com.kayoshi.model.Students"/>
<jsp:useBean id="STUDENTDAO" scope="page" class="com.kayoshi.dao.StudentsDbDAO"/>
<jsp:setProperty property="*" name="STUDENT" />

<%
	
	/*
	**
	*/
	if(STUDENTDAO.addStudent(STUDENT)){
		request.getRequestDispatcher("system_index.jsp").forward(request, response);
	}else{
		out.print("添加信息失败，请重新返回添加");
	}
	
	
	
	
%>
