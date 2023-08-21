package sub3;

/*
 * 날짜 : 2023/06/26
 * 이름 : 강윤수
 * 내용 : Java 예외 발생 시키기 실습하기
 */

// 사용자 정의 예외클래스 (개발자가 특수한 목적으로 만든 예외 클래스)
class MinusException extends Exception {		//음수일때 예외 발생
	
	public MinusException(String msg) {
		super(msg);
	}
	
}

class OverException extends Exception{
	
	public OverException(String msg) {
		super(msg);
	}
}

class Score{
	
	public void check(int score) throws MinusException, OverException { //Exception으로 할 수 있음. 다형성
		
		if(score < 0) {
			// 예외 발생 시키기
			throw new MinusException("정수는 음수가 될 수 없습니다.");
		}else if(score > 100){
			// 예외 발생 시키기
			throw new OverException("100점을 초과할 수 없습니다.");
		}else {
			System.out.println("정수가 정상입니다.");
		}
	}
	
}


public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		
		try {
		score.check(-3);
		score.check(102);
		score.check(96);
		}catch (MinusException e) {
			e.printStackTrace();
		}catch (OverException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
		
	}
	

}














