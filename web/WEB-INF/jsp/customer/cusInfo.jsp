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
<h2 align="center">普通用户信息</h2>
<table align="center" border="0.5">
<%
    Customer customer = (Customer) session.getAttribute("customer");

%>
    <tr>

        <td width="20px" >姓&nbsp&nbsp名:</td>
        <td width="20px"><%=customer.getCusName()%></td>
    </tr>
    <tr>
        <td>地&nbsp&nbsp址:</td>
        <td><%=customer.getCusAddr()%></td>
    </tr>
    <tr>
        <td>电&nbsp&nbsp话:</td>
        <td><%=customer.getCusTel()%></td>
    </tr>
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
    </tr>

</table>

</body>
</html>
