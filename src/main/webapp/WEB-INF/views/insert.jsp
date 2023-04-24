<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원등록</title>
</head>
<body>
	<form name="board_form" action="" method="post">
		<table>
			<tr>
				<th>직원번호</th>
				<td>가장 마지막 번호 불러올것</td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" id="mem_name" name="mem_name"/></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" id="mem_phone" name="mem_phone"/></td>
			</tr>
			<tr>
				<th>직급</th>
				<td><input type="text" id="mem_rank" name="mem_rank"/></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="email" id="mem_email" name="mem_email"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" onclick="go()" value="등록"/>
					<input type="reset" value="취소하기" />
					<button onclick="history.back()">뒤로가기</button>
				</td>
			</tr>
		</table>
	</form>

<script>
	

</script>
</body>
</html>