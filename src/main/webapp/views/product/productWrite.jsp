<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 화면</title>
<link rel="stylesheet" type="text/css" href="css/notion.css">
<script type="text/javascript" src="script/product.js"></script>

</head>
<body>
	<div id ="wrap" align="center">
	<h1>상품 등록 - 관리자 페이지</h1>
	<form name="frm" method="post" action="productWrite.do" enctype="multipart/form-data">
<!-- <input type="hidden" name="command" value="product_write">   -->	
	<table>
	<tr> 
		<th> 상 품 명 </th>
		<td><input type="text" name="pname" size="30"></td>
		</tr>
		<tr>
		<th> 상품 브랜드 </th>
		<td><input type="text" name="pbrand" size="30"></td>
		</tr>
		<tr>
		<th> 상품 가격 </th>
		<td><input type="text" name="pprice"></td>
		</tr>
		<tr>
		<th> 상품 출시가 </th>
		<td><input type="text" name="pnew_price"></td>
		</tr>
		<tr>
		<th> 상품 모델번호 </th>
		<td><input type="text" name="pmodel" size="30"></td>
		</tr>
		<tr>
		<th> 상품 등급 </th>
		<td><input type="text" name="pgrade" size="30"></td>
		</tr>
		<tr>
		<th> 상품 상세 정보 </th>
		<td><textarea cols="80" rows="10" name="pdetail"></textarea></td>
		</tr>
		<tr>
		<th> 상품 카테고리 </th>
		<td><input type="text" name="pkind" size="30"></td>
		</tr>
		<tr>
		<th> 상품 수량 </th>
		<td><input type="text" name="pquantity"></td>
		</tr>
		<tr>
		<th>사 진</th>
		<td><input type="file" name="ppictureUrl"><br>
		(주의사항 : 이미지를 변경하고자 할때만 선택하시오)
	</td>
	</tr>
	</table>
	<br><br>
	<input type="submit" value="등록"  onclick="return productCheck()"> 
	<input type="reset" value="다시 작성">
	<input type ="button" value="목록"
	onclick="location.href='ProductServlet?command=product_list'">
	
	</form>
	</div>
</body>
</html>