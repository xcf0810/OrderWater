<%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/10
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.po.OrderRecord" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户管理</title>
    <%--<script>
        function frmSubmit(){
            document.form1.submit();
        }
    </script>--%>
</head>
<body>
<br/>
<br/>
<br/>

<h2 style="color:#0e90d2"><center>用 户 列 表</center></h2>
<form action="resetUsers" method="post">


<table  align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF" >
    <tr align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px ;color: #FFFFFF">
        <td>用户名</td>
        <td>密码</td>
        <td>用户类别</td>
<%--        <td>重置密码</td>--%>

    </tr>

    <c:forEach items="${userLists}" var="user">
        <tr align="center">
            <td>${user.userId}</td>
            <td>${user.userPws}</td>
            <td>${user.userKind}</td>
<%--            <td><input type="checkbox" name="userId" value="${user.userId}"></td>--%>
        </tr>
    </c:forEach>

</table>
<br/>
<center>
<%--    <input type="submit" value="确认重置" style="background-color: #0e90d2;border-color:#0e90d2;color: #FFFFFF"  >--%>
    <input type="button" value="添加用户" onclick='location.href=("toAddUsers")'>
    <input type="button" value="退出登录"  onclick='location.href=("toSignIn")' />
</center>

</form>
</body>
</html>

