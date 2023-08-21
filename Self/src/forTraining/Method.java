 package forTraining;

public class Method {

	public static void main(String[] args) {
		
		int result1 = a1(1, 2);
		double result2 = a2(3.59, 3.75);
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
	}
	
	public static int a1(int a, int b) {
		
		int y = a + b;
		return y;
	}
	public static double a2(double a, double b) {
		
		double z = a + b;
		return z;

	}
}
