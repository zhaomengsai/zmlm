package com.aaa.entity;

public class Classify {

	private Integer cid;
	private String cname;
	private Integer ctime;
	private Integer cstate;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getCtime() {
		return ctime;
	}
	public void setCtime(Integer ctime) {
		this.ctime = ctime;
	}
	public Integer getCstate() {
		return cstate;
	}
	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}
	@Override
	public String toString() {
		return "Classify [cid=" + cid + ", cname=" + cname + ", ctime=" + ctime
				+ ", cstate=" + cstate + "]";
	}
	public Classify(Integer cid, String cname, Integer ctime, Integer cstate) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctime = ctime;
		this.cstate = cstate;
	}
	public Classify() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
