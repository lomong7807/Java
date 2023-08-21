package step4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr1[i] = a;
		}
		
		for(int k = 0; k < 10; k++) {
			arr2[k] = arr1[k] % 42;
		}
		
		Set<Integer> rs = new HashSet<>();
		
		
		for(int j = 0; j < 10; j++) {
			rs.add(arr2[j]);
		}
		sc.close();
		System.out.println(rs.size());
	}

}
