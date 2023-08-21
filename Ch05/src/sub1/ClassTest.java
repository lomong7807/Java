package sub1;


/**
 * 날짜: 2023/06/19
 * 이름: 강윤수
 * 내용: Java 클래스 실습하기
 * 
 * 클래스와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 *  - 객체(Object)는 클래스의 실제 인스턴스(메모리 힙에 저장되는 클래스의 실체), new 연산으로 생성
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// 객체(Object) 생성 - 참조 변수(참조값을 가진다)0
		Car sonata = new Car(); // 변수 선언
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 선언, 생성과 초기화
		Car avante; //선언 
		avante = new Car(); //생성
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		
		// 객체 초기화
		kb.name = "김유신";
		kb.bank = "국민은행";
		kb.id = "123-123-1111";
		kb.balance = 10000;
		
		//객체 활용
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		// Account 객체 생성과 초기화, 활용
		Account wr = new Account();
		wr.name = "장보고";
		wr.bank = "우리은행";
		wr.id = "123-123-2222";
		wr.balance = 50000;
		
		wr.deposit(50000);
		wr.withdraw(30000);
		wr.show();
		
	} // main end
}
