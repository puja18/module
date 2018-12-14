<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dosorting?startRange&?endRange">
<table>

<tr>
<td>start Range</td>
<td>
<select name ="startRange">
  <option value="500">500</option>
  <option value="10000">10000</option>
  <option value="30000">30000</option>
  <option value="50000">50000</option>
</select>
</td>
<td>End Range</td>
<td>
<select name= "endRange">
  <option value="10000">10000</option>
  <option value="30000">30000</option>
  <option value="50000">50000</option>
  <option value="100000">100000</option>
</select>
</td>
</tr>
<tr>
<td><input type="submit" value="search"/></td>
</tr>
<!-- <tr><td>Price Range</td></br>
<td><input type="range" name=""/></td></tr> -->
</table>
</form>

</body>
</html>