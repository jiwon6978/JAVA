package CH08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C02Insert {

	public static void main(String[] args){
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		// jdbc:DBMS종류://DBMS위치/DB명

		// jdbc 참조 변수
		Connection conn = null; // DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; // SQL Query 전송용 객체
		ResultSet rs = null; // Select 결과물 담을 객체

		// 연결작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로딩
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED");
			
			//sql query 객체 생성
			pstmt = conn.prepareStatement("insert into tbl_a values(?,?)");
			pstmt.setInt(1,  Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			
			//sql을 DBMS로 전달
			int result = pstmt.executeUpdate();
			System.out.println("result: "+result);
			//결과값으로 java에서 처리
			if(result>0) 
				System.out.println("Insert 성공");
			else
				System.out.println("Insert 실패");
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 부재 예외 발생");
		} catch (SQLException e2) {
//			System.out.println("SQL 예외발생");
		} finally {
				try {conn.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}

}
