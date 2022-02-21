<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user feedback</title>
</head>
<body>
<div class="center">
		<h1>User Feedback</h1>
		
		<h2 class="hello-title">Search for a User and Update Information</h2>
		
		
		<br><br>
		<form method="get" action="update">
			Enter id: <input type="text" id="id" name="id" placeholder="Type here" required>
			<br>
			<br>
			<input type="submit" value="Enter" />
			<button><a href="/feedback">View all feedback</a></button>
		</form>
	</div>
</body>
</html>