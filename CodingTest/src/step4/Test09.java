package step4;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int num1 = 0;
		int num2 = 0;
		
		for(int a = 0; a < n; a++) {
			arr[a] = a+1;
		}
		
		for(int b = 0; b < m; b++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			while(i<j) {
				num1 = arr[i-1];
				num2 = arr[j-1];
				arr[j-1] = num1;
				arr[i-1] = num2;
				i++;
				j--;
			}
			
		}
		
		sc.close();
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if(i < n-1) {
				System.out.print(" ");
			}
		}
	}

}
