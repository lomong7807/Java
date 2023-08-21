package step3;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = n;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = b-1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
		}
		sc.close();
	}
}
