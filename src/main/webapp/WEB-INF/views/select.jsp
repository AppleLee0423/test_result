<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원보기</title>
</head>
<body>
	<select name="category" id="category">
		<option value="num">직원번호</option>
		<option value="name">이름</option>
		<option value="phone">전화번호</option>
		<option value="rank">직급</option>
		<option value="email">이메일</option>
	</select>
	<input type="text" id="keyword"/>
	<button name="search">찾기</button>

	<table>
		<tr>
			<th>직원번호</th>
			<th>직급</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일주소</th>
			<th>삭제</th>
		</tr>
		<tr>
			<td><a href="${path}/board/update"></a></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><button id="mem_delete" onclick="mem_delete()">삭제</button></td>
		</tr>
	</table>
<script>
	function mem_delete(){
		
	}
</script>
</body>
</html>