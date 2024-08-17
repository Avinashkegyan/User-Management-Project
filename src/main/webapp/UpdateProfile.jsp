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
	String fname = (String)request.getAttribute("fname");
	String msg = (String)request.getAttribute("msg");
	out.println("Page belongs to User: "+fname+"<br>");
	out.println(msg);
	%>
	
	<a href="view">View Profile</a>&nbsp;
	<a href="logout">Logged Out</a>
	
</body>
</html>