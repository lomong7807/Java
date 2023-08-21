package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2023/06/30
 * 이름 : 강윤수
 * 내용 : 로또번호 연습문제
 */

public class Test08 {
	public static void main(String[] args) {
		
		for(int count=1; count <= 5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();		//중복된 결과가 안나오게끔 List 말고 Set 사용
		
		for(;;) {		//무한 반복
			int num = (int) Math.ceil(Math.random() * 40);
					
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		//정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}

}
