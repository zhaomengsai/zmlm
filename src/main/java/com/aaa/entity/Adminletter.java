package com.aaa.entity;

import java.util.Date;

public class Adminletter {

	private Integer alid;
	private String altitle;
	private Integer aluser;
	private Integer alusergo;
	private Date alutime;
	public Integer getAlid() {
		return alid;
	}
	public void setAlid(Integer alid) {
		this.alid = alid;
	}
	public String getAltitle() {
		return altitle;
	}
	public void setAltitle(String altitle) {
		this.altitle = altitle;
	}
	public Integer getAluser() {
		return aluser;
	}
	public void setAluser(Integer aluser) {
		this.aluser = aluser;
	}
	public Integer getAlusergo() {
		return alusergo;
	}
	public void setAlusergo(Integer alusergo) {
		this.alusergo = alusergo;
	}
	public Date getAlutime() {
		return alutime;
	}
	public void setAlutime(Date alutime) {
		this.alutime = alutime;
	}
	@Override
	public String toString() {
		return "Adminletter [alid=" + alid + ", altitle=" + altitle
				+ ", aluser=" + aluser + ", alusergo=" + alusergo
				+ ", alutime=" + alutime + "]";
	}
	public Adminletter(Integer alid, String altitle, Integer aluser,
			Integer alusergo, Date alutime) {
		super();
		this.alid = alid;
		this.altitle = altitle;
		this.aluser = aluser;
		this.alusergo = alusergo;
		this.alutime = alutime;
	}
	public Adminletter() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
