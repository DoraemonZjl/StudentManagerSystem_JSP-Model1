<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	/*
	**Cookie记住登录三天
	*/
	//判断你是否有勾选Cookie框
	String[] isUseCookie = request.getParameterValues("isUseCookie");
	if (isUseCookie != null && isUseCookie.length > 0) {
		//创建username和password的cookie，并将数据绑定到cookie
		Cookie usernameCookie = new Cookie("username", USERS.getUsername());
		Cookie passwordCookie = new Cookie("password", USERS.getPassword());
		//设置cookie的生存周期
		usernameCookie.setMaxAge(259200);
		passwordCookie.setMaxAge(259200);
		//将数据保存到cookie
		response.addCookie(usernameCookie);
		response.addCookie(passwordCookie);
	} else {
		//如果表单没有读到cookie则尝试读取本地是否有cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			//遍历所有cookie且将生存周期设为0s，重新保存空cookie
			for (Cookie c : cookies) {
				c.setMaxAge(0);
				response.addCookie(c);
			}
		}
	}
%>