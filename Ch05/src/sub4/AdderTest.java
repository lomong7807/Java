package sub4;

/*
 * 날짜: 2023/06/20
 * 이름: 강윤수
 * 내용: 싱글톤 객체와 인스턴스 객체 실습하기
 * 
 */


class Adder{
	/// 싱글톤
	private static Adder instance = new Adder();	// 클래스 변수 생성
	public static Adder getInstance() {				// 싱글톤 객체을 알 수 있게 해주는 메서드
		return instance; 							
	} 
	private Adder() {}								
	private Adder(int value) {						// Adder()이라는 y 값에 int value를 더하는 메서드
		y += value;
	}
	
	
	private int x;		// 이곳을 heap이라고 생각하자
	private int y;
	
	public void add(int x, int y) {    	// int x와 int y를 넣었을때 필드 값 x에 int x를 더하는 메서드 그리고 y값을 1증가
		this.x += x;
		y++;							// int y에 1 증가되는거기때문에 필드 값 y는 변화가 없음
	}
	
	public void add(int[] arr) {		// int[]arr를 넣었을 때 필드값 x에 arr[0]을 더하고 필드값 y에 arr[1]을 더하는 메서드 
		x += arr[0];
		y += arr[1];
	}
	
	public static void add(Adder a2) {	// 
		a2.x += 10;
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
	}
	
}
/*
 * 1. Method Area에 AdderTest가 생성
 * 2. Method Area에 Adder가 생성
 * 3. Heap에 Adder ( x:0, y:0, add();, add();)가 생성
 * 4. Stack에 a1이 들어감
 */


public class AdderTest {						
												
	public static void main(String[] args) {
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1, 2);					// 필드값 x = 1이고 y = 변화가 없으므로 초기값 0
		a1.show();
		
		int[] arr = {10, 20};			
		a1.add(arr);					// a1.이 붙었으므로 필드값 x = 1이고 y = 0 인 상태에 들어간다.
		a1.show();						// 따라서 필드값 x = 11이고 y = 20
		
		Adder.add(a1);					// 클래스 Adder에 있는 메서드 add에 a1(필드값 x = 11 이고 y = 20 인 상태)을 넣는다.
		a1.show();						// 여기서 a1의 필드값인 x = 11에 10을 더하고 y = 20 은 변화가 없다. 
		
		a1 = Adder.add(a1, 3);			// 클래스 Adder에 있는 메서드 add에 a1(x=21,y=20)과 3을 넣는다.
		a1.show();						// 그런데 여기서 return new라고 새로운 것을 만들어냈으니 모든 초기값은 0이 된다.
	}									// x=0, y=0인 상태로 Adder(int value)가 실행 된다.
}										// 따라서 x=0이고 y=3이 된다.
