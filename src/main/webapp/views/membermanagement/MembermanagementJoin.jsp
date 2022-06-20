<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>회원 가입</title>
<link rel="stylesheet" type="text/css" href="css/join.css">
<link rel="stylesheet" href="css/Main.css">
<script type="text/javascript" src="script/membermanagement.js"></script>
</head>
<body>
	<%@include file="../header.jsp"%>
	<br>
	<div id="wrapper">
		<div id="content">
			<form name="frm" method="post" action="MembermanagementServlet">
				<input type="hidden" name="command" value="membermanagement_join">
				<input type="hidden" name="num" value="${membermanagement.num }">
				<div>
					<h3 class="join_title">
						<label for="id">아이디</label>
					</h3>
					<span class="box int_id"> <input type="text" name="mem_id"
						class="int" maxlength="16" value="${membermanagement.mem_id }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="nick">닉네임</label>
					</h3>
					<span class="box int_nick"> <input type="text" class="int"
						maxlength="16" name="mem_nick"
						value="${membermanagement.mem_nick }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="pwd">비밀번호</label>
					</h3>
					<span class="box int_pwd"> <input type="password"
						class="int" maxlength="16" name="mem_pwd"
						value="${membermanagement.mem_pwd }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="name">이름</label>
					</h3>
					<span class="box int_name"> <input type="text" class="int"
						maxlength="16" name="mem_name"
						value="${membermanagement.mem_name }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="addr">주소</label>
					</h3>
					<span class="box int_addr"> <input type="text" class="int"
						maxlength="16" name="mem_addr"
						value="${membermanagement.mem_addr }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="postnum">우편번호</label>
					</h3>
					<span class="box int_postnum"> <input type="text"
						class="int" maxlength="16" name="mem_postnum"
						value="${membermanagement.mem_postnum }">
					</span>
				</div>
				<div>
					<h3 class="join_title">
						<label for="phone">전화번호</label>
					</h3>
					<span class="box int_phone"> <input type="text" class="int"
						maxlength="16" name="mem_phone"
						value="${membermanagement.mem_phone }">
					</span>
				</div>
				<div class="btn_area">
					<input type="submit" id="btnJoin" value="가입"
						onclick="return membermanagementCheck()">
				</div>
			</form>
		</div>
	</div>
</body>
</html>