package com.aaa.entity;

public class Userenshrine {

	private Integer ueid;
	private Integer uid;
	private Integer uealbum;
	private Integer ueuser;
	public Integer getUeid() {
		return ueid;
	}
	public void setUeid(Integer ueid) {
		this.ueid = ueid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUealbum() {
		return uealbum;
	}
	public void setUealbum(Integer uealbum) {
		this.uealbum = uealbum;
	}
	public Integer getUeuser() {
		return ueuser;
	}
	public void setUeuser(Integer ueuser) {
		this.ueuser = ueuser;
	}
	@Override
	public String toString() {
		return "Userenshrine [ueid=" + ueid + ", uid=" + uid + ", uealbum="
				+ uealbum + ", ueuser=" + ueuser + "]";
	}
	public Userenshrine(Integer ueid, Integer uid, Integer uealbum,
			Integer ueuser) {
		super();
		this.ueid = ueid;
		this.uid = uid;
		this.uealbum = uealbum;
		this.ueuser = ueuser;
	}
	public Userenshrine() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
