<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bookflight</title>
</head>
<body>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> User=(HashMap<String,String>)session.getAttribute("User");
	if(User==null){
		response.sendRedirect("UserPage.jsp");
	}
%>
<p align="center"  style="color:green;font-size:40px;font-weight:bold">Flight Booked Successfully</p>
</body>
</html>
