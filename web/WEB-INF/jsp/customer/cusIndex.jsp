<%@ page import="com.dao.CustomerDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.po.Shore" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>下单</title>
</head>
<body>
<%
    Date date = new Date();

%>
<br/>
<br/>
<h2 align="center">产品清单</h2>
<form method="post" action="orderWater">
    <table align="center" align="center"  border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF"  >
        <tr align="center" style=" background-color: #0e90d2;font-weight: bold;height: 30px"  >
            <td>选中</td>
            <td style="width: 200px">品牌</td>
            <td style="width: 50px">单价</td>
            <td style="width: 80px">订购数量</td>
        </tr>
<%--遗留问题，foreach传值，后台没有用数组接，所以只有第一个num会真正改变--%>
        <c:forEach items="${WaterList}" var="water">
            <tr align="center">
                <td><input name="wtId" type="radio" value="${water.wtId}"/></td>
                <td>${water.sId}</td>
                <td>${water.wtCost}</td>
                <td ><input style="width: 20px" type="text" name="num" value="1"   /></td>
            </tr>
        </c:forEach>

    </table>
    <br/>
    <center> <tr>
        <td ><input type="submit" value="订购"></td>
        <td><input type="button" value="我的主页" onclick='location.href=("toHome")'/></td>
        <td></td>
        <td ><input  style="width:250px " type="text" value="<%=date.toLocaleString()%>" name="orderDate"></td>

    </tr></center>

</form>

</body>
</html>
