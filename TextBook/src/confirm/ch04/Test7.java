package confirm.ch04;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			
			int a = sc.nextInt();
			String b;
			
			if(a == 1) {
				System.out.print("예금액> ");
				b = sc.next();
				
			}else if(a == 2) {
				System.out.print("출금액> ");
				b = sc.next();
			}else if(a == 3) {
				System.out.print("잔고> ");
				b = sc.next();
			}else if(a == 4) {
				break;
			}

		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	
}
