package com.aaa.entity;

public class Black {

	private Integer bid;
	private Integer buser;
	private Integer busergo;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getBuser() {
		return buser;
	}
	public void setBuser(Integer buser) {
		this.buser = buser;
	}
	public Integer getBusergo() {
		return busergo;
	}
	public void setBusergo(Integer busergo) {
		this.busergo = busergo;
	}
	public Black(Integer bid, Integer buser, Integer busergo) {
		super();
		this.bid = bid;
		this.buser = buser;
		this.busergo = busergo;
	}
	public Black() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Black [bid=" + bid + ", buser=" + buser + ", busergo="
				+ busergo + "]";
	}
}
