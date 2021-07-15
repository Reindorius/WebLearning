<%--
  Created by IntelliJ IDEA.
  User: Conqu
  Date: 2021/7/15
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>Current peopel online: <span><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span></h1>
  </body>
</html>
