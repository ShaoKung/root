package com.json.sample.model;

public class User {
	public String name;
	public String address;
	public int age;
	public String postCode;
	public String sex;
	public String[] major;

	public String[] getMajor() {
		return major;
	}

	public void setMajor(String[] major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public User() {
		super();
	}

	public User(String name, String address, String postCode, String sex,
			int age, String[] major) {
		super();
		this.address = address;
		this.age = age;
		this.major = major;
		this.name = name;
		this.postCode = postCode;
		this.sex = sex;
	}

	public String toString() {
		return "name:" + name + "," 
				+ "sex:" + sex + "," 
				+ "postCode:" + ","
				+ postCode + "," 
				+ "age:" + age + "," 
				+ "address:" + address;
	}

}
