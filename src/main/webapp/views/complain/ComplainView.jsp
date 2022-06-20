<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 1:1문의 </title>
<link rel="stylesheet" type="text/css" href="css/complain.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/complain.js"></script>
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
<h1> 1:1문의 상세보기 </h1>
<br>
	<table>
		<tr>
			<th> 문의 종류 </th> <td> ${complain.comp_kind }</td>
			<th> 아이디 </th> <td> ${complain.id }</td>
		</tr>
		
		<tr>
			<th> 작성일 </th> <td><fmt:formatDate value="${complain.writedate }"/></td>
			<th> 조회수 </th> <td>${complain.readcount }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${complain.title }</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td colspan="3"><pre>${complain.content }</pre></td>
		</tr>
	</table>
	<br> <br>
	<input type="button" value="게시글 수정" onclick="location.href='ComplainServlet?command=complain_update_form&num=${param.num}'">
	<input type="button" value="게시글 삭제" onclick="location.href='ComplainServlet?command=complain_delete&num=${param.num}'">
	<input type="button" value="게시글 리스트" onclick="location.href='ComplainServlet?command=complain_list'">
	<input type="button" value="게시글 등록" onclick="location.href='ComplainServlet?command=complain_write_form'">
</div>
</body>
</html>