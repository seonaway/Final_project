<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<link rel="stylesheet" href="css/Main.css">
<!-- 부트스트랩은 반응형 웹 -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>쇼핑몰</title>
<script type="text/javascript" src="script/notion.js"></script>
<!-- 부트스트랩 CSS추가하기 -->
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>

<!-- main페이지 불러오기 -->
	<%@include file ="views/Main.jsp" %>
<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="js/jquery.min.js">
		
	</script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="js/popper.js">
		
	</script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="js/bootstrap.min.js">
		
	</script>
</body>
</html>