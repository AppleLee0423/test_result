<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<ul>
		<li><a href="${path}/board/insert">등록</a></li>
		<li><a href="${path}/board/select">출력</a></li>
		<li><a href="#">다운로드</a></li>
	</ul>
</body>
</html>