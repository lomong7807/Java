package confirm.ch07;

class Parent2 {
	public String nation;
	
	public Parent2() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}


public class Test2 {
	public static void main(String[] args) {
		Child child = new Child();
	}
}



class Child extends Parent2{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}