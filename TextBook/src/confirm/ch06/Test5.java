package confirm.ch06;

class ShopService{
	
	public static ShopService instance = new ShopService();
	public static ShopService getInstance() {
		return instance;
	}
	
	private ShopService() {};
	
	
}

public class Test5 {
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
