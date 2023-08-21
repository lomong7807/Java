package test6;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강윤수
 * 내용 : 자바 총정리 연습문제
 * 
 * 1 - 1개
 * 2 - 3개
 * 3 - 5개
 * 4 - 7개
 * 5 - 9개
 * 
 */

public class Test09 {
	
	public static void main(String[] args) {
		
		pyramid(3);
		pyramid(5);
		pyramid(7);
		
	}
	
	public static void pyramid(int n) {
		
		for(int i = 1; i <=n; i++) {
			
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2-1 ;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
