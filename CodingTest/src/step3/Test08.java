package step3;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
			
			for(int k = 1 ; k <= t; k++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println("Case #"+k+": "+a+" + "+b+" = "+(a+b));
				
			}
			System.out.println();
			sc.close();
	}

}
