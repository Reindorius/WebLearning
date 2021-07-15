<%--
  Created by IntelliJ IDEA.
  User: Conqu
  Date: 2021/7/15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <h1>This is main page</h1>
    <%--思路：加一层过滤器，让没有登录的用户无法进入此页--%>
    <p><a href="/logout">LOGOUT</a> </p>
</body>
</html>
