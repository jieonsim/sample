package com.spring.sample.vo;

public class S0611VO {
	private String mid;
	private String pwd;
	private int age;
	private int gender;
	private String strGender;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getStrGender() {
		return strGender;
	}

	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}

	@Override
	public String toString() {
		return "S0611VO [mid=" + mid + ", pwd=" + pwd + ", age=" + age + ", gender=" + gender + ", strGender="
				+ strGender + ", name=" + name + "]";
	}

}
