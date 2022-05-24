<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지글 등록 화면</title>
<link rel="stylesheet" type="text/css" href="css/notion.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/notion.js"></script>
<!-- header 불러오기 -->
<%@include file ="../header.jsp" %>
</head>
<body>
	<div id ="wrap" align="center">
	<h1>공지 등록</h1>
	<form name="frm" method="post" action="NotionServlet">
	<input type="hidden" name="command" value="notion_write">
	<table>
	<tr> 
	
	<tr>
		<th>분류</th>
		<td><input type="text" name="nkinds"> *필수 </td>
		</tr>
	<tr>
	<th> 제목 </th>
	<td><input type="text" name="ntitle"> *필수 </td>
	</tr>
	<tr>
	<th>비밀번호</th>
	<td><input type="password" name="emp_pw">
		*필수 (게시물 수정 삭제시 필요합니다.)</td>
		</tr>
		
		<tr>
		<th>내용</th>
		<td><textarea cols="70" rows="15" name="ncontent"></textarea></td>
		</tr>
	</table>
	<br><br>
	<input type="submit" value="등록" onclick="return notionCheck()">
	<input type="reset" value="다시 작성">
	<input type ="button" value="목록"
	onclick="location.href='NotionServlet?command=notion_list'">
	
	</form>
	</div>
</body>
</html>