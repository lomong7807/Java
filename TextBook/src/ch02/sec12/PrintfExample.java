package ch02.sec12;
/*
 * 날짜: 2023/06/13
 * p69
 */

public class PrintfExample {
	public static void main(String[] args) {
		System.out.printf("이름: %s", "감자바");
		System.out.printf("나이: %d", 25);
		
		
		System.out.printf("\n이름: %1$s, 나이: %2$d", "감자바", 25);
		
	}

}
