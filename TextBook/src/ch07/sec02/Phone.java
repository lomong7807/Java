package ch07.sec02;

public class Phone {
	
	//필드 선언
	protected String model;
	protected String color;
	protected String message;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		this.message = message;
		System.out.println("자기: "+message);
	}
	public void receiveVoice(String message) {
		this.message = message;
		System.out.println("상대방: "+message);
	}
	
	public void hangUp(){
		System.out.println("전화를 끊습니다.");
	}
}
