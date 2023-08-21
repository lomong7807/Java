package sub1;
/**
 * 날짜: 2023/06/19
 * 이름: 강윤수
 * 내용: 무형
 */
// Car 클래스 정의 - 현실의 객체를 추상화하는 것
public class Car {

	// 필드(속성)  내가 갖고 있는 데이터
	String name;   //짓기 나름
	String color;
	int speed;
	
	// 어떠한 특징으로 추상화하여 클래스로 정의
	
	// 메서드(기능) 내가 취하는 모든게 기능
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
} //위 클래스를 가지고 객체를 만들어야 한다. new 연산자를 사용하여 객체 생성
