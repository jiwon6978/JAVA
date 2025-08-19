import java.sql.*;

public class A예제 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "1234";

        try {
            // 1. 드라이버 로드 (JDBC 4.0 이상은 생략 가능)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. DB 연결
            Connection conn = DriverManager.getConnection(url, user, password);

            // 3. SQL 실행
            String sql = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // 4. 결과 처리
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }

            // 5. 리소스 해제
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
