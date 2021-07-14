<%--
  Created by IntelliJ IDEA.
  User: Conqu
  Date: 2021/7/14
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>LOGIN</h1>

    <div style="text-align: center">
        <form action="${pageContext.request.contextPath}/login" method="post">
            Username:<input type="text" name="username"><br>
            Password:<input type="password" name="password"><br>
            Interest:
            <input type="checkbox" name="interest" value="gaming">Gaming
            <input type="checkbox" name="interest" value="reading">Reading
            <input type="checkbox" name="interest" value="exercising">Exercising
            <input type="checkbox" name="interest" value="movie">Movie
            <br>
            <input type="submit">
        </form>
    </div>
</body>
</html>
