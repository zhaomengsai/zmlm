package com.aaa.entity;

import java.util.Date;

public class Album {

	private Integer alid;
	private String alname;
	private Integer aclassify;
	private Double amoney;
	private String ahead;
	private Integer asize;
	private String aintro;
	private Integer auser;
	private Integer alike;
	private Date altime;
	private Integer anumber;
	private Integer astate;
	public Integer getAlid() {
		return alid;
	}
	public void setAlid(Integer alid) {
		this.alid = alid;
	}
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public Integer getAclassify() {
		return aclassify;
	}
	public void setAclassify(Integer aclassify) {
		this.aclassify = aclassify;
	}
	public Double getAmoney() {
		return amoney;
	}
	public void setAmoney(Double amoney) {
		this.amoney = amoney;
	}
	public String getAhead() {
		return ahead;
	}
	public void setAhead(String ahead) {
		this.ahead = ahead;
	}
	public Integer getAsize() {
		return asize;
	}
	public void setAsize(Integer asize) {
		this.asize = asize;
	}
	public String getAintro() {
		return aintro;
	}
	public void setAintro(String aintro) {
		this.aintro = aintro;
	}
	public Integer getAuser() {
		return auser;
	}
	public void setAuser(Integer auser) {
		this.auser = auser;
	}
	public Integer getAlike() {
		return alike;
	}
	public void setAlike(Integer alike) {
		this.alike = alike;
	}
	public Date getAltime() {
		return altime;
	}
	public void setAltime(Date altime) {
		this.altime = altime;
	}
	public Integer getAnumber() {
		return anumber;
	}
	public void setAnumber(Integer anumber) {
		this.anumber = anumber;
	}
	public Integer getAstate() {
		return astate;
	}
	public void setAstate(Integer astate) {
		this.astate = astate;
	}
	@Override
	public String toString() {
		return "Album [alid=" + alid + ", alname=" + alname + ", aclassify="
				+ aclassify + ", amoney=" + amoney + ", ahead=" + ahead
				+ ", asize=" + asize + ", aintro=" + aintro + ", auser="
				+ auser + ", alike=" + alike + ", altime=" + altime
				+ ", anumber=" + anumber + ", astate=" + astate + "]";
	}
	public Album(Integer alid, String alname, Integer aclassify, Double amoney,
			String ahead, Integer asize, String aintro, Integer auser,
			Integer alike, Date altime, Integer anumber, Integer astate) {
		super();
		this.alid = alid;
		this.alname = alname;
		this.aclassify = aclassify;
		this.amoney = amoney;
		this.ahead = ahead;
		this.asize = asize;
		this.aintro = aintro;
		this.auser = auser;
		this.alike = alike;
		this.altime = altime;
		this.anumber = anumber;
		this.astate = astate;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
