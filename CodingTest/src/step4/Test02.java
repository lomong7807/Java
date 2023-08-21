package step4;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i = 0; i < a; i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		
		for(int k = 0; k < arr.length; k++) {
			
			if(arr[k] < b) {
				System.out.println(arr[k]);
			}
			
		}
		sc.close();
	}
}
