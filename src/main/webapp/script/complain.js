function complainCheck(){
	if(document.frm.id.value.length == 0 ){
		alert("아이디를 입력하세요.");
		return false;
	}
	if(document.frm.title.value.length == 0){
		alert("제목을 입력하세요.");
		return false;
	}
	if(document.frm.content.value.length == 0){
		alert("내용을 입력하세요.");
		return false;
	}
	return true;
}

function open_win(url, name) {
	window.open(url,name, "width=500, height=230");
}