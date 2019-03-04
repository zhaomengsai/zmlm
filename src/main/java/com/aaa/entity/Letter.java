package com.aaa.entity;

import java.util.Date;

public class Letter {

	private Integer lid;
	private String ltitle;
	private Integer luser;
	private Integer lusergo;
	private Date lutime;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLtitle() {
		return ltitle;
	}
	public void setLtitle(String ltitle) {
		this.ltitle = ltitle;
	}
	public Integer getLuser() {
		return luser;
	}
	public void setLuser(Integer luser) {
		this.luser = luser;
	}
	public Integer getLusergo() {
		return lusergo;
	}
	public void setLusergo(Integer lusergo) {
		this.lusergo = lusergo;
	}
	public Date getLutime() {
		return lutime;
	}
	public void setLutime(Date lutime) {
		this.lutime = lutime;
	}
	@Override
	public String toString() {
		return "Letter [lid=" + lid + ", ltitle=" + ltitle + ", luser=" + luser
				+ ", lusergo=" + lusergo + ", lutime=" + lutime + "]";
	}
	public Letter(Integer lid, String ltitle, Integer luser, Integer lusergo,
			Date lutime) {
		super();
		this.lid = lid;
		this.ltitle = ltitle;
		this.luser = luser;
		this.lusergo = lusergo;
		this.lutime = lutime;
	}
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
