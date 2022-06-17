<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 멤버 수정 </title>
<link rel="stylesheet" type="text/css" href="css/membermanagement.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/membermanagement.js"></script>
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
	<h1> 멤버 수정 </h1>
	<br>
		<form name="frm" method="post" action="MembermanagementServlet">
		<input type="hidden" name="command" value="membermanagement_update">
		<input type="hidden" name="num" value="${membermanagement.num }">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" size="12" name="mem_id" value="${membermanagement.mem_id }"></td>
				<th>닉네임</th>
				<td><input type="text" size="12" name="mem_nick" value="${membermanagement.mem_nick }"></td>
				<th>패스워드</th>
				<td><input type="password" size="12" name="mem_pwd" value="${membermanagement.mem_pwd }"></td>
				<th>이름</th>
				<td><input type="text" size="12" name="mem_name" value="${membermanagement.mem_name }"></td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td><input type="text" size="12" name="mem_addr" value="${membermanagement.mem_addr }"></td>
				<th>우편번호</th>
				<td><input type="text" size="12" name="mem_postnum" value="${membermanagement.mem_postnum }"></td>
				<th>전화번호</th>
				<td><input type="text" size="12" name="mem_phone" value="${membermanagement.mem_phone }"></td>
			</tr>
			
		</table>
		<br><br>
		<input type = "submit" value = "등록" onclick="return membermanagementCheck()">
		<input type = "reset" value = "다시 작성">
		<input type = "button" value = "목록" onclick="location.href='MembermanagementServlet?command=membermanagement_list'">
	</form>
</div>
</body>
</html>