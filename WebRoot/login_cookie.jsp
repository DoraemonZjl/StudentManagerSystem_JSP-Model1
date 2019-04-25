<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String username = "";
	String password = "";
	//cookie记住用户名和密码
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (Cookie c : cookies) {
			if (c.getName().equals("username")) {
				username = c.getValue();
			}
			if (c.getName().equals("password")) {
				password = c.getValue();
			}
		}
	}
%>