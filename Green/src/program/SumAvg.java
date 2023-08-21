package program;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int a = sc.nextInt();
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			count++;
			sum += a;
		if(a>0) {
			a = sc.nextInt();
			
		}
		}while(a>0);
		
		avg = sum / count;
		System.out.println("합계는 "+sum+"입니다. 평균은 "+avg+"입니다.");
		sc.close();
	}

}
