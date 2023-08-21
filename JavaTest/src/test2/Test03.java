package test2;
/*
 * 날짜: 2023/06/15
 * 이름: 강윤수
 * 내용: 자바 배열 역순으로 정렬 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//현재 배열 출력
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.print("\n");
		
		//배열의 원소를 역순으로 정렬
		for(int j = 0; j < 5; j++) {  // j = 0,1,2,3,4
			int temp = arr[j]; //arr[0] = 1, temp = 1  //
			arr[j] = arr[9-j]; //arr[0] = arr[9] 10
			arr[9 - j] = temp; //arr[9] = temp , 1
		}
		
		//역순으로 정렬된 배열 출력
		for(int n = arr[0] ; n > 0 ; n--) {  //(int n : arr)
			System.out.print(n+", ");
		}
	}
}
