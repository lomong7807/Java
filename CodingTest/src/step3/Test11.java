package step3;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum = a+b;
			if(!(sum == 0)) {
				System.out.println(sum);
			}
		}while(!(sum == 0));
		
		
		sc.close();
	}

}
