package com.aaa.entity;

import java.util.Date;

public class Comment {

	private Integer cid;
	private String ctitle;
	private Integer cuser;
	private Integer cusergo;
	private Integer cmusic;
	private Integer clike;
	private Date ctime;
	private Integer cstate;
	private Integer cerror;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCtitle() {
		return ctitle;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}
	public Integer getCuser() {
		return cuser;
	}
	public void setCuser(Integer cuser) {
		this.cuser = cuser;
	}
	public Integer getCusergo() {
		return cusergo;
	}
	public void setCusergo(Integer cusergo) {
		this.cusergo = cusergo;
	}
	public Integer getCmusic() {
		return cmusic;
	}
	public void setCmusic(Integer cmusic) {
		this.cmusic = cmusic;
	}
	public Integer getClike() {
		return clike;
	}
	public void setClike(Integer clike) {
		this.clike = clike;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Integer getCstate() {
		return cstate;
	}
	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}
	public Integer getCerror() {
		return cerror;
	}
	public void setCerror(Integer cerror) {
		this.cerror = cerror;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", ctitle=" + ctitle + ", cuser="
				+ cuser + ", cusergo=" + cusergo + ", cmusic=" + cmusic
				+ ", clike=" + clike + ", ctime=" + ctime + ", cstate="
				+ cstate + ", cerror=" + cerror + "]";
	}
	public Comment(Integer cid, String ctitle, Integer cuser, Integer cusergo,
			Integer cmusic, Integer clike, Date ctime, Integer cstate,
			Integer cerror) {
		super();
		this.cid = cid;
		this.ctitle = ctitle;
		this.cuser = cuser;
		this.cusergo = cusergo;
		this.cmusic = cmusic;
		this.clike = clike;
		this.ctime = ctime;
		this.cstate = cstate;
		this.cerror = cerror;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
