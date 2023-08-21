package step5;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		String a = sc.next();
		
		System.out.print(a.charAt(0));
		System.out.println(a.charAt(a.length()-1));
		}
		sc.close();
	}

}
