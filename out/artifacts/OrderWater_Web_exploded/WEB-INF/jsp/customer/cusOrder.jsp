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
    <title>查询用户订单</title>
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

<h2 align="center" style="color:#0e90d2"><center>订单信息</center></h2>

    <table  align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF" >
        <tr align="center" style="background-color: #0e90d2;font-weight: bold;height: 30px;color: #FFFFFF ">
            <td>订单号</td>
            <td>产品名</td>
            <td>数量</td>
            <td>单价</td>
            <td>配送状态</td>

        </tr>

        <c:forEach items="${orderList}" var="order">
            <tr align="center">
                <td>${order.orderId}</td>
                <td>${order.sId}</td>
                <td>${order.num}</td>
                <td>${order.wtCost}</td>
                <td>${order.status}</td>
            </tr>
        </c:forEach>

    </table>
<br/>
    <center><input type="button" value="我的主页" style="background-color: #0e90d2;border-color:#0e90d2;color: #FFFFFF"  onclick='location.href=("toHome")'></center>
<%--需要加一个返回主页 继续采购--%>

</body>
</html>
