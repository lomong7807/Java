package ch02.sec05;

/*
 * 날짜: 2023/06/13
 * p48
 */
public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		boolean start = false;
		if(start) {
			System.out.println("중지합니다.");
			} else {
				System.out.println("시작합니다.");
			}
			
			int x = 10;
			boolean result1 = (x == 20) || (x >= 9);
			boolean result2 = (x != 20);
			System.out.println("result1: "+ result1);
			System.out.println("result2: "+ result2);
		}
		
	}

