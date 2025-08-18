package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05Select {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "NewPass!23";
		String url = "jdbc:mysql://localhost:3307/opendatadb";
		
		//JDBC참조변수
		Connection conn = null;   //DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt =null;   //SQL Query 전송용 객체
		ResultSet rs = null;    //Select 결과물 담을 객체
		
		//연결작업
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED");
		
		//sql 객체 생성
		pstmt = conn.prepareStatement("SELECT * FROM tbl_a");
		rs = pstmt.executeQuery();
		
		if(rs!=null) {
			while(rs.next()) {
				System.out.print(rs.getInt("no")+".");
				System.out.print(rs.getString("name"));
			}
		}
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
			e2.printStackTrace();
		}finally{
			try {rs.close();} catch (SQLException e){e.printStackTrace();}
			try {pstmt.close();} catch (SQLException e){e.printStackTrace();}
			try {conn.close();} catch (SQLException e){e.printStackTrace();}

	}
}
}