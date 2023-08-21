package sub1;

public class Apple {			//암시적으로 오브젝트 클래스를 상속 받고 있음
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		System.out.println("해시값 : "+ hashCode());
		System.out.println("원산지 : "+ this.country);
		System.out.println("가격 : "+ this.price);
		
		return super.toString();
		
		
		
	}

}
