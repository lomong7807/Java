package confirm.ch04;

public class Test5 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			int x = i;
			
			for(int j = 1; j <= 10; j++) {
				
				int y = j;
				
				if((4*x)+(5*y) == 60) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}
	}
}
