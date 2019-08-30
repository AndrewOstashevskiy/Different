<%@ page import="org.springframework.core.SpringVersion" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body>
<h2>Hello User. Register if you still not.</h2>

<a href="students/showForm">Login In</a>
<br><br>
<%out.println(SpringVersion.getVersion());%>

</body>
</html>