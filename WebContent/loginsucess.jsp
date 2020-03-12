<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("HI "+session.getAttribute("c_name"));
%>
<h3><a href="/registration/jobdetail.html">job portal</a></h3>
<h1><a href="/registration/Elogout">logout</a></h1>
<h1><a href="/registration/resetpwd.html">change password</a></h1>
</body>
</html>