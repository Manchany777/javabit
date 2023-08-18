package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;  // select문으로 가져온 결과물을 담는 변수 (자바에서 정해준 변수명이므로 변경 불가)
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1231";
	
	// 1.연결
	public SelectMain() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 2. 접속
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	// 3. 진짜 select
	public void selectArticle() {
		this.getConnection();
		String sql = "select * from dbtest";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // ★★★★실행★★★★ (executeUpdate가 아니다 주의) -> (추출한 쿼리를 담을 공간이 필요 So,)ResultSet 리턴
			
			//rs.next(); // -> 1. 현재 위치의 레코드가 있으면 true, 없으면 false 
			//                 2. 다음 레코드로 이동
			// rs.getString("name") - 컬럼명 or rs.getString(1) - 컬럼번호  // 보통은 컬럼명으로 사용
			// rs.getInt("age") or rs.getInt(2);
			// rs.getDouble("height") or rs.getDouble(3);
			// rs.getDate("logtime") 또는 rs.getString("logtime") or rs.getDate(4);   // getDate 대신에 getString써도 된다.
			
			// next()는이터레이터와 같은 역할 so, while문으로 수행
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t"   // rs에 담은 쿼리문에서 원하는 속성을 꺼내옴
							+ rs.getInt("age") + "\t" 
							+ rs.getDouble("height") + "\t" 
							+ rs.getString("logtime"));
			}//while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {		
				try {
					if(rs != null) rs.close();
					if (pstmt != null) pstmt.close();
					if (conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} // finally-try-catch
		} // try-catch
	}
	
	public static void main(String[] args) {
		SelectMain sm = new SelectMain();
		sm.selectArticle();
	}
}
