package confirm.ch06;

class Printer1 {
	public static void println(int value) {
		System.out.println(value);
	}

	public static void println(boolean value) {
		System.out.println(value);
	}
	
	public static void println(double value) {
		System.out.println(value);
	}
	
	public static void println(String value) {
		System.out.println(value);		
	}
}


public class Test4 {
	public static void main(String[] args) {
		
		Printer1.println(10);
		Printer1.println(true);
		Printer1.println(5.7);
		Printer1.println("홍길동");
	}
	
}
