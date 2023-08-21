package sub6;

/*
 * 날짜: 2023/06/21
 * 이름: 강윤수
 * 내용: Java 오버라이드 실습하기
 * 
 * 오버라이드(메서드 재정의)
 *  - 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 *  - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성을 구현
 */

class AAA {
	public void method1() {
		System.out.println("AAA : method1...");
	}
	
	public void method2() {
		System.out.println("AAA : method2...");
	}
	// Overload
	public void method3() {
		System.out.println("AAA : method3...");
	}
}


class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB : method2...");  // AAA의 method2 상속
	}
	// Overload
	public void method3(int a) {
		System.out.println("BBB : method3...");  // AAA의 method3 상속
	}
}


class CCC extends BBB {
	@Override
	public void method1() {
		System.out.println("CCC : method1...");  
	}
	@Override
	public void method2() {
		System.out.println("CCC : method2...");
	}
	// Overload 이건 매개변수(입력값)으로 구분되기 때문에 오버라이드가 아닌 오버로드로 구분하면 됨
	public void method3(int a, int b) {
		System.out.println("CCC : method3...");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		//오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1();				// method1은 오버라이드 메서드로 AAA의 method1에 덮어씌워짐
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		
		
		// Car상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
		
		
		
		
		
		
		
		
		
	}
}
