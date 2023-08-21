package test1;
/*
 * 날짜: 2023/06/13
 * 이름: 강윤수
 * 내용: 자바 반복문 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i<n ; i++) {  // i는 0이다, i가 5보다 작으면 아래로 내려간다.
			
			for(int j = n - 1 ; j>i ; j--) {  // j는 n(5)-1이다, j가 i보다 크면 아래로 내려간다.
					System.out.print(" "); // 공백을 출력한다
			}
			for(int j=0 ; j<2*i+1 ; j++) {  // j가 0이다, j가 2와 i를 곱하여 1을 더한 값보다 작으면 아래로 내려간다.
				System.out.print("*"); // *을 출력한다 j에 1을 더한다
			}
			

			System.out.print("\n"); // 줄을 바꾼다
		}
	}
}
