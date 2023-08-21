package sub5;

//Car의 Child
public class Sedan extends Car {
	
	//필드값
	private int cc;
	
	
	//생성자
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
		
	}
	
	//메서드
	public void speedTurbo() {
		this.speed += 20;			//부모의 필드 값을 protected로 바꿔줘야 됨.
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : "+ this.cc);
	}

}
