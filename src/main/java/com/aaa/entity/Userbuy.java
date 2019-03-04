package com.aaa.entity;

public class Userbuy {

	private Integer ubid;
	private Integer uid;
	private Integer ubalbum;
	private Integer ubuser;
	private double ubmoney;
	public Integer getUbid() {
		return ubid;
	}
	public void setUbid(Integer ubid) {
		this.ubid = ubid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUbalbum() {
		return ubalbum;
	}
	public void setUbalbum(Integer ubalbum) {
		this.ubalbum = ubalbum;
	}
	public Integer getUbuser() {
		return ubuser;
	}
	public void setUbuser(Integer ubuser) {
		this.ubuser = ubuser;
	}
	public double getUbmoney() {
		return ubmoney;
	}
	public void setUbmoney(double ubmoney) {
		this.ubmoney = ubmoney;
	}
	@Override
	public String toString() {
		return "Userbuy [ubid=" + ubid + ", uid=" + uid + ", ubalbum="
				+ ubalbum + ", ubuser=" + ubuser + ", ubmoney=" + ubmoney + "]";
	}
	public Userbuy(Integer ubid, Integer uid, Integer ubalbum, Integer ubuser,
			double ubmoney) {
		super();
		this.ubid = ubid;
		this.uid = uid;
		this.ubalbum = ubalbum;
		this.ubuser = ubuser;
		this.ubmoney = ubmoney;
	}
	public Userbuy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
