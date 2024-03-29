package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    private String str;
	@Override
    public void execute(String str){
        this.str=str;
        //코드작성
    	
    	Appstart(str);
    	download(str);
    	if("통화".equals(str)){
    		super.execute(str);
    	}
    }
 
    //메소드작성
    public void download(String str) {
    	if("음악".equals(str)){
    	System.out.println("다운로드해서 음악재생");
    	}

    }
    
    //메소드작성
    public void Appstart (String str) {
    	if("앱".equals(str))
    	{
    		System.out.println("앱실행");  
    	}
    }
    @Override
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
}
