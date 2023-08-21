package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test08 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String s = sc.readLine();


		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());
	}

}
