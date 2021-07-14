<html>

<head>
    <title>LOGIN</title>
</head>

<body>
    <h2>Please login</h2>
</body>

<%--提交的路径需要寻找到项目的路径--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit">
</form>
</html>
