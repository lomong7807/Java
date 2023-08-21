package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수: "+map.size());
		System.out.println();
		
		
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();					//keySet은 map이라는 것의 모든 키만을 set 컬렉션 형태로 반환한 형태
		Iterator<String> keyIterator = keySet.iterator();	//keySet의 요소들을 순환한다
		while (keyIterator.hasNext()) {						//keySet의 요소들을 순환하면서 다음 요소가 남아있는동안 실행한다.
			String k = keyIterator.next();					//k는 keyset의 다음 요소이다.
			Integer v = map.get(key);						//v는 map에서 키(홍길동)의 값을 가져온것이다.
			System.out.println(k + ":" + v);				//따라서 키만 계속해서 달라지고 값은 똑같이 출력
		}
		
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();					//entrySet은 map이라는 것의 모든 쌍을 Set의 형태로 반환
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();	//set형태로 반환한것을 순회한다.
		
		while (entryIterator.hasNext()) {										//다음 요소가 있는 동안 entryIterator을 순회한다.
			Entry<String, Integer> entry = entryIterator.next();				//entry는 entryIterator의 다음 요소이다.
			String k = entry.getKey();											//k는 entry에서 나온 키이다.
			Integer v = entry.getValue();										//v는 entry에서 나온 키에 맞는 값이다.
			System.out.println(k + " : " + v);									//그 두개를 출력
		}
		
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println();
		
		map.clear();
		System.out.println();
	}

}
