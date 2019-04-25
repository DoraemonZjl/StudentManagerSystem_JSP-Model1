<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>添加学生信息功能页面</title>
<style>
* {
	margin: 0;
	padding: 0;
}

html {
	height: 100%;
}

body {
	height: 100%;
	background: #fff url(images/backgroud.png) 50% 50% no-repeat;
	background-size: cover;
}

.dowebok {
	position: absolute;
	left: 50%;
	top: 50%;
	width: 430px;
	height: 550px;
	margin: -300px 0 0 -215px;
	border: 1px solid #fff;
	border-radius: 20px;
	overflow: hidden;
}

.logo {
	width: 104px;
	height: 104px;
	margin: 40px auto 60px;
	background: url(images/login.png) 0 0 no-repeat;
}

.form-item {
	position: relative;
	width: 360px;
	height: 40px;
	margin: 0 auto;
	padding-bottom: 30px;
}

.form-item-checkbox {
	position: relative;
	width: 360px;
	height: 50px;
	margin: 0 auto;
	padding-bottom: 10px;
}

.form-item input {
	width: 288px;
	height: 48px;
	padding-left: 70px;
	border: 1px solid #fff;
	border-radius: 25px;
	font-size: 18px;
	color: #fff;
	background-color: transparent;
	outline: none;
}

.form-item button {
	width: 360px;
	height: 50px;
	border: 0;
	border-radius: 25px;
	font-size: 18px;
	color: #1f6f4a;
	outline: none;
	cursor: pointer;
	background-color: #fff;
}

#username {
	background: url(images/emil.png) 20px 14px no-repeat;
}

#password {
	background: url(images/password.png) 23px 11px no-repeat;
}

.tip {
	display: none;
	position: absolute;
	left: 20px;
	top: 52px;
	font-size: 14px;
	color: #f50;
}

.reg-bar {
	width: 360px;
	margin: 20px auto 0;
	font-size: 14px;
	overflow: hidden;
}

.reg-bar a {
	color: #fff;
	text-decoration: none;
}

.reg-bar a:hover {
	text-decoration: underline;
}

.reg-bar .reg {
	float: left;
}

.reg-bar .forget {
	float: right;
}

.dowebok ::-webkit-input-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok :-moz-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok ::-moz-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok :-ms-input-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

@media screen and (max-width: 500px) {
	* {
		box-sizing: border-box;
	}
	.dowebok {
		position: static;
		width: auto;
		height: auto;
		margin: 0 30px;
		border: 0;
		border-radius: 0;
	}
	.logo {
		margin: 50px auto;
	}
	.form-item {
		width: auto;
	}
	.form-item input, .form-item button, .reg-bar {
		width: 100%;
	}
}
</style>
</head>
<body>
	<form action="dodb.jsp" method="post">
		<div class="dowebok">
			<center>
				<div class="form-item">
					<h3>请输入要添加的学生信息</h3>
				</div>
			</center>
			<div class="form-item">
				名&nbsp;&nbsp;&nbsp;&nbsp;字：<input name="studentname" type="text"
					value="">
			</div>
			<div class="form-item">
				性&nbsp;&nbsp;&nbsp;&nbsp;别：<input name="studentsex" type="text"
					value="">
			</div>
			<div class="form-item">
				年&nbsp;&nbsp;&nbsp;&nbsp;龄：<input name="studentage" type="text"
					value="">
			</div>
			<div class="form-item">
				班&nbsp;&nbsp;&nbsp;&nbsp;级：<input name="studentclass" type="text"
					value="">
			</div>
			<div class="form-item">
				手&nbsp;&nbsp;&nbsp;&nbsp;机：<input name="studentmobile" type="text"
					value="">
			</div>
			<div class="form-item">
				邮&nbsp;&nbsp;&nbsp;&nbsp;箱：<input name="studentemail" type="text"
					value="">
			</div>
			<div class="form-item">
				<button id="submit">确 定</button>
			</div>
		</div>
	</form>
</body>
</html>