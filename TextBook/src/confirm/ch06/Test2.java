package confirm.ch06;

class MemberService {

	private String name = "홍길동";
	private String id = "hong";
	private String password = "12345";

	
	public boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password)) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
}



public class Test2 {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
