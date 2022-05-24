<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/login.css">
<!-- 부트스트랩은 반응형 웹 -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>쇼핑몰</title>
<!-- 부트스트랩 CSS추가하기 -->
<link rel="stylesheet" href="../css/bootstrap.min.css">

<title>Login page</title>
</head>
	<!-- header 불러오기 -->
	<%@include file ="header.jsp" %>
<body>
   	
   		<div class="login-wrapper">
   		
<section class="login-form">
<h1>Login</h1>
<form action="">
	<div class="int area">
			<input type="text" name="id" autocomplete="off" required>
			<label for="id">USER NAME</label>
	</div>
	<div class="int-area">
		<input id="password" name="pw" id="pw" autocomplete="off" required>
			<label for="pw">PASSWORD</label>
		</div>
		<div class="btn-area">
		<button id="btn" type="submit">Login</button>
		</div>
</form>
<div class="caption">
<a href="">Forget Password?</a>
<a href="">회원가입</a>
</div>
</section>

<script>
let id= $('#id');
let pw= $('#pw');
let btn=$('#btn');

$(btn).on('click', function){
	if($(id).val() =="" ){
		$(id).next('label').addClass('warning');
		setTimeout(function()) {
			$('label').removeClass('warning');
		}, 1500);
		else if($(pw).val() ==""){
			$(pw).next('label').addClass('warning');
			setTimeout(function()) {
				$('label').removeClass('warning');
			}, 1500);	
		}
		}
	});

</script>
</div>

	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="../js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="../js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="../js/bootstrap.min.js"></script>
		
</body>
</html>