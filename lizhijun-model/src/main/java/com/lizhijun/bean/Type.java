package com.lizhijun.bean;

public class Type {

	private Integer tid;
	private String tname;
	private Integer bcount;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(Integer tid, String tname, Integer bcount) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.bcount = bcount;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getBcount() {
		return bcount;
	}
	public void setBcount(Integer bcount) {
		this.bcount = bcount;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + ", bcount=" + bcount + "]";
	}
	
	
}
