package confirm.ch05;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		

		int b = 0;
		int c;
		int[] scores = null;
		int sum = 0;
		int max = 0;
		int result = 0;
		int x = 0;
		int y = 0;
		
		while(true) {
			
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");
			
			int a = sc.nextInt();
			
			if(a == 1) {
				System.out.print("학생수> ");
				b = sc.nextInt();
				
				scores = new int[b];
				
			}
			if(a == 2){
				
				for(int i = 0; i < b; i++) {
					System.out.print("scores["+i+"]>");
					c = sc.nextInt();
					scores[i] = c;
				}
			}
			if(a == 3){
				
				for(int i = 0; i < b; i++) {
					
					System.out.println("scores["+i+"]: "+scores[i]);
					
				}
				
			}
			if(a == 4) {
				
				for(int i = 0; i < b; i++) {
					
					sum += scores[i];
					
				}

				
				result = sum / scores.length;
				
				for(int i = 0; i < scores.length-1; i++) {
					
					if(max < scores[i]) {
						max = scores[i];
					}
					
				}
				
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+result);
				
			}
			if(a == 5) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
