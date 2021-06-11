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
<h1>사원 등록</h1>
<form action="/empadd" method=post>
사번 <input type=text name="employee_id"><br>
이름 <input type=text name="first_name"><br>
성 <input type=text name="last_name"><br>
이메일 <input type=text name="email"><br>
직종 <input type=text name="job_id"><br>
<input type=submit value="사원등록">
</form>
</body>
</html>