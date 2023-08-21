package confirm.ch06;

class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public void Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	public void Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean login(String name, String id) {
		if(this.name.equals(name) && this.id.equals(id)) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}

}

public class Test1 {
	
	
}
