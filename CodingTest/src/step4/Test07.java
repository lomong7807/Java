package step4;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[31];
		
		
		for(int i = 1; i <= 28; i++) {
			int a = sc.nextInt();
			arr[a] = a;
		}
		
		for(int k = 1; k < arr.length; k++) {
			
			if(arr[k] == 0) {
				System.out.println(k);
			}
		}
		
		sc.close();
		
	}

}
