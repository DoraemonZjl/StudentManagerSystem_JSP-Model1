<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@page import="com.kayoshi.dao.*"%>
<%@page import="com.kayoshi.model.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<jsp:useBean id="USERS" scope="page" class="com.kayoshi.model.Users"/>
<jsp:useBean id="USERSDBDAO" scope="page" class="com.kayoshi.dao.UsersDbDAO"/>
<jsp:useBean id="LOGINDAO" scope="page" class="com.kayoshi.dao.LoginDAO"/>
<jsp:setProperty property="*" name="USERS"/>


<%@ include file="dologin_cookie.jsp" %>

<%
	/*
	**登录功能
	*/
	//保存用户输入的密码
	String tbpassword = USERS.getPassword();
	//根据用户输入的用户名,取出数据库中已有的密码
	String dbpassword = USERSDBDAO.gerUserpassword(USERS);
	//用户输入的的密码与数据库中的密码进行对比，如匹配则登录成功
	  if (LOGINDAO.cheakLogin(tbpassword, dbpassword)) {
		request.getRequestDispatcher("system_index.jsp").forward(request, response);
	} else {
		response.sendRedirect("login_failure.jsp");
	}
	
	/*
	**
	*/
	
%>
