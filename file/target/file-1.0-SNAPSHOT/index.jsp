<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%--  必须要有一个form
  上传文件一般有限制，所以请用post
--%>
  <form action="" method="post">
    Uploader: <input type="text" name="username">
    <input type="file" name="file1">
    <p><input type="submit"> | <input type="reset"></p>
  </form>
</body>
</html>