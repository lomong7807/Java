package sub5;

public class Account {

	//필드
	protected String name;
	protected String id;
	protected String bank;
	protected int balance;
	
	public Account() {
		
	}
	
	public Account(String name, String id, String bank, int balance) {
		this.name = name;
		this.id = id;
		this.bank = bank;
		this.balance = balance;
	}
	
	
	//메서드(기능)
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행 : "+ this.bank);
		System.out.println("계좌번호 : "+ this.id);
		System.out.println("입금주 : "+ this.name);
		System.out.println("현재잔액 : "+ this.balance);
		System.out.println("--------------------");
	}
	
}
