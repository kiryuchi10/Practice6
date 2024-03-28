package com.javaex.ex04;

public class Customer extends User {
	private int point;
	
	public Customer() {
	}
	public Customer(int point)
	{
		super(null,null,null);
		this.point=point;
	}
	public Customer(String name,String id,String password
			,int point) {
		super(id,name,password);
		this.point=point;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	public int getPoint() {
		return point;
	}
	@Override
	public void showInfo() {
		System.out.printf("아이디 %s,패스워드 %s,이름 %s, 포인트 %d",
				super.getId(),super.getPassword(),super.getName(),point);
	}
	

	
	

}
