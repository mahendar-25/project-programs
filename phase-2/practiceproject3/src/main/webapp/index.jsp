<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD NewProduct</title>
</head>
<body>
<div align="center">
	<h2>Add a New Product</h2>
	<form action="products" method="get">
		Id: <input type="number" id="id" name="id"  required>
		<br/>
		<br/>
		Name: <input type="text" id="name" name="name" required>
		<br/>
		<br/>
		Price: <input type="text" id="price" name="price" required>
		<br/>
		<br/>
		<input type="submit" value="Submit">
	</form>
</div>
</body>
</html>