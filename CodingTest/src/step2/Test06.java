package step2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if( a >= 0 && (b+c) < 60 ) {
			d = (b+c);
		}else if(b+c >= 60) {
				a += (b+c) / 60;
				d += (b+c) % 60;
				if(a > 24) {
					a = (a % 24);
				}
			}
		if(a == 24) {
			a = 0;
		}
		if(d == 60) {
			d = 0;
		}
			System.out.print(a+" ");
			System.out.println(d);
			
			sc.close();
	}
}
