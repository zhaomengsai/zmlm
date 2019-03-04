package com.aaa.entity;

public class Activity {

	private Integer acid;
	private String acname;
	private String achead;
	private String acurl;
	public Integer getAcid() {
		return acid;
	}
	public void setAcid(Integer acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public String getAchead() {
		return achead;
	}
	public void setAchead(String achead) {
		this.achead = achead;
	}
	public String getAcurl() {
		return acurl;
	}
	public void setAcurl(String acurl) {
		this.acurl = acurl;
	}
	@Override
	public String toString() {
		return "Activity [acid=" + acid + ", acname=" + acname + ", achead="
				+ achead + ", acurl=" + acurl + "]";
	}
	public Activity(Integer acid, String acname, String achead, String acurl) {
		super();
		this.acid = acid;
		this.acname = acname;
		this.achead = achead;
		this.acurl = acurl;
	}
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
