<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 멤버 리스트 </title>
<link rel="stylesheet" type="text/css" href="css/membermanagement.css">
<link rel="stylesheet" href="css/Main.css">
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
<h1> 멤버 리스트 </h1>
<br>
<table class="list">
	<tr>
		<td colspan="5" style="border: white; text-align: right">
			<a href="MembermanagementServlet?command=membermanagement_join_form">회원 가입</a>
		</td>
	</tr>
	<tr>
		<td colspan="5" style="border: white; text-align: right">
			<a href="MembermanagementServlet?command=membermanagement_login_form">로그인</a>
		</td>
	</tr>
	<tr><th>아이디</th><th>닉네임</th><th>이름</th><th>주소</th><th>전화번호</th>
	<c:forEach var="membermanagement" items="${membermanagementList}">
	<tr class="record">

		<td>
			<a href="MembermanagementServlet?command=membermanagement_view&num=${membermanagement.num }">
				${membermanagement.mem_id }
			</a>
		</td>
		<td>${membermanagement.mem_nick }</td>
		<td>${membermanagement.mem_name }</td>
		<td>${membermanagement.mem_addr }</td>
		<td>${membermanagement.mem_phone }</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>