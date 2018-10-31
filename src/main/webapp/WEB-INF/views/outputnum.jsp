<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${multi.num1}" />×<c:out value="${multi.num2}" />＝<c:out value="${answer}" /><br>

<a href="/multi/toOutput2">次へ</a>
</body>
</html>