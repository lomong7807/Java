package confirm.ch05;

public class Test2 {
	public static void main(String[] args) {
	
		int[] array = {1, 5, 3, 8, 2};
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < array.length-1; i++) {
			
			if(array[i] > array[i+1]) {
				
				a = array[i];
				b = array[i+1];
				array[i] = b;
				array[i+1] = a;
				
			}
			
		}
		System.out.println(array[array.length-1]);
	}
}
