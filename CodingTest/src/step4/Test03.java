package step4;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		min = arr[0];
		max = arr[0];
		
		for(int k = 1; k < arr.length; k++) {
			
			if(min > arr[k]) {
				min = arr[k];
			}
			
		}
		
		for(int k = 1; k < arr.length; k++) {
			
			if(max < arr[k]) {
				max = arr[k];
			}
			
		}
		sc.close();
		System.out.print(min+" ");
		System.out.print(max);
		
	}

}
