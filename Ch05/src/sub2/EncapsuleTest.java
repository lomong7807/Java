package sub2;

/**
 * 날짜: 2023/06/19
 * 이름: 강윤수
 * 내용: Java 캡슐화 실습하기
 * 
 * 캡슐화(정보 은닉, Encapsulation)
 * 	- 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보를 은닉하는 특성
 * 	- 클래스의 속성(필드)은 반드시 private 선언을 통해 캡슐화를 한다.
 *  - private 속성의 초기화를 위해 생성자(Constructor) 정의
 * 	- 은닉된 정보(캡슐화된 정보)의 안전한 사용을 위해서 Getter, Setter 제공해야 한다.
 */

public class EncapsuleTest {
	
	
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		//sonata.name = "소나타";  		//sonata.(이게 보이면 안됨) < 이걸 캡슐화 해준다
		//sonata.color = "흰색";
		//sonata.speed = 10;
		sonata.setName("그랜져");			
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//Car 객체 생성 초기화
		Car avante = new Car("아반테", "검은색", 10);
		avante.setColor("남색");			// avante.color = "남색" <<<이렇게 (X)
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성 초기화
		Account kb = new Account("국민은행", "123-456-78910", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(25000);
		kb.show();
		
		Account wr = new Account("우리은행", "123-456-12345", "김춘추", 1000);
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
		
	}

}
