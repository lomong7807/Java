package program;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int a = sc.nextInt();
		System.out.print("숫자입력 : ");
		int b = sc.nextInt();
		int sum = 0;
		
		if(a>b) {
			int[] c = new int[a-b+1];
			int length = a-b;
			
			for(int i = 0; i <= length ; i++) {
				c[i] = b;
				b++;
				sum += c[i];
			}
			
			System.out.print("결과: ");
			for(int i =0 ; i <= length ; i++) {
				System.out.print(c[i]);
				if(i != length) {
					System.out.print(",");
				}
			}
			System.out.println();
			System.out.println("합계: "+sum);
			
		}else if(a<b) {
			int [] c = new int[b-a+1];
			int length = b-a;
			
			for(int i = 0; i <= length ; i++) {
				c[i] = a;
				a++;
				sum += c[i];
			}
			
			System.out.print("결과: ");
			for(int i =0 ; i <= length ; i++) {
				System.out.print(c[i]);
				if(i != length) {
					System.out.print(",");
				}
			}
			System.out.println();
			System.out.println("합계: "+sum);
		}
		sc.close();
		
	}
}
