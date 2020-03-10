<%--
  Created by IntelliJ IDEA.
  User: 划时代飞鹰
  Date: 2020/1/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>配送员首页</title>
</head>

<body><table align="center" width="500" >
    <tr>
        <td>订单号</td>
        <td>订购人</td>
        <td>数量</td>
        <td>联系电话</td>
        <td>地址</td>

    </tr>

    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.orderId}</td>
            <td>${order.sId}</td>
            <td>${order.num}</td>
            <td>${order.wtCost}</td>
            <td>${order.status}</td>
        </tr>
    </c:forEach>
    <input type="button" value="我的主页" onclick='location.href=("toHome")'>
</table>
</html>
