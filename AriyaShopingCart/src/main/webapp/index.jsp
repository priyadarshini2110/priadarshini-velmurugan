<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${sessionScope.username==null}">
<jsp:forward page="views/login.jsp"></jsp:forward>
</c:if>


<jsp:forward page="views/home.jsp"></jsp:forward>


</body>
</html>