package step5;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int n = sc.nextInt();
		
		System.out.println(s.charAt(n-1));
		sc.close();
	}

}
