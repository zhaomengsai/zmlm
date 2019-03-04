package com.aaa.entity;

public class Userlike {

	private Integer ulid;
	private Integer uid;
	private Integer ualbum;
	private Integer uluser;
	public Integer getUlid() {
		return ulid;
	}
	public void setUlid(Integer ulid) {
		this.ulid = ulid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUalbum() {
		return ualbum;
	}
	public void setUalbum(Integer ualbum) {
		this.ualbum = ualbum;
	}
	public Integer getUluser() {
		return uluser;
	}
	public void setUluser(Integer uluser) {
		this.uluser = uluser;
	}
	@Override
	public String toString() {
		return "Userlike [ulid=" + ulid + ", uid=" + uid + ", ualbum=" + ualbum
				+ ", uluser=" + uluser + "]";
	}
	public Userlike(Integer ulid, Integer uid, Integer ualbum, Integer uluser) {
		super();
		this.ulid = ulid;
		this.uid = uid;
		this.ualbum = ualbum;
		this.uluser = uluser;
	}
	public Userlike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
