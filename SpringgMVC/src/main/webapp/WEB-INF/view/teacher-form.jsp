<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: __it
  Date: 17.05.2019
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Teacher form</title>
</head>
<body>


<form:form method="post" action="ProcessTeacherForm" modelAttribute="teacher"> <%--Must have: action="without '/' "--%>
    <form:input path="name"/>
<br><br>
    <form:input path="speciality"/>
    <br><br>
<><input type="submit">
</form:form>

</body>
</html>
