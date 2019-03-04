package com.aaa.entity;

import java.util.Date;

public class Indent {

	private Integer inid;
	private Integer inuser;
	private Integer inusergo;
	private double inmoney;
	private Date intime;
	public Integer getInid() {
		return inid;
	}
	public void setInid(Integer inid) {
		this.inid = inid;
	}
	public Integer getInuser() {
		return inuser;
	}
	public void setInuser(Integer inuser) {
		this.inuser = inuser;
	}
	public Integer getInusergo() {
		return inusergo;
	}
	public void setInusergo(Integer inusergo) {
		this.inusergo = inusergo;
	}
	public double getInmoney() {
		return inmoney;
	}
	public void setInmoney(double inmoney) {
		this.inmoney = inmoney;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	@Override
	public String toString() {
		return "Indent [inid=" + inid + ", inuser=" + inuser + ", inusergo="
				+ inusergo + ", inmoney=" + inmoney + ", intime=" + intime
				+ "]";
	}
	public Indent(Integer inid, Integer inuser, Integer inusergo,
			double inmoney, Date intime) {
		super();
		this.inid = inid;
		this.inuser = inuser;
		this.inusergo = inusergo;
		this.inmoney = inmoney;
		this.intime = intime;
	}
	public Indent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
