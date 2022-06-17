<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 1:1 문의 </title>
<link rel="stylesheet" type="text/css" href="css/complain.css">
<link rel="stylesheet" href="css/Main.css">
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
<h1> 문의 리스트 </h1>
<br>
<table class="list">
	<tr>
		<td colspan="5" style="border: white; text-align: right">
			<a href="ComplainServlet?command=complain_write_form">게시글 등록</a>
		</td>
	</tr>
	<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회</th></tr>
	<c:forEach var="complain" items="${complainList}">
	<tr class="record">
		<td>${complain.num }</td>
		<td>
			<a href="ComplainServlet?command=complain_view&num=${complain.num }">
				${complain.title }
			</a>
		</td>
		<td>${complain.name }</td>
		<td><fmt:formatDate value="${complain.writedate }"/></td>
		<td>${complain.readcount }</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>