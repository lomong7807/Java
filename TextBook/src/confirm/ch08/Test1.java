package confirm.ch08;

interface Remocon{
	public void powerOn();
}


class TV implements Remocon{
	public TV() {};
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
}

public class Test1 {
	
	
	
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}
