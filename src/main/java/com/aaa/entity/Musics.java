package com.aaa.entity;

import java.util.Date;

public class Musics {

	private Integer mid;
	private Integer malbum;
	private String mname;
	private String mhead;
	private Integer muser;
	private Date mtime;
	private Integer mnumber;
	private String mintro;
	private Integer mstate;
	private String murl;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getMalbum() {
		return malbum;
	}
	public void setMalbum(Integer malbum) {
		this.malbum = malbum;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMhead() {
		return mhead;
	}
	public void setMhead(String mhead) {
		this.mhead = mhead;
	}
	public Integer getMuser() {
		return muser;
	}
	public void setMuser(Integer muser) {
		this.muser = muser;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public Integer getMnumber() {
		return mnumber;
	}
	public void setMnumber(Integer mnumber) {
		this.mnumber = mnumber;
	}
	public String getMintro() {
		return mintro;
	}
	public void setMintro(String mintro) {
		this.mintro = mintro;
	}
	public Integer getMstate() {
		return mstate;
	}
	public void setMstate(Integer mstate) {
		this.mstate = mstate;
	}
	public String getMurl() {
		return murl;
	}
	public void setMurl(String murl) {
		this.murl = murl;
	}
	@Override
	public String toString() {
		return "Musics [mid=" + mid + ", malbum=" + malbum + ", mname=" + mname
				+ ", mhead=" + mhead + ", muser=" + muser + ", mtime=" + mtime
				+ ", mnumber=" + mnumber + ", mintro=" + mintro + ", mstate="
				+ mstate + ", murl=" + murl + "]";
	}
	public Musics(Integer mid, Integer malbum, String mname, String mhead,
			Integer muser, Date mtime, Integer mnumber, String mintro,
			Integer mstate, String murl) {
		super();
		this.mid = mid;
		this.malbum = malbum;
		this.mname = mname;
		this.mhead = mhead;
		this.muser = muser;
		this.mtime = mtime;
		this.mnumber = mnumber;
		this.mintro = mintro;
		this.mstate = mstate;
		this.murl = murl;
	}
	public Musics() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
