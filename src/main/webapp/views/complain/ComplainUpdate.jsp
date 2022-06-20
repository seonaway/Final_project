<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 1:1 문의 수정</title>
<link rel="stylesheet" type="text/css" href="css/complain.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/complain.js"></script>
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
	<h1> 1:1 문의 수정 </h1>
	<br>
		<form name="frm" method="post" action="ComplainServlet">
		<input type="hidden" name="command" value="complain_update">
		<input type="hidden" name="num" value="${complain.num }">
		<table>
			<tr>
				<th>문의 종류</th>
				<td><input type="text" size="12" name="comp_kind" value="${complain.comp_kind }"></td>
			</tr>
			
			<tr>
				<th>아이디</th>
				<td><input type="text" size="12" name="id" value="${complain.id }"></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input type="text" size="12" name="name" value="${complain.name }"></td>
			</tr>
			
			<tr>
				<th>제목</th>
				<td><input type="text" size="70" name="title" value="${complain.title }"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><textarea cols="70" rows="15" name="content">${complain.content }</textarea></td>
			</tr>
		</table>
		<br><br>
		<input type = "submit" value = "등록" onclick="return complainCheck()">
		<input type = "reset" value = "다시 작성">
		<input type = "button" value = "목록" onclick="location.href='ComplainServlet?command=complain_list'">
	</form>
</div>
</body>
</html>