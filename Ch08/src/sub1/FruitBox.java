package sub1;

public class FruitBox<T> {		// 제네릭
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
