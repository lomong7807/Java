package test0705;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int b = 0 ; b <= a ; b++) {
			
			for(int i = a-1 ; i >= b ; i--) {
				System.out.print(" ");
			}
			
			for(int s = 0; s < b ; s++) {
				System.out.print("＊");
			}
			
			
			System.out.println();
		}
		sc.close();
	}

}


