package sub1;
/**
 * 날짜: 2023/06/19
 * 이름: 강윤수
 * 내용: 무형
 */
public class Account {

	// 속성
	String bank;
	String id;
	String name;
	int balance;
	
	// 기능
	public void deposit(int money) {
		this.balance += money;			//this는 클래스의 속성인 balance를 가르킴.
	}
	
	public void withdraw(int money) {
		this.balance -= money;
		
		
	}
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행명 : "+ this.bank);
		System.out.println("계좌번호 : "+ this.id);
		System.out.println("입금주 : "+ this.name);
		System.out.println("현재잔액 : "+ this.balance);
		System.out.println("--------------------");
		
	}
	
	
	
	
}
