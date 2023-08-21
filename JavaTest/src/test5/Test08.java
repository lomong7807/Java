package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 강윤수
 * 내용 : 자바 총정리 연습문제
 */

public class Test08 {
	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y++) {
			for(int x = 2; x <= 9; x++) {
				System.out.printf("%d x %d = %2d\t ", x , y, x*y); // %2d: 2자리수라는것
			}
			System.out.print("\n");
		}
	}
}
