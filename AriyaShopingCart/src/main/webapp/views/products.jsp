<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Color</th>
<th>Price</th>
</tr>
<c:forEach var="product" items="${products}">
<tr>
<td>${product.productid}</td>
<td>${product.productname}</td>
<td>${product.productcolor}</td>
<td>${product.productprice}</td>
<td><a href="${pagecontext.request.ContextPath}/cart?&action=add&product_id =${product.productid}">Add to Cart</a></td>
 
</tr>
</c:forEach>

</table>

</body>
</html>