package ex03;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection connect() {
		Connection con = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "note";
		String password = "practice";
		
		// 오류 발생시 오류발생 이유를 알려주는 try catch문
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공......");
		}catch (Exception e) {
			System.out.println("DB연결 : " + e.toString());
		}
		
		return con;
	}
}
