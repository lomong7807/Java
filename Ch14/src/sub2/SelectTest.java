package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/*
 * 날짜 : 2023/07/10
 * 이름 : 강윤수
 * 내용 : Select 실습
 */


public class SelectTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - JDBC 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "SELECT * FROM `User1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5단계 - 결과 처리(SELECT 경우)
			while(rs.next()) {
				
				String uid 	= rs.getString(1);
				String name = rs.getString(2);
				String hp 	= rs.getString(3);
				int	 age 	= rs.getInt(4);
				
				
				System.out.printf("%s, %s, %s, %d\n", uid, name, hp, age);
			}
			
			// 6단계 - 연결 해제
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Select 완료...");
	}

}
