package com.aaa.entity;

public class Admins {

	private Integer aid;
	private String aname;
	private String apwd;
	private String zname;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public Admins(Integer aid, String aname, String apwd, String zname) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apwd = apwd;
		this.zname = zname;
	}
	@Override
	public String toString() {
		return "Admins [aid=" + aid + ", aname=" + aname + ", apwd=" + apwd
				+ ", zname=" + zname + "]";
	}
	public Admins() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
