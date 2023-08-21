package sub1;

/*
 * 날짜 : 2023/06/26
 * 이름 : 강윤수
 * 내용 : Java 예외처리 실습하기
 * 
 * 예외처리(Exception)
 *  - 예외는 프로그램 실행중에 발생하는 모든 에러(Error)
 *  - 실행 중(Runtime) 발생하는 예외와 컴파일(CompileTime)에 발생하는 예외처리
 *  - 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 *  - 사용자가 생성한 예외를 throw
 * 
 */

public class ExceptionTest {
	public static void main(String[] args) {
		
		// 실행 예외
		
		// 예외 상황1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;		//선언은 여기서 해야됨
		
		try {
			//예외가 발생할 가능성이 있는 코드 작성
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;						// <<이것만 문제 되지만 그냥 전체 다 try를 걸어도 상관없다.
			
		}catch (ArithmeticException e) {			//보통 다형성 덕분에 Exception e를 사용하면 됨
			//예외가 발생했을 때 처리할 코드 작성
			e.printStackTrace(); //예외 내용 출력
		}
		
		System.out.println("rs1 : "+ rs1);
		System.out.println("rs2 : "+ rs2);
		System.out.println("rs3 : "+ rs3);
		System.out.println("rs4 : "+ rs4);
		
		
		
		// 예외 상황2 : 배열의 인덱스 범위를 벗어났을 때
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i = 0 ; 1 < 6 ; i++) {
				System.out.println("arr[]"+i+" : " + arr[i]);
				
			}	
		}catch (ArrayIndexOutOfBoundsException e) {
			// 배열의 인덱스 범위를 벗어났을 때
			e.printStackTrace(); 	//자바에서 시스템 예외 출력
		}
		
		
		// 예외 상황3
		Animal ani = null;   // = Animal ani;  // stack에만 생성 되어있고 heap에는 참조값이 없는 상태
		
		try {
		
		ani.move();
		ani.hunt();
		}catch (NullPointerException e) {
			//객체 생성 없이 참조(Null 포인터 에러)
			e.printStackTrace();
		}
		
		
		// 예외 상황4
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle(); // 업캐스팅
		Animal a3 = new Shark(); // 업캐스팅
		
		try {
		
		Eagle eagle = (Eagle) a1; // 다운캐스팅
		Shark shark = (Shark) a2; // 다운캐스팅
		Tiger tiger = (Tiger) a3; // 다운캐스팅
		}catch (ClassCastException e) {
			// 잘못된 캐스팅
			e.printStackTrace();
		}
		
		
		// 일반 예외
		
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언	
			e.printStackTrace();
		} finally {
			// 예외처리 발생유무에 상관없이 마지막에 항상 실행되는 코드
			System.gc();		// garbage collect 메모리(heap의 인스턴스) 정리
			
			System.out.println("finally 실행...");
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
}
