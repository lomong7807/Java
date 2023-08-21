package sub4;
/*
 * 날짜: 2023/06/15
 * 이름: 강윤수
 * 내용: Java 메서드 오버로딩 실습하기
 * 
 * 메서드 오버로딩
 */
public class MethodOverloadTest { //클래스 이름은 대문자 시작

	public static void main(String[] args) { //메서드 이름은 소문자 시작
		
		int r1 = plus(1);
		int r2 = plus(1, 2);
		double r3 = plus(1.1 ,2.2);
		String r4 = plus("Hello", "World");
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
	}
	
	// 오버로딩 메서드 정의
	public static int plus(int a) {
		return a + a;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}	
	
	public static double plus(double a, double b) {
		return a + b;
	}	
	
	public static String plus(String a, String b) {
		return a + b;
	}	
	
}
