package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User [] users=new User[3];
		//User 클래스와 하위클래스를 모두 담을 수 있는 배열
		User u1 = new Customer("jws", "j1234","정우성",1000);
		User u2= new Customer("yjs", "y2345", "이효리", 2000);
		User u3 = new Employee("master","m7788","운영자",5000000);
		
		//세 명의 사용자를 배열에 등록
		//참조 자료형의 배열은 참조 객체의 주소가 할당
		//객체가 직접 들어가는 것는 아니다
		users[0]=u1;
		users[1]=u2;
		users[2]=u3;
		
		for (int i=0;i<users.length;i++)
		{
			users[i].showInfo();
			System.out.println();
			
		}
		//다운 캐스팅
		int salary=((Employee)u3).getSalary();
		System.out.printf("운영자의 월급은 %s",salary);
	}

}
