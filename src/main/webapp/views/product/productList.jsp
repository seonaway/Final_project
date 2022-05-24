<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 관리</title>

 <link rel="stylesheet" type="text/css" href="css/notion.css"> 
</head>
<body>
<div id ="wrap" align="center">
<h1>상품 리스트 - 관리자 페이지</h1>
<table class="list">
	<tr>
	<td colspan="13" style="border: white; text-align: right">
	<a href="ProductServlet?command=product_write_form">상품 등록</a>
	</td>
	</tr>
	
	<tr><th>상품번호</th><th>이름</th><th>브랜드</th><th>가격</th><th>출시가</th>
	<th>모델번호</th><th>상품등급</th><th>상세정보</th><th>카테고리</th><th>게시일</th>
	<th>수량</th><th>수정</th><th>삭제</th></tr>

 <c:forEach var="product" items="${productList }">
<tr class ="record">
<td> ${product.pnum } </td>
<td> ${product.pname } </td>
<td> ${product.pbrand } </td>
<td> ${product.pprice } </td>
<td> ${product.pnew_price } </td>
<td> ${product.pmodel } </td>
<td> ${product.pgrade } </td>
<td> ${product.pdetail } </td>
<td> ${product.pkind } </td>
<td> <fmt:formatDate value="${product.pdate }"/> </td>
<td> ${product.pquantity } </td>
<td>
<a href ="productUpdate.do?pnum=${product.pnum }">상품 수정</a>
</td>
<td>
<a href ="productDelete.do?pnum=${product.pnum }">상품 삭제</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>