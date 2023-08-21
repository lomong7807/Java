package step4;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			
			int a = sc.nextInt();
			
			arr[i] = a;
		}
		
		max = arr[0];
		
		for(int k = 0; k < 9; k++) {
			
			if(max < arr[k]) {
				max = arr[k];
			}
		}
		
		System.out.println(max);
		
		for(int count = 0; count < 9; count++) {
			
			if(max == arr[count]) {
				System.out.println(count+1);
			}
		}
		
		sc.close();
	}
}
