package com.javaex.ex04;

public class User {
	protected String id; 
	protected String password;
	protected String name;
	
	public User() {
	}
	public User(String id,String password,String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password=password;
		
	}
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.printf("아이디 %s 패스워드 %s 이름 %s",
				id,password,name);
		System.out.println();
	}
	}
