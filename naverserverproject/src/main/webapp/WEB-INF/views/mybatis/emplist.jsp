<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1> 모든 사원 정보를 출력합니다. </h1>
<table border=3>
	<c:forEach items="${emplist }" var="vo">
	<tr><td>${vo }</td></tr>
	</c:forEach>
</table>
</body>
</html>