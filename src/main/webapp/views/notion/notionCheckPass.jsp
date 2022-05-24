<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/notion.css">
<script type ="text/javascript" src="script/notion.js"></script>
<!-- header 불러오기 -->
</head>
<body>
<div align="center">
	<h1>비밀번호 확인</h1>
	<form action="NotionServlet" name="frm" method="get">
		<input type="hidden" name="command" value="notion_check_pass">
		<input type="hidden" name="nno" value="${param.nno}">
		<table style="width: 80%">
		<tr>
		<th>비밀번호</th>
		<td>
			<input type="password" name="emp_pw" size="20">
		</td>
		</tr>
		</table>
		<br>
		<input type="submit" value=" 확인 " onclick="return passCheck()">
		<br><br>${message }
		</form>
</div>
</body>
</html>