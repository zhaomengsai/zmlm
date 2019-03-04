package com.aaa.entity;

import java.util.Date;

public class Users {

	private Integer uid;
	private String uname;
	private String upwd;
	private String uhead;
	private String uqq;
	private String sex;
	private String phone;
	private String address;
	private String name;
	private Date birthday;
	private String intro;
	private Integer safety;
	private Integer errors;
	private double wallet;
	private Integer state;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUhead() {
		return uhead;
	}
	public void setUhead(String uhead) {
		this.uhead = uhead;
	}
	public String getUqq() {
		return uqq;
	}
	public void setUqq(String uqq) {
		this.uqq = uqq;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public Integer getSafety() {
		return safety;
	}
	public void setSafety(Integer safety) {
		this.safety = safety;
	}
	public Integer getErrors() {
		return errors;
	}
	public void setErrors(Integer errors) {
		this.errors = errors;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", uhead=" + uhead + ", uqq=" + uqq + ", sex=" + sex
				+ ", phone=" + phone + ", address=" + address + ", name="
				+ name + ", birthday=" + birthday + ", intro=" + intro
				+ ", safety=" + safety + ", errors=" + errors + ", wallet="
				+ wallet + ", state=" + state + "]";
	}
	public Users(Integer uid, String uname, String upwd, String uhead,
			String uqq, String sex, String phone, String address, String name,
			Date birthday, String intro, Integer safety, Integer errors,
			double wallet, Integer state) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.uhead = uhead;
		this.uqq = uqq;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.name = name;
		this.birthday = birthday;
		this.intro = intro;
		this.safety = safety;
		this.errors = errors;
		this.wallet = wallet;
		this.state = state;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
