package step2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h >= 0 && m >= 45) {  //정상일때
			System.out.print(h+" ");
			System.out.print(m - 45);
		}else if(h > 0 && m < 45) { // 시간이 양수고 45분을 뺐을때 시간도 같이 빠질 때
			System.out.print((h-1)+" ");
			System.out.print((60+m)-45);
		}else if(h == 0 && m < 45 ) { // 45분을 뺐을때 시간도 같이 빠지는데 시간이 0이라서 23시간으로 표기해야될때
			h = 23;
			System.out.print(h+" ");
			System.out.print((60+m)-45);
		}
	}
}
/*
 *  내가 고려해야 될것
 *  1. h=0, m<45
 *  2. m=0 {
 *  3. h>=0, m>=45 {정상일 때
 *  4. h>=0, m<45
 */