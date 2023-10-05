package step6;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		char[] b = new char[a.length()];
		
		int length = a.length()-1;
		
		for(int i = 0; i < a.length(); i++) {
			b[i] = a.charAt(length);
			length--;
		}
		String result = new String(b);
		
		if(a.equals(result)) {
			System.out.println(1);
		}else if(!a.equals(result)) {
			System.out.println(0);
		}
		
		sc.close();
	}
}
