package step4;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int l = 0; l < m; l++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			while(i <= j) {
				
				arr[i-1] = k;
				i++;
			}
			
		}
		
		for(int ball : arr) {
			System.out.println(ball);
		}
		sc.close();
		
	}

}
