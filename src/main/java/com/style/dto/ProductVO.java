package com.style.dto;

import java.sql.Timestamp;

public class ProductVO {
	private Integer pnum;
	private String pname;
	private String pbrand;
	private Integer pprice;
	private Integer pnew_price;
	private String pmodel;
	private String pgrade;
	private String pdetail;
	private String pkind;
	private Timestamp pdate;
	private Integer pquantity;
	private String ppictureUrl;

	public Integer getPnum() {
		return pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public Integer getPprice() {
		return pprice;
	}

	public void setPprice(Integer pprice) {
		this.pprice = pprice;
	}

	public Integer getPnew_price() {
		return pnew_price;
	}

	public void setPnew_price(Integer pnew_price) {
		this.pnew_price = pnew_price;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public String getPgrade() {
		return pgrade;
	}

	public void setPgrade(String pgrade) {
		this.pgrade = pgrade;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	public String getPkind() {
		return pkind;
	}

	public void setPkind(String pkind) {
		this.pkind = pkind;
	}

	public Timestamp getPdate() {
		return pdate;
	}

	public void setPdate(Timestamp pdate) {
		this.pdate = pdate;
	}

	public Integer getPquantity() {
		return pquantity;
	}

	public void setPquantity(Integer pquantity) {
		this.pquantity = pquantity;
	}

	public String getPpictureUrl() {
		return ppictureUrl;
	}

	public void setPpictureUrl(String ppictureUrl) {
		this.ppictureUrl = ppictureUrl;
	}

}