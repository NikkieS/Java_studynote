package prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnProvider {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		//2. 데이터베이스 연결
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		// Connection 객체 생성
		try {
			conn = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
