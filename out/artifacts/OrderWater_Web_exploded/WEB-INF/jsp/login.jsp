<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>

<form action="signIn" method="post">
    <br/>
    <br/>

    <h2 align="center">用户登录</h2>
    <table border="0.2" align="center" style="border-color: #0e90d2;border-width: 1px"  >

        <tr>
            <td>登录名:</td>
            <td><input type="text" name="userId"></td>
        </tr>
        <tr>
            <td>密&nbsp&nbsp&nbsp码:</td>
            <td><input type="password" name="userPws"><br/></td>
        </tr>

        <tr>
            <td><input type="submit" value="登录"></td>
            <td>
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>

</form>
</body>
</html>

