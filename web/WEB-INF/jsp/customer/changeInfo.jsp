<%@ page import="com.po.Customer" %><%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<%
    Customer customer = (Customer) session.getAttribute("customer");
%>
<h2 align="center">修改用户信息</h2>
<form action="changeCusInfo" method="post">
    <table align="center" border="0.5">
<%--        <tr>--%>
<%--            <td><input type="hidden" name="cusId" value="<%=customer.getCusId()%>"></td>--%>
<%--        </tr>--%>
        <tr>
            <td width="20px" >姓&nbsp&nbsp名:</td>
            <td width="20px"><input type="text" name="cusName" value="<%=customer.getCusName()%>"></td>
        </tr>
        <tr>
            <td>地&nbsp&nbsp址:</td>
            <td><input type="text" name="cusAddr" value="<%=customer.getCusAddr()%>"></td>
        </tr>
        <tr>
            <td>电&nbsp&nbsp话:</td>
            <td><input type="text" name="cusTel" value="<%=customer.getCusTel()%>"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>


</body>
</html>
