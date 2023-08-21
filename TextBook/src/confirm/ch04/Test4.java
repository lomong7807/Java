package confirm.ch04;

public class Test4 {
	public static void main(String[] args) {

		
		
		while(true) {
			
			int a = (int)Math.ceil(Math.random() * 6); 
			int b = (int)Math.ceil(Math.random() * 6); 
			
			System.out.println("("+a+", "+b+")");
			
			if(a + b == 5) {
				break;
			}
		}
	}
}
