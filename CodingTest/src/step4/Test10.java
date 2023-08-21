package step4;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		double sum = 0;
		double a1 = 0;
		double a2 = 0;
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			arr[i] = m;
		}
		for(int j = 0; j < n-1; j++) {
			
			if(arr[j] > arr[j+1]) {
				a1 = arr[j];
				a2 = arr[j+1];
				arr[j+1] = a1;
				arr[j] = a2;
				

			}
		}
		for(int k = 0; k < n; k++) {
			arr[k] = arr[k] / arr[n-1] * 100;
		}
		
		for(double a3 : arr) {
			sum += a3;
		}
		
		
		System.out.println(sum / n);
		
		sc.close();
	}
	

}
