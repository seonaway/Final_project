<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 상세보기</title>
<link rel="stylesheet" type="text/css" href="css/membermanagement.css">
<link rel="stylesheet" href="css/Main.css">
</head>
<body>
<%@include file ="../header.jsp" %>
<br>
<div id="wrap" align="center">
<h1> 회원 정보 상세보기 </h1>
<br>
	<table>
		<tr>
			<th> 아이디 </th> <td> ${membermanagement.mem_id }</td>
			<th> 닉네임 </th> <td> ${membermanagement.mem_nick }</td>
			<th> 패스워드 </th> <td> ${membermanagement.mem_pwd }</td>
			<th> 이름 </th> <td> ${membermanagement.mem_name }</td> 
		</tr>
		
		<tr>
			<th> 주소 </th> <td> ${membermanagement.mem_addr }</td>
			<th> 우편번호 </th> <td> ${membermanagement.mem_postnum }</td>
			<th> 전화번호 </th> <td> ${membermanagement.mem_phone }</td>
		</tr>
	</table>
	<br> <br>
	<input type="button" value="회원 수정" onclick="location.href='MembermanagementServlet?command=membermanagement_update_form&num=${param.num}'">
	<input type="button" value="회원 삭제" onclick="location.href='MembermanagementServlet?command=membermanagement_delete&num=${param.num}'">
	<input type="button" value="회원 리스트" onclick="location.href='MembermanagementServlet?command=membermanagement_list'">
</div>
</body>
</html>