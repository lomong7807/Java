package step2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if(a == b && b == c) {
			d = 10000 + b * 1000;
		}else if(a == b || b == c || a == c) {
			if(a == b) {
				d = 1000 + a * 100;
			}else if(b == c || a == c) {
				d = 1000 + c * 100;
			}
		}else if(a > b && a > c) {
			d = a * 100;
		}else if(b > a && b > c) {
			d = b * 100;
		}else {
			d = c * 100;
		}
		System.out.println(d);
		
		sc.close();
	}
}
