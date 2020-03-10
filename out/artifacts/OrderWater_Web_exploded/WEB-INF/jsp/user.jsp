<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户</title>
</head>
<body>
	<bable>
		<tr>
			<td>账号</td>
			<td>密码</td>
			<td>类型</td>
		</tr>
		<tr>
			<td>${user.userId}</td>
			<td>${user.userPws}</td>
			<td>${user.userKind}</td>
		</tr>
	</bable>
</body>
</html>

