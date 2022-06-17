<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" type="text/css" href="css/join.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/login.js"></script>
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
	<div id="wrapper">
		<div id="content">
			<form action="MembermanagementServlet" name="frm" method="post">
				<input type="hidden" name="command" value="membermanagement_login">
				<div>
					<h3 class="join_title">
						<label for="id">아이디</label>
					</h3>
					<span><input type="text" name="mem_id" class="int"
						maxlength="16"> </span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="id">비밀번호</label>
					</h3>
					<span><input type="password" name="mem_pwd" class="int"
						maxlength="16">
					</span>
				</div>
				<br> <input type="submit" id="btnJoin" value="로그인"
					onclick="return membermanagementCheck()"> <br> <br>${message }
			</form>
		</div>
	</div>
</body>
</html>