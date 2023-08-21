package test4;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/30
 * 이름 : 강윤수
 * 내용 : 예외처리 연습문제
 */


class NotfoundException extends Exception{
	public NotfoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println(("해당하는 숫자 찾음!!!"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void searchArray(int find, int[] arr) throws NotfoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotfoundException();
	}
	

}
