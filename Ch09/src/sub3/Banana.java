package sub3;

import java.io.Serializable;

public class Banana implements Serializable {
	
	//banana는 2번 객체이다라는 뜻
	private static final long serialVersionUID = 2L;
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
		
	}
	
	public void show() {
		System.out.println("원산지 : "+ country);
		System.out.println("가격 : "+ price);
	}

}
