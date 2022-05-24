function productCheck() {
	
	if(document.frm.pname.value.length ==0) {
		alert("상품명을 입력하세요");
		frm.pname.focus();
		return false;
	}
	if(document.frm.pbrand.value.length == 0) {
		alert("브랜드 명을 입력하세요.");
		frm.pbrand.focus();
		return false;
	}
	
	if(document.frm.pprice.value.length ==0) {
		alert("상품가격을 입력하세요");
		frm.pprice.focus();
		return false;
	}
	
	if(document.frm.pmodel.value.length == 0) {
		alert("상품 모델 번호를 입력하세요.");
		frm.pmodel.focus();
		return false;
	}
	
	if(document.frm.pdetail.value.length == 0) {
		alert("상품 상세 정보를 입력하세요.");
		frm.pdetail.focus();
		return false;
	}
	
	if(document.frm.pkind.value.length == 0) {
		alert("상품 카테고리를 입력하세요.");
		frm.pkind.focus();
		return false;
	}
	
	if(document.frm.pgrade.value.length == 0) {
		alert("상품 등급을 입력하세요.");
		frm.pgrade.focus();
		return false;
	}
	
	if(document.frm.pquantity.value.length == 0) {
		alert("상품 수량을 입력하세요.");
		frm.pquantity.focus();
		return false;
	}
	
	return true;
}