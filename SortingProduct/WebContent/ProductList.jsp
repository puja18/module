<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>productId</th>
<th>productName</th>
<th>productCategory</th>
<th>productCost</th>
<th>views</th>
<th>rating</th>
</tr>
<a:forEach var="product" items="${temp}">
<tr>
<td>${product.productId}</td>
<td>${product.productName}</td>
<td>${product.productCategory}</td>
<td>${product.productCost}</td>
<td>${product.views}</td>
<td>${product.rating}</td>
</tr>
</a:forEach>

</table>
</body>
</html>
