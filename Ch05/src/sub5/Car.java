package sub5;

//Sedan의 Parent
public class Car {
	
	//필드값 ( private에서 protected로 접근권한 변경해서 호출
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//메서드
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
		
	}
	

}
