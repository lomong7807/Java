package step4;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int c1 = 0;
		int c2 = 0;
		
		for(int a = 0; a < n; a++) {
			arr[a] = a+1;
		}
		
		for(int b = 0; b < m; b++) {
			
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			c1 = arr[i];
			c2 = arr[j];
			
			arr[i] = c2;
			arr[j] = c1;
			
		}
		
		for(int ball : arr) {
			System.out.print(ball+" ");
		}
		
		sc.close();
	}

}
