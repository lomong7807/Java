package step3;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}while(sc.hasNext());
		
		sc.close();
	}

}
