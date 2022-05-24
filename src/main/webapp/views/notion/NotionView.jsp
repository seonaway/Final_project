<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 view</title>

 <link rel="stylesheet" type="text/css" href="css/notion.css"> 
<link rel="stylesheet" href="css/Main.css">
<script type ="text/javascript" src="script/notion.js"></script>
<!-- header 불러오기 -->
<%@include file ="../header.jsp" %>
</head>
<body>
<div id ="wrap" align="center">
<h1> 게시글 상세보기</h1>
<table>
	<tr>
		<th> 작성일 </th> <td><fmt:formatDate value="${notion.ndate }"/></td>
		<th> 조회수 </th> <td>${notion.ncount }</td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td colspan="3">${notion.ntitle } </td>
	</tr>
		
	<tr>
		<th>내용</th>
		<td colspan="3"><pre>${notion.ncontent }</pre></td>
	</tr>

</table>
	<br><br>
	<input type="button" value="게시글 수정" 
	onclick="open_win('NotionServlet?command=notion_check_pass_form&nno=${notion.nno}', 'update')">
	<input type="button" value="게시글 삭제" 
	onclick="open_win('NotionServlet?command=notion_check_pass_form&nno=${notion.nno}',	'delete')">
	<input type="button" value="게시글 리스트"
		onclick="location.href='NotionServlet?command=notion_list'">
	<input type="button" value="게시글 등록"
		onclick="location.href='NotionServlet?command=notion_write_form'">

</div>
</body>
</html>