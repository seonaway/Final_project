<!-- 게시글 비밀번호가 일치할 시 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>

<link rel="stylesheet" type="text/css" href="css/notion.css">
<script type ="text/javascript" src="script/notion.js"></script>
</head>
<body>
	<script type="text/javascript">
	if(window. name == "update") {
		window.opener.parent.location.href =
			//"NotionServlet?command=notion_list"
			"NotionServlet?command=notion_update_form&nno=${param.nno}";
	} else if (window.name == 'delete') {
		alert('삭제되었습니다.');
		window.opener.parent.location.href=
			"NotionServlet?command=notion_delete&nno=${param.nno}";
	}
	window.close();
	</script>

</body>
</html>