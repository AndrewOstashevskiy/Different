<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: __it
  Date: 08.04.2019
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stuent Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>
    
    Country:
    
    <br><br>

    <%--Hardcode--%>
   <%-- <form:select path="country">
        <form:option value="UA" label="Ukraine"/>
        <form:option value="BRA" label="Brazil"/>
        <form:option value="ARG" label="Argentina"/>
        <form:option value="USA" label="USA"/>
        <form:option value="SPN" label="Spain"/>
        <form:option value="ITA" label="Italia"/>
    </form:select>--%>

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    
    <br><br>
    <p>Favorite language</p>
    Java <form:radiobutton path="favLnguage" value="Java"/>
    C# <form:radiobutton path="favLnguage" value="C#"/>
    Python <form:radiobutton path="favLnguage" value="Python"/>
    Ruby <form:radiobutton path="favLnguage" value="Ruby"/>
    <input type="submit">
</form:form>
</body>
</html>
