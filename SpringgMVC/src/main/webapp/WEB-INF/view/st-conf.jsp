<%--
  Created by IntelliJ IDEA.
  User: __it
  Date: 08.04.2019
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
   The stuent is confirmed: ${student.firstName} ${student.lastName}

<br><br>

   Id is: ${student.id}

   <br><br>

   Your postal code: ${student.postalCode}

<br><br>
   Country: ${student.country}

<br><br>

   Favourite language: ${student.favLanguage}
<br><br>
   Skills:
   <br><br>
<%
String[] skills = (String[]) request.getAttribute("skill");
    for (int i = 0; i < skills.length; i++) {
        String s = skills[i];
   %>
<table>
    <tr><% out.print(s);%></tr>
</table>
<%}%>
<br><br>
</body>
</html>
