package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	private Connection conn;
	private PreparedStatement pstmt;
	
	// 5. 환경변수 설정
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1231";
	
	// 1. 연결
	public InsertMain() { // 한 번만 수행하기 위해 생성자로 생성
		//Class.forName("oracle.jdbc.driver.OracleDriver.class");
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");  // 끝에 .class는 쓰지 않는 게 규칙 (붙여서 쓰면 에러남)
			Class.forName(driver); // 5-1 전역으로 올리고 변수를 가져오게 바꿈
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 2. 접속
	public void getConnection() {
		try {
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##java","1231"); 
			// jdbc:연결할sql프로그램명:드라이버명(그래픽카드의 지포스같은 이름):@아이피주소(프로젝트시에는 연결할 팀장의 ip를 연결하기도 한다):포트번호:sid명
			// 오라클과 mysql은 조금씩 다르니 이전에 배웠던 것과 잘 비교해서 사용하자
			conn = DriverManager.getConnection(url, username, password); // 5-2 마찬가지로 전역으로 올리고 변수값만 대입
			System.out.println("접속 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 3. 진짜 insert
	public void insertAtricle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();
		System.out.println("키 입력 : ");
		double height = scan.nextDouble();
		
		// 3-1 통역가 생성
		try {
			this.getConnection(); // 오라클에 접속하기 위해 메소드 사용 -> 하면서 statment가 만들어짐
			
			pstmt = conn.prepareStatement("insert into dbtest values(?,?,?,sysdate)");
			// 얘 또한 인터페이스 (부모 인터페이스(superinterface)가 3개나 된다.)
			// 따라서 이미 오버라이딩 된 메소드를 써야 하는데 그것또한 Connection 인터페이스에 구현되어 있다. 따라서 Connection타입의 변수인 conn을 여기서도 사용해야 한다.
			// 이때 conn은 getConnection() 지역변수이기때문에 전역으로 올려야 insertAtricle()에서도 사용이 가능
			
			// 3-2 ?에  데이터 대입
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			// 3-3 실행
			int su = pstmt.executeUpdate(); // insert시 항상 "n개의 행이 삽입되었습니다"처럼 개수가 리턴됨
			
			System.out.println(su + "개의 행이 삽입되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3-4 열어놓은거 다 닫기 (닫을때는 순서를 거꾸로 수행)
			try {
				if(pstmt != null) pstmt.close();  // 닫기 위해선 pstmt도 전역으로 사용해야 하므로 try구문의 PreparedStatement pstmt를 전역으로 올린다.
				if(conn != null) conn.close();
				scan.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 문제는 sql쪽 예외처리문구는 하나같이 SQLException으로 떨어지기때문에 어디에서 오류가 생긴건지 알기 힘들다. 때문에 각 catch구문에 println으로 찍어봐야 한다.
	
	public static void main(String[] args) {
		InsertMain im = new InsertMain();
		im.insertAtricle(); // 4 결과값 수행
	}
}
