package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int a = 1 ; a <= 9 ; a ++) {
			System.out.println(n+" * "+ a+" = "+(n*a));
		}
		
		sc.close();
	}

}
