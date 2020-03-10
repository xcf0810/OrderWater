<%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/10
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>

<form action="addUser" method="post">
    <h2 align="center"style="color: #0e90d2;font-weight: bolder" >添 加 用 户</h2>
    <table  align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF" >
        <tr >
            <td align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px; color: #FFFFFF ">登录名:</td>
            <td><input type="text" name="userId" value="请输入用户名"></td>
        </tr>
        <tr>
            <td align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px ;color: #FFFFFF  ">密&nbsp&nbsp&nbsp码:</td>
            <td><input type="text" name="userPws" value="123"></td>
        </tr>
        <tr>
            <td align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px ;color: #FFFFFF">用户类别</td>
            <td >
                <input type="radio" name="userKind" value="1"/>普通用户&nbsp|&nbsp
                <input type="radio" name="userKind" value="2">分销商&nbsp|&nbsp
                <input type="radio" name="userKind" value="3">配送员
            </td>

        </tr>

    </table>
    <br/>

    <center>
        <tr>
            <td><input type="submit"  value="提交" style="background-color: #0e90d2;border-color:#0e90d2;color: #FFFFFF; width: 100px ;font-weight: bold"></td>
            <td>
                <input type="reset" value="返回" style="width: 100px" onclick='location.href=("listUsers")'>
            </td>
        </tr>
    </center>
</form>
</body>
</html>

