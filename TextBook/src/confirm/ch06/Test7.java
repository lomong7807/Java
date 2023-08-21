package confirm.ch06;

import java.util.Scanner;

class Account1{
	private String account;
	private String name;
	private int balance;
	
	public Account1(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public String toString() {
		return this.account+"  "+this.name+"  "+this.balance+"  ";
	}
	
	public String getAccount() {
		return account;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
	}
	
	public void withdraw(int balance) {
		this.balance = this.balance-balance;
	}
}

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account1[] arr = new Account1[100];
		while(true) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			int a = sc.nextInt();
			
			if(a == 1) {
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");	
				String account = sc.next();
			
				System.out.print("계좌주: ");
				String name = sc.next();
				
				System.out.print("초기입금액: ");
				int balance = sc.nextInt();
				
				Account1 ac = new Account1(account, name, balance);

				for(int i = 0; i < 100; i++) {
					
					if(arr[i] == null) {
						
						arr[i] = ac;
						break;
					}
				}

				System.out.println("결과: 계좌가 생성되었습니다");
				
			}else if(a == 2) {
				System.out.println("--------------");
				System.out.println("계좌목록");
				System.out.println("--------------");
				
				for(int i = 0; i < 100; i++) {
					
					if(arr[i] != null) {
						
						System.out.println(arr[i].toString());
						
					}else if(arr[i] == null){
						break;
					}
					
				}
				
				
				
			}else if(a == 3) {

				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");
				String account = sc.next();
				
				System.out.print("예금액: ");
				int balance = sc.nextInt();
				
				for(int i = 0; i < 100; i++) {
					
					if(arr[i].getAccount().equals(account)) {
						arr[i].deposit(balance);
						break;
					}
					
				}
				System.out.println("결과: 예금이 성공되었습니다.");
				
			}else if(a == 4) {
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");
				String account = sc.next();
				
				System.out.print("출금액: ");
				int balance = sc.nextInt();
				
				for(int i = 0; i < 100; i++) {
					
					if(arr[i].getAccount().equals(account)) {
						arr[i].withdraw(balance);
						break;
					}
					
				}
				
				System.out.println("결과: 출금이 성공되었습니다.");
				
			}else if(a == 5) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
