package student.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	Scanner scan = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 5. 환경변수 설정
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1231";
	
	// 1. 연결
	public Student() { // 한 번만 수행하기 위해 생성자로 생성
		try {
			Class.forName(driver); // 5-1 전역으로 올리고 변수를 가져오게 바꿈
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 2. 접속
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password); // 5-2 마찬가지로 전역으로 올리고 변수값만 대입
			System.out.println(); System.out.println();
			System.out.println(" 접속 성공\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 3. 진짜 insert
	public void insertArticle() {

		while(true) {
			int num;
	 		int code;
	 		
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 학생");
			System.out.println(" 2. 교수");
			System.out.println(" 3. 관리자");
			System.out.println(" 4. 이전메뉴");
			System.out.println("************");
			System.out.print(" 번호 선택 : ");
			num = scan.nextInt();
			System.out.println();
			
			// 데이터 (if문 안에다 쓰면 안에서만 돌고 밖으로 나가면 사라져버림)
			String name = null;
			String value = null;
			
			if(num == 4) {
				System.out.println("이전 메뉴로 돌아갑니다"); 
				break;
			}
			
			System.out.print(" 이름 입력: ");
			name = scan.next();
			
			if(num == 1) {
		 		System.out.print(" 학번 입력");
		 		value = scan.next();
		 		code = 1;
			} else if(num == 2) {
		 		System.out.print(" 과목 입력: ");
		 		value = scan.next();
		 		code = 2;
			} else if(num == 3) {
		 		System.out.print(" 소속 입력: ");
		 		value = scan.next();
		 		code = 3;
			} else {
				System.out.println("*1~4까지만 번호를 허용합니다.");
				continue;
			}

			// 3-1 통역가 생성
			try {
				this.getConnection(); // 오라클에 접속하기 위해 메소드 사용 -> 하면서 statment가 만들어짐
				
				pstmt = conn.prepareStatement("insert into student2 values(?,?,?)");
				
				// 3-2 ?에  데이터 대입
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);
				
				// 3-3 실행
				int su = pstmt.executeUpdate();
				
				System.out.println(su + "개의 행이 삽입되었습니다.");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 3-4 열어놓은거 다 닫기 (닫을때는 순서를 거꾸로 수행)
				try {
					if(pstmt != null) pstmt.close(); 
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	 		System.out.println("입력되었습니다.");
		} // while
	} //insertArticle()
		
	public void selectAtricle() {
		while(true) {
			int num;
	 		
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 이름검색");
			System.out.println(" 2. 전체검색");
			System.out.println(" 3. 이전메뉴");
			System.out.println("************");
			System.out.print(" 번호 선택 : ");
			num = scan.nextInt();
			
			if(num == 3) {
				System.out.println("이전 메뉴로 돌아갑니다"); 
				break;
			}
			
			// 데이터
			String name = null;
			if(num == 1) {
		 		System.out.print(" 이름검색: ");
		 		name = scan.next();
			} else if(num == 2) {
		 		System.out.print(" 전체검색: ");
			}
			
			// DB - select
			this.getConnection(); // 오라클에 접속하기 위해 메소드 사용
			
			String sql = null;
			if(num==1) {
				sql = "select * from student2 where name like ?";
			} else {
				sql = "select * from student2";
			}
			
			// 3-1 통역가 생성
			try {
				pstmt = conn.prepareStatement(sql);
				if(num ==1) pstmt.setString(1, "%" + name + "%");
				rs = pstmt.executeQuery(); // 3-3 실행
				while(rs.next()) {
					System.out.print("이름 = " + rs.getString("name") + "\t\t");  // rs에 담은 쿼리문에서 원하는 속성을 꺼내옴
					if(rs.getInt("code")==1) {
						System.out.print("학번 = " + rs.getString("value"));
					} else if(rs.getInt("code")==2) {
						System.out.print("과목 = " + rs.getString("value"));
					} else if(rs.getInt("code")==3) {
						System.out.print("부서 = " + rs.getString("value"));
					} //if문
					System.out.println();
				}//while
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 3-4 열어놓은거 다 닫기 (닫을때는 순서를 거꾸로 수행)
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close(); 
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} // finally-try-catch
			} //try-catch
			System.out.println();
	 		System.out.println(" 해당 값이 조회되었습니다.");
		}
	}
	
	public void deleteAtricle() {
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		// DB - delete
		getConnection(); // 접속
		String sql = "delete student2 where name =?";  // mysql은 delete from~~
		
		try {
			pstmt = conn.prepareStatement(sql); // 생성
			pstmt.setString(1, name);
			int su = pstmt.executeUpdate(); // 개수 리턴
			System.out.println(su + "개의 행이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close(); 
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // finally-try-catch
		} // try-catch
	}
	
	public void menu() {
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 검색");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 종료");
			System.out.println("************");
			System.out.print(" 번호 선택 : ");
			int num = scan.nextInt();
			System.out.println();
			
			if(num == 4) {
				System.out.println("프로그램 종료합니다"); 
				scan.close();
				break;
			}
			if(num == 1) {
				Student st1 = new Student();   	// 부모 = new 자식
				st1.insertArticle();
			} else if(num == 2) {
				Student st2 = new Student();
				st2.selectAtricle();
			} else if(num == 3) {
				Student st3 = new Student();
				st3.deleteAtricle();
			} else {
				System.out.println("*1~4까지만 번호를 허용합니다.");
				continue;
			}
		}
	} // menu
	public static void main(String[] args) {
		Student st = new Student();
		st.menu();
		// 만약 menu()가 static이면 여기서 객체 생성할 필요없이 바로 호출이 가능함
	}
}
