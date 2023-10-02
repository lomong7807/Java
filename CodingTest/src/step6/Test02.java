package step6;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int[] a = {1, 1, 2, 2, 2, 8};
		
		Scanner sc = new Scanner(System.in);
		
		int[] b = new int[6];
		
		for(int k = 0; k <= 5; k++) {
			b[k] = sc.nextInt();
		}
		
		int[] c = new int[6];
		
		for(int i = 0; i <= 5; i++) {
			
			if(a[i] < b[i]) {
				c[i] = a[i] - b[i];
			}
			
			System.out.print(c[i]);
		}
		sc.close();
	}
}
