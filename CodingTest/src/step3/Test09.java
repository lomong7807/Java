package step3;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
