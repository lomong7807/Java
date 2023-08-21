package sub4;
/**
 * 날짜: 2023/06/14
 * 이름: 강윤수
 * 내용: Java 반복문 while 실습하기
 *
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while( k <= 10 ) {   // 조건식만 들어가고 조건이 참이면 계속 반복
			
			sum += k;
			k++;
			
		
		}
		System.out.println("1부터 10까지 합 : "+ sum);
		
		// do~while
		int tot = 0;
		int i = 1;
		
		do {
			
			if(i%2 == 0) {
				tot += i;
			}
			
			i++;
			
			
		}while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : "+ tot);
		
		// break
		int num =1;
		
		while(true) {  //무한으로 돌리는것
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;  //특정 조건을 만족했을 때 반복문 탈출
				
			}
			
			num++;
			
		}
		
		System.out.println("5와 7의 최소공배수 : "+ num);
		
		// continue
		int total = 0;
		int j = 0;
		
		while(j <= 10) {  // j가 10보다 작거나 같을 경우 아래를 실행한다
			
			j++;  // j를 1 더한다
			
			if(j % 2 == 1) {  // j를 2로 나눴을 때 1이 남는다면
				continue;    // 반복문의 처음으로 올라가서 다시 실행한다
				
			}
			total += j;
		}
		
		System.out.println("total : "+ total);
		
		
		
	}
}
