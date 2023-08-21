package forTraining;

public class Confitional {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 15;
		int c = 20;
		
		int max = (a > b && a > c) ? a : 
				  (b > a && b > c) ? b :
				  c ;
				  
				  System.out.println(max);
	}
}
