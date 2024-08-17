<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    				 	 pageEncoding="ISO-8859-1"
    				 	 import="userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View PRofile</title>
</head>
<body>
	
	<% 
	String name = (String)request.getAttribute("name");
	out.println("Page of User: "+name+"<br>");
	UserBean ub = (UserBean)application.getAttribute("ubean");
	out.println("Your UserName: "+ub.getUname()+"<br> Your Name"+ub.getName()+"<br> Your Mobile: "+ub.getMobile()+"<br>Your Address: "+ub.getAddr()+"<br> Your Email: "+ub.getEmail()+"<br>");
	
	%>
	<a href="edit">Edit Profile </a>
	<a href="logout">Logged Out</a>
</body>
</html>