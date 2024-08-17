<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   						 pageEncoding="ISO-8859-1"
   						 import="userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String fname = (String)request.getAttribute("fname");
UserBean  ub = (UserBean)application.getAttribute("ubean");
out.println("Page belongs to: "+fname+"<br>");

%>

<form action="update" method="post">
Address: <input type="text" name="addr" value="<%=ub.getAddr()%>"><br>
Mail id: <input type="text" name="mid" value="<%=ub.getEmail()%>"><br>
PhoneNo: <input type="text" name="phno" value="<%=ub.getMobile()%>"><br>
<input type="submit" value="Update Profile">

</form>



</body>
</html>