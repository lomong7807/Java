package sub2;

public class StringBuilderTest {
	
	public static void main(String[] args) {

		//String immutable 특성
		// 원래 있던 Java 옆에 붙인게 아니라 새로운걸 만드는거임. (메모리 공간이 다름)
		String str = "Java";
		System.out.println("str 객체주소 값 : "+ System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 객체주소 값 : "+ System.identityHashCode(str));

		//String immutable 특성을 개선한 StringBuilder
		// 주소가 같음. 같이 들어있는거임. (하나의 메모리 공간에서 이루어짐)
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 : "+ System.identityHashCode(sb));
		
		sb.append("programming");
		System.out.println("sb 객체 주소 : "+ System.identityHashCode(sb));
		
		System.out.println("sb : "+ sb);
		
	}
}
