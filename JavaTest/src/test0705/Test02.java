package test0705;

public class Test02 {
	public static void main(String[] args) {
		
		int k = 4;
		
		for(int a = 0 ; a < 4 ; a++) {
			
			for(int b = k-1 ; b > a ; b--) {
				System.out.print("☆");
			}
			
			for(int b = 0 ; b < 2*a+1 ; b++) {
				System.out.print("★");
			}
			
			for(int b = k-1 ; b > a ; b--) {
				System.out.print("☆");
			}
			
			System.out.println();
		}
	}
}

