function notionCheck() {
	
	if(document.frm.nkinds.value.length ==0) {
		alert("분류를 입력하세요");
		return false;
	}
	if(document.frm.ntitle.value.length == 0) {
		alert("제목을 입력하세요.");
		return false;
	}
	
	if(document.frm.emp_pw.value.length ==0) {
		alert("올바른 비밀번호를 입력하세요");
		return false;
	}
	
	if(document.frm.ncontent.value.length == 0) {
		alert("내용을 입력하세요.");
		return false;
	}
	
	return true;
}
function open_win(url, name) {
	window.open(url, name, "width=500, height=230");
}
function passCheck() {
	if(document.frm.emp_pw.value.length ==0) {
		alery("비밀번호를 입력하세요.");
		return false;
	}
	return true;
}