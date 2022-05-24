<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="css/notion.css">
<link rel="stylesheet" href="css/Main.css">
<!-- header 불러오기 -->
<%@include file ="../header.jsp" %>
</head>
<body>
<div id="wrap" align="center">
<h1>게시글 리스트</h1>

<table class="list">
<tr>
<td colspan="6" style="border: white; text-align: right">
<a href="NotionServlet?command=notion_write_form"> 게시글 등록 </a>
</td>
</tr>
<tr><th>번호</th><th>제목</th><th>내용</th><th>종류</th><th>조회</th><th>작성일</th></tr>
<c:forEach var="notion" items="${notionList }">
<tr class="record">
<td>${notion.nno}</td>
<td>
<!--  게시글 상세보기 페이지로 이동 -->
<a href="NotionServlet?command=notion_view&nno=${notion.nno}">
${notion.ntitle }
</a>
</td>
<td>${notion.ncontent }</td>
<td>${notion.nkinds }</td>
<td>${notion.ncount}</td>
<td><fmt:formatDate value="${notion.ndate }"/></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>