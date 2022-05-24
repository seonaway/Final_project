<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 관리</title>
<link rel="stylesheet" type="text/css" href="css/notion.css">
</head>
<body>
<div id ="wrap" align="center">
<h1>상품 삭제 - 관리자 페이지</h1>
<form action="productDelete.do" method="post">
<table>
				<tr>
		<td>
			<c:choose>
				<c:when test="${empty product.ppictureUrl }">
					<img src="upload/noimage.jpg">
				</c:when>
				<c:otherwise>
					<img src ="upload/${product.ppictureUrl }">
				</c:otherwise>
			</c:choose>
		</td>
		<td>
		<table>
				<tr>
					<th style="width: 100px"> 상 품 명 </th>
					<td>
			<input type="text" name="pname" value="${product.pname }" size="80">	</td>
			</tr>
				
				<tr>
					<th> 브 랜 드 </th>
					<td><input type="text" name="pbrand" value="${product.pbrand }"></td>
				</tr>			
				<tr>
					<th> 가  격 </th>
					<td><input type="text" name="pprice" value="${product.pprice }">원</td>
				</tr>
				<tr>
					<th> 출 시 가 </th>
					<td><input type="text" name="pnew_price" value="${product.pnew_price }">원</td>
				</tr>
				<tr>
					<th> 모 델 번 호</th>
					<td><input type="text" name="pmodel" value="${product.pmodel }">원</td>
				</tr>
				<tr>
					<th> 상 품 등 급 </th>
					<td><input type="text" name="pgrade" value="${product.pgrade }"></td>
				</tr>
				<tr>
					<th> 상 세 정 보 </th>
					<td>
					<textarea cols="90" rows="10" name="pdetail">${product.pdetail }</textarea> 
				</td>
				</tr>
			
				<tr>
					<th> 카 테 고 리 </th>
					<td><input type="text" name="pkind" value="${product.pkind }"></td>
				</tr>
					<tr>
					<th> 상 품 수 량 </th>
					<td><input type="text" name="pquantity" value="${product.pquantity }"></td>
				</tr>
				<tr> 
					<th> 사 진 </th>
					<td>
					<input type="file" name="pictureUrl"><br>
					(주의사항 : 이미지를 변경하고자 할때만 선택하시오)
					</td>
					</tr>
					</table>
					</td>
					</tr>
				
	</table>
	<br><br>
	
	<input type="hidden" name="pnum" value="${product.pnum }">
	<input type="submit" value="삭제">
	<input type ="button" value="목록"
	onclick="location.href='ProductServlet?command=product_list'">
	</form>
	</div>

</body>
</html>