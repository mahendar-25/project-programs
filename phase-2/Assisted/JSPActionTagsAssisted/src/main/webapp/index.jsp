<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Tags</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="n productBe" class="w com.eproduct.ProductBe" scope="session"></jsp:useBean>
        <jsp:setProperty property="productId" name="productBean" value="16493"/>
        <jsp:setProperty property="productName" name="productBean" value="Optical Wireless Mouse"/>
        <jsp:setProperty property="price" name="productBean" value="700.00"/>

<a href="showbean.jsp">Access bean properties from another page</a><br>
<a href="forward.jsp">Use Forward action to go to Google</a><br>

<hr>

<jsp:text>
        <![CDATA[This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
</jsp:text>



</body>
</html>