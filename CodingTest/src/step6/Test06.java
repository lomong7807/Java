package step6;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < cro.length;i++) {
			
			if(s.contains(cro[i])) {
				s = s.replace(cro[i], "!");
			}
			
		}
		System.out.println(s.length());
		sc.close();
	}
}
