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
    <title>Student Registration Form</title>
    <style>
        .error {
            color: red
        }
    </style>

    <style>
        .nRangeError {
            color: brown
        }
    </style>
</head>
<body>

<form:form method="post" action="processForm" modelAttribute="student">

    First name (*): <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>

    <br><br>

    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    Id: <form:input path="id"/>
    <form:errors path="id" cssClass="nRangeError"/>

    <br><br>

    Postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>

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
    Java <form:radiobutton path="favLanguage" value="Java"/>
    C# <form:radiobutton path="favLanguage" value="C#"/>
    Python <form:radiobutton path="favLanguage" value="Python"/>
    Ruby <form:radiobutton path="favLanguage" value="Ruby"/>
    <br><br>

    <p>Your skills</p>

    Java <form:checkbox path="skills" value="Java"/>
    C# <form:checkbox path="skills" value="C#"/>
    C++ <form:checkbox path="skills" value="C++"/>
    Java Skript <form:checkbox path="skills" value="Java Skript"/>

    <br><br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
