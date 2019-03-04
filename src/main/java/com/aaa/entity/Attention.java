package com.aaa.entity;

public class Attention {

	private Integer atid;
	private Integer atuser;
	private Integer atusergo;
	public Integer getAtid() {
		return atid;
	}
	public void setAtid(Integer atid) {
		this.atid = atid;
	}
	public Integer getAtuser() {
		return atuser;
	}
	public void setAtuser(Integer atuser) {
		this.atuser = atuser;
	}
	public Integer getAtusergo() {
		return atusergo;
	}
	public void setAtusergo(Integer atusergo) {
		this.atusergo = atusergo;
	}
	@Override
	public String toString() {
		return "Attention [atid=" + atid + ", atuser=" + atuser + ", atusergo="
				+ atusergo + "]";
	}
	public Attention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attention(Integer atid, Integer atuser, Integer atusergo) {
		super();
		this.atid = atid;
		this.atuser = atuser;
		this.atusergo = atusergo;
	}
	
	

}
