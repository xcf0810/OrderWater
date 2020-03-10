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
<br/>
<br/>
<h2 align="center" style="color:#0e90d2">修改用户信息</h2>
<form action="changeCusInfo" method="post">
    <table align="center"  border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
<%--        <tr>--%>
<%--            <td><input type="hidden" name="cusId" value="<%=customer.getCusId()%>"></td>--%>
<%--        </tr>--%>
        <tr>
            <td width="80px" align="center" style="background-color: #0e90d2;font-weight: bold ;color: #FFFFFF" >姓&nbsp&nbsp名:</td>
            <td width="200px" ><input type="text" name="cusName" value="<%=customer.getCusName()%>"></td>
        </tr>
        <tr>
            <td align="center" style="background-color: #0e90d2;font-weight: bold;color: #FFFFFF">地&nbsp&nbsp址:</td>
            <td ><input type="text" name="cusAddr" value="<%=customer.getCusAddr()%>"></td>
        </tr>
        <tr>
            <td align="center" style="background-color: #0e90d2;font-weight: bold;color: #FFFFFF">电&nbsp&nbsp话:</td>
            <td ><input type="text" name="cusTel" value="<%=customer.getCusTel()%>"></td>
        </tr>

    </table>
    <br/>
    <center>
        <tr>
        <td>
            <input align="center" type="submit" value="提交">
        </td>
        </tr>
    </center>

</form>


</body>
</html>
