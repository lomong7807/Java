package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭(오직 하나의 스레드만 실행할 수 있도록 처리함)
	// 스레드간의 병합을 막고 통기방식으로 실행
	public synchronized void setNum() {
		this.num++;
	}

}
