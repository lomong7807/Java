package confirm.ch07;


class Parent{
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}


public class Test1 extends Parent{
		
		public int studentNo;
		
		public Test1(String name, int studentNo) {
			super(name);
		}
}
