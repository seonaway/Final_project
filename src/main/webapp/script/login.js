function membermanagementCheck(){
	if(document.frm.mem_id.value.length == 0 ){
		alert("아이디를 입력하세요.");
		return false;
	}
	if(document.frm.mem_pwd.value.length == 0){
		alert("비밀번호를 입력하세요.");
		return false;
	}
	return true;
}

function open_win(url, name) {
	window.open(url,name, "width=500, height=230");
}