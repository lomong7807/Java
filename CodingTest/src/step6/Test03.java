package step6;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i < a*2; i++) {
			
			if(i <= a) {
				for(int k = a-i; k > 0; k--) {
					System.out.print(" ");
				}
				
				for(int j = 1; j <= (i*2)-1; j++) {
					System.out.print("*");
				}
			}
			if(i > a) {
				for(int k = i-1; k > 0; k--) {
					System.out.print(" ");
				}
				
				for(int j = 4; j < (i*2)-1; j--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		sc.close();
	}
}
