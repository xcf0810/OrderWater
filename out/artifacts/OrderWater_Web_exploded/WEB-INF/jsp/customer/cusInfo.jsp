<%@ page import="com.po.Customer" %><%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <title>用户首页</title>
</head>
<body>
<br/>
<br/>

<h2 align="center" style="color:#0e90d2">个人信息</h2>
<table align="center"  border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
<%
    Customer customer = (Customer) session.getAttribute("customer");

%>
    <tr >

        <td width="80px" align="center" style="background-color: #0e90d2;font-weight: bold ;color: #FFFFFF">姓&nbsp&nbsp名:</td>
        <td width="200px" align="center"><%=customer.getCusName()%></td>
    </tr>
    <tr>
        <td align="center" style="background-color: #0e90d2;font-weight: bold;color: #FFFFFF">地&nbsp&nbsp址:</td>
        <td align="center"><%=customer.getCusAddr()%></td>
    </tr>
    <tr>
        <td align="center" style="background-color: #0e90d2;font-weight: bold;color: #FFFFFF">电&nbsp&nbsp话:</td>
        <td align="center"><%=customer.getCusTel()%></td>
    </tr>



</table>
<br/>
<center>
    <tr>
        <td>
            <input  type="button" value="修改信息" onclick='location.href=("toChangeCusInfo")'>
        </td>
        <td>
            <input type="button" value="订水" onclick='location.href=("loadingWater")'>
        </td>
        <td>
            <input type="button" value="查询订单" onclick='location.href=("selectAllOrder")'>
        </td>
        <td><input type="button" value="退出登录"  onclick='location.href=("toSignIn")' /></td>
    </tr>
</center>


</body>
</html>
