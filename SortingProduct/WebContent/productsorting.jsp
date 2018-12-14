<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sorting Products</title>
<style>

.dropdown-content {
  display: none;
  position: absolute;
  background-color: transparent;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #aad;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: white;}
</style>
</head>
<body>
<table>
<div>
<tr>
<div class="dropdown">
  <button class="dropbtn">Shop by Category</button>&nbsp&nbsp
 <div class="dropdown-content">
    <a href="price">Price Range</a>
    <a href="ascending">Low to High</a>
    <a href="descending">High to Low</a>
    <a href="rating">Best Sellers</a>
    <a href="views">Most Viewed</a>
  </div>
  </div>
</tr>
</div>
</table>
</body>
</html>