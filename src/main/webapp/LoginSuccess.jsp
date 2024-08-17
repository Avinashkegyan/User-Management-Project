<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   						 pageEncoding="ISO-8859-1"
   						 import="userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>
	
	<%
	UserBean ub = (UserBean)application.getAttribute("ubean");
	out.println("Welcome User: "+ub.getName()+"<br>");
	%>
	
	<a href="view">View Profile</a>
	<a href="edit">Edit Profile </a>
	<a href="logout">Logout </a>
	
</body>
</html>