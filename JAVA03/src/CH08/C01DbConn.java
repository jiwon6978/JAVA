package CH08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DbConn {

	public static void main(String[] args) throws SQLException  {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		// jdbc:DBMS종류//DBMS위치/DB명

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
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 부재 예외 발생");
		} catch (SQLException e2) {
			System.out.println("SQL 예외발생");
		} finally {
				conn.close();
		}
	}

}
