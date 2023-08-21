package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out =  new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(sc.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < t ; i++) {
			st = new StringTokenizer(sc.readLine()); 		//readline을 통해 입력받은 값을 String으로 순서대로 호출
			out.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
	
		}
		out.flush();
		sc.close();
	}

}
