<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: __it
  Date: 04.04.2019
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World -Input Form</title>
</head>
<body>



<form  method="get" action="processForm3">
    <input type="text" name="stName" placeholder="Name"/>
    <input type="text" name="familia" placeholder="Famillia">
    <input type="submit">
</form>
</body>
</html>
