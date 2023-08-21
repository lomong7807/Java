package step3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		for(int d = 0; d < a; d++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.print(b + c);
			System.out.println();
		}
		sc.close();
		
	}

}
