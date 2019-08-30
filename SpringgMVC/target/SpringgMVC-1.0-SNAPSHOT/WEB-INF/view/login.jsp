<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: __it
  Date: 21.08.2019
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
</head>
<body>
  <form action="login" method="post">
    User name: <input type="text" name="username"/>
    <br><br>
     Password: <input type="password" name="password"/>
    <br><br>

<input type="submit" value="Sign In"/>
  </form>
</body>
</body>
</html>
