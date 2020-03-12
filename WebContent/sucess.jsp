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
out.println("HI "+session.getAttribute("username"));
%>
<h1><a href="/registration/Searchjob">Search Jobs</a></h1>
<h1><a href="/registration/Slogout">logout</a></h1>
<h1><a href="/registration/Seditdata.html">Edit Data</a></h1>
</body>
</html>