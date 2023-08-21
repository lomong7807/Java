package test1;
/*
 * 날짜: 2023/06/13
 * 이름: 강윤수
 * 내용: 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		result = num++; // ++가 뒤에 있으면 대입이 먼저 일어남
		System.out.println("result : "+ result);
		
		result = ++num;
		System.out.println("result : "+ result);
		
		result = num--;
		System.out.println("result : "+ result);
		
		result = --num;
		System.out.println("result : "+ result);
	}
}
