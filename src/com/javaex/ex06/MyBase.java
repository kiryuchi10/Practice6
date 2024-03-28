package com.javaex.ex06;

public class MyBase extends Base{
    private String state;

	//코드작성
    public MyBase() {
    	this.state=state;
    }
    public MyBase(String state) {
    	this.state=state;
    }
    public void service(String state) {
        this.state=state;
        day();
        night();
        afternoon();
     }
     public void day() {
     	if(state=="낮") {
         System.out.println("낮에는 열심히 수업듣자");
     	}
     }

     public void night() {
     	if(state=="밤") {
             System.out.println("낮에는 열심히 수업듣자");
         	}
     }
     
     public void afternoon(){
     	if(state=="낮") {
     		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
         	}
     	
     }
}
