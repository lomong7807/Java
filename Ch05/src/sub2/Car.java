package sub2;

public class Car { 						// 클래스의  속성은 무조건 private
		
		// 필드(속성)
		private String name;			// 속성을 노출 안하기 위해서 private을 붙여줌
		private String color;			// protected(상속 관계에서 사용)
		private int speed;
		
		// 생성자 = 클래스 이름과 대소문자까지 동일한 메서드 : 캡슐화된 속성을 초기화하기 위한 메서드
		public Car(String name, String color, int speed) {	//매개변수를 선언해준다
			this.name = name;
			this.color = color;
			this.speed = speed;
			
		}
		
		// 메서드(기능) = 메서드에는 private을 붙이는 경우는 잘 없음. 메서드는 캡슐화의 대상이 아님.
		public void speedUp(int speed){
			this.speed += speed;
		}
		public void speedDown(int speed) {
			this.speed -= speed;
		}
		
		public void show() {
			System.out.println("차량명 : "+ this.name);
			System.out.println("차량색 : "+ this.color);
			System.out.println("현재속도 : "+ this.speed);
		}
		
		
		// Getter, Setter 정의 - 필요에 따라서 정의
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name; //
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
		
		
	
	
}
