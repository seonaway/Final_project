<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 게시판</title>

<link rel = "stylesheet" type="text/css" href="css/notion.css">
<script type="text/javascript" src="script/notion.js"></script>
<link rel="stylesheet" href="css/Main.css">
<!-- header 불러오기 -->
<%@include file ="../header.jsp" %>

</head>
<body>
<div id="wrap" align="center">
<h1>공지글 수정</h1>
<form name="frm" method="post" action="NotionServlet">
	<input type="hidden" name="command" value="notion_update">
	<input type="hidden" name="nno" value="${notion.nno }">
	<table>
	
	<!--<tr>
		<th>관리자</th>
		<td><input type="text" size="12" name="emp_id" value="${notion.emp_id }">
		</td>
		</tr>
		
	<tr>
		<th>비밀번호</th>
		<td><input type="password" size="12" name="emp_pw">
		</td>
		</tr>
		  -->
	<tr> 
	<tr>
		<th>분류</th>
		<td><input type="text" size="70" name="nkinds" value="${notion.nkinds }">
		 </td>
		 </tr>

	<tr>
	<th> 제목 </th>
	<td><input type="text" size="70" name="ntitle" value="${notion.ntitle}"> 
	</td>
	</tr>
	<tr>
	<th>비밀번호</th>
	<td><input type="password" name="emp_pw">
	</td>
	</tr>
	<tr>
	<th>내용</th>
		<td><textarea cols="70" rows="15" name="ncontent">${notion.ncontent}
		
		</textarea></td>
		</tr>
	</table>
	<br><br>
	
	<input type="submit" value="등록" onclick="return notionCheck()">
	<input type="reset" value="다시 작성">
	<input type ="button" value="목록"
	onclick="location.href='NotionServlet?command=notion_list'">
<!-- 	
	<tr>
	<th>비밀번호</th>
	<td><input type="password" name="pass">
		*필수 (게시물 수정 삭제시 필요합니다.)</td>
		</tr>
		 -->
			
	</form>
	</div>

</body>
</html>