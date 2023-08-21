package step4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		int count = 0;
		
		for(int i = 0; i < a; i++) {
			
			int b = sc.nextInt();
			arr[i] = b;
		}
		
		int c = sc.nextInt();
		
		for(int k = 0; k < arr.length; k++) {
			
			if(arr[k] == c) {
				count++;
			}
			
		}
		System.out.println(count);
		sc.close();
	}

}
