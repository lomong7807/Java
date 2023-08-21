package test1;

public class Test10 {
	public static void main(String[] args) {
	
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");  // 0, 1 이 출력되었다.
		
		for(int i=1 ; i<=10 ; i++) { //i가 1이고 i가 10보다 작거나 같을때 아래로 내려간다.
			
			n3 = n1 + n2; // n3은 1이다
			
			System.out.print(n3+", "); // 1, 
			
			n1 = n2;
			n2 = n3;
		}
}
}
