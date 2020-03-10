<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
	<form action="signUp" method="post">
		<h2 align="center">普通用户注册</h2>
		<table border="0.2" align="center">

			<tr>
				<td>登录名:</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>密&nbsp&nbsp&nbsp码:</td>
				<td><input type="password" name="userPws"><br/></td>
			</tr>
			<%--<tr>
				<td>确认密码:</td>
				<td>
					<input type="password" name="userPws2">
					<%
						if(${userPws}!=$("#pwd2")){
							alert("密码不一致");}
					%>
				</td>
			</tr>--%>
			<tr>
				<td><input type="submit" value="注册"></td>
				<td>
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>

	</form>
</body>
</html>

