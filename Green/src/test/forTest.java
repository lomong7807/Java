package test;
/*
 * 고려해야 될 것
 * a가 있다.
 * a에서 1 뺸 값을 곱한다.
 * a에서 1 뺀 값을 곱한 것에 a에서 2 뺀 값을 곱한다.
 * a에서 1 뺀 값을 곱한 것에 a에서 2 뺀 값을 곱한 것에 a에서 3 뺸 값을 곱한다.
 */
import java.util.Scanner;

public class forTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 1;
		
		for(int i = a ; i > 0 ; i--) {
				b = b * i;
		}
		System.out.println(a + "! : " + b);
	}
}
