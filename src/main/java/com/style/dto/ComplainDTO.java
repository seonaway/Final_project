package com.style.dto;

import java.sql.Timestamp;

public class ComplainDTO {
	private int num;
	private String comp_kind;
	private String id;
	private String name;
	private String title;
	private String content;
	private int readcount;
	private Timestamp writedate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getComp_kind() {
		return comp_kind;
	}
	public void setComp_kind(String comp_kind) {
		this.comp_kind = comp_kind;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public Timestamp getWritedate() {
		return writedate;
	}
	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}
	
	
}
