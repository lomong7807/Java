package step5;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String a = "abcdefghijklmnopqrstuvwxyz";
		
		int[] arr = new int[a.length()];
		
		for(int i = 0; i < a.length(); i++) {
			
			arr[i] = -1;	
		}
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int var : arr) {
			System.out.print(var + " ");
		}	
		sc.close();
	}
}