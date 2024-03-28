package com.javaex.ex04;

public class Employee extends User {
	private static int salary;
	public Employee() {
	}
	public Employee(int salary)
	{
		super(null,null,null);
		this.salary=salary;
	}
	public Employee(String id,String password, 
			String name,int salary) {
		super(id,password,name);
		this.salary=salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public void showInfo() {
		System.out.printf("아이디 %s 패스워드 %s 이름 %s"
				+ "연봉 %d",
				super.getId(),super.getPassword(),super.getName()
				,salary);
		System.out.println();
	}
	

	
}
