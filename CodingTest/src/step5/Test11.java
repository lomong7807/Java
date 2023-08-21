package step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			
			List<String> tokens = new ArrayList<>();
			
			Scanner sc2 = new Scanner(sc.nextLine());
			
			while(sc2.hasNext()) {
				tokens.add(sc2.next());
			}
			
			sc2.close();
			System.out.println(tokens);
		}
		sc.close();

	}
}
