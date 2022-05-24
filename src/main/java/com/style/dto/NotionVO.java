package com.style.dto;

import java.sql.Timestamp;

public class NotionVO {
	private int nno;
	private String ntitle;
	private String ncontent;
	private String nkinds;
	private String ncount;
	private Timestamp ndate;
	private String status;
	private String emp_id;
	private String emp_nick;
	private String emp_pw;

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_nick() {
		return emp_nick;
	}

	public void setEmp_nick(String emp_nick) {
		this.emp_nick = emp_nick;
	}

	public String getEmp_pw() {
		return emp_pw;
	}

	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNkinds() {
		return nkinds;
	}

	public void setNkinds(String nkinds) {
		this.nkinds = nkinds;
	}

	public String getNcount() {
		return ncount;
	}

	public void setNcount(String ncount) {
		this.ncount = ncount;
	}

	public Timestamp getNdate() {
		return ndate;
	}

	public void setNdate(Timestamp ndate) {
		this.ndate = ndate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
