package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1231";
	
	// 1.연결
	public UpdateMain() {
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
	
	// 3. 진짜 update
	public void updateAction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		this.getConnection();
		String sql = "update dbtest set age=age+1 where name like ?";  // %못쓰니까 ?로 대체함 // age=?+1 이 아니다. 주의!!!!
		try {
			pstmt = conn.prepareStatement(sql); // sql 문장이 기니까 위로 뺴주고 아래에는 변수만 집어넣음 
			
			pstmt.setString(1, "%" + name + "%");  // 위에서 대입못한 %를 여기서 대입해야 함
			int su = pstmt.executeUpdate();
			
			System.out.println(su + "개의 행이 변경되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt !=null)pstmt.close();
					if(conn !=null) conn.close();
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		UpdateMain up = new UpdateMain();
		up.updateAction();
	}
}
/* 문제
 드라이버 로딩
 커넥션
 
 수정할 이름 입력 : 홍
 => 위치 상관없이 홍이 들어간 이름을 찾아서 나이를 1증가 시키시오 update
 */