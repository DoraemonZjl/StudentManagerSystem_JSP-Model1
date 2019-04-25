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
<jsp:setProperty property="*" name="USERS"/>



<%
	//注册
	if(USERSDBDAO.registerUser(USERS.getUsername(), USERS.getPassword())==true){
		request.getRequestDispatcher("register_success.jsp").forward(request, response);
	}else{
		response.sendRedirect("register_failure.jsp");
	}
	
	
%>
