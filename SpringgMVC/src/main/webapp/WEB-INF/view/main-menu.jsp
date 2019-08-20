<%@ page import="org.springframework.core.SpringVersion" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body>
<h2>Hello User!!!111!1 Welcome</h2>
<a href="hello/showForm">Show Form</a>
<br><br>

<a href="students/showForm">Show student registration form</a>
<br><br>

<a href="teachers/showFormT">Show teacher registration form</a>

<br><br>
<%out.println(SpringVersion.getVersion());%>

</body>
</html>