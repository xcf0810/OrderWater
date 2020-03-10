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
    <title>订单配送情况</title>
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
<center><h2 style="color: #0e90d2;font-weight: bolder">未 配 送 订 单</h2></center>
<form action="changeStatus" method="post">
<table  align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF" >
    <tr align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px;color: #FFFFFF">
        <td>订单号</td>
        <td>订购人</td>
        <td>数量</td>
<%--        OrderRecord类没有电话属性，借用sId映射--%>
        <td>联系电话</td>
<%--        OrderRecord类没有电话属性，借用wtId映射--%>
        <td>配送地址</td>
        <td>勾选变更状态<td>

    </tr>

    <c:forEach items="${UnDoneList}" var="undone">
        <tr align="center">
            <td>${undone.orderId}</td>
            <td>${undone.cusId}</td>
            <td>${undone.num}</td>
            <td>${undone.sId}</td>
            <td>${undone.wtId}</td>
            <td><input type="checkbox" name="orderId" value="${undone.orderId}" ></td>
        </tr>
    </c:forEach>

</table>

<br/>
<center>
    <input type="submit" value="确认变更配送状态" style="background-color: #0e90d2;border-color:#0e90d2;color:#cc0000;font-weight: bold" />
    <input type="button" value="已配送订单" style="background-color: #0e90d2;border-color:#0e90d2;color: #FFFFFF"  onclick='location.href=("selectDone")'>
    <input type="button" value="退出登录"  onclick='location.href=("toSignIn")' />
</center>
</form>
</body>
</html>
