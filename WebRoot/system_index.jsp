<%@page import="com.kayoshi.model.Students"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<style>
.form-item {
	
	width: 70px;
	height: 20px;
	margin: 0 auto;
}
.form-item-long {
	
	width: 120px;
	height: 30px;
	margin: 0 auto;
	
}
.form-item-email {
	
	width: 200px;
	height: 30px;
	margin: 0 auto;
	
}
</style>

<html>
<head>
<meta charset="utf-8">
<title>Index</title>
</head>

<jsp:useBean id="STUDENTS" scope="page" class="com.kayoshi.model.Students"/>
<jsp:useBean id="STUDENTDBDAO" scope="page" class="com.kayoshi.dao.StudentsDbDAO"/>
<jsp:setProperty property="*" name="STUDENTS"/>

<%
	
			
%>

<body>
	<center><h1>STUDENT MANAGER SYSTEM INDEX</h1>
	<p>
		<div>
			<a href="addstudent.jsp"> &nbsp;添加学生信息&nbsp;</a>    |
			<a href=""> &nbsp;修改学生信息&nbsp;</a>    |
			<a href=""> &nbsp;删除学生信息&nbsp;</a>    |

			
		</div>
	</p>
	<table  border="0">
		<tbody>
			<tr>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item">
							Id
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item">
							姓名
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item">
							性别
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item">
							年龄
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item-long">
							班级
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item-long">
							手机
					</blockquote></th>
				<th align="center" valign="middle" scope="col"><blockquote class="form-item-long">
							邮箱
					</blockquote></th>
			</tr>
			<!-- 开始循环的地方 -->
			
		<% 
			ArrayList<Students> studentlist = STUDENTDBDAO.getStudentsAll();
				for(int i=0;i<studentlist.size();i++){
					Students s = studentlist.get(i);
		%>
			<tr>
				<td align="center" valign="middle"><blockquote class="form-item">
							<%=s.getStudentid()%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item">
							<%=s.getStudentname()%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item">
							<%=s.getStudentsex()%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item">
							<%=s.getStudentage()%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item-long">
							<%=s.getStudentclass()%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item-long">
							<%=s.getStudentmobile( )%>
						</blockquote></td>
				<td align="center" valign="middle"><blockquote class="form-item-email">
							<%=s.getStudentemail()%>
						</blockquote></td>
			</tr>
			
			<%
				}
			%>
			<!-- 循环结束处 -->
		</tbody>
	</table>
	</center>
</body>
</html>
