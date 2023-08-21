package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String a = bf.readLine();
		int sum = 0;
		
		for(int i = 0; i < a.length(); i++) {
			
			if(a.charAt(i) >= 65 && a.charAt(i) <= 67) {
				sum += 3;
			}else if(a.charAt(i) >= 68 && a.charAt(i) <= 70) {
				sum += 4;
			}else if(a.charAt(i) >= 71 && a.charAt(i) <= 73) {
				sum += 5;
			}else if(a.charAt(i) >= 74 && a.charAt(i) <= 76) {
				sum += 6;
			}else if(a.charAt(i) >= 77 && a.charAt(i) <= 79) {
				sum += 7;
			}else if(a.charAt(i) >= 80 && a.charAt(i) <= 83) {
				sum += 8;
			}else if(a.charAt(i) >= 84 && a.charAt(i) <= 86) {
				sum += 9;
			}else if(a.charAt(i) >= 87 && a.charAt(i) <= 90) {
				sum += 10;
			}else {
				sum += 11;
			}
			
		}
		System.out.println(sum);
		
	}
	

}
