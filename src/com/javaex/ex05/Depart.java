package com.javaex.ex05;

public class Depart extends Employee {
	private String depart;
	 //코드작성
	public Depart(String depart) {
		super(null,0);
		this.depart=depart;
	}
	public Depart(String name,int salary,String depart) {
		super(name,salary);
		this.depart=depart;
	}
	public String getdepart() {
		return depart;
	}
	public void setSalary(String depart) {
		this.depart=depart;
	}
	public void showInformation() {
        System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary()+
        	"부서:"+depart);
    }
}
