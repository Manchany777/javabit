package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	private List<MemberDTO> list = new ArrayList<MemberDTO>();
	Scanner scan = new Scanner(System.in);
	Member member = null;  //중심이 되는 리모컨 뼈대(인터페이스)인 부모로 접근하고 생성하는건 자식걸로 생성하자 // null값으로 초기화 시켜주지 않으면 에러 뜸
	int num;
	
	public void menu() throws ClassNotFoundException, IOException {
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 등록");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 파일 저장");
			System.out.println(" 4. 파일 읽기");
			System.out.println(" 5. 이름으로 오름차순");
			System.out.println(" 6. 끝");
			System.out.println("************");
			System.out.print(" 원하는 기능을 고르세요 : ");
			num = scan.nextInt();
			System.out.println();
			
			if(num == 6) break;
			if(num == 1) {
				member = new MemberInsert();   	// 부모 = new 자식		// 각각을 개체로 따로 가지는건 낭비다. 여기도 부모로 접근하고
			} else if(num == 2) {
				member = new MemberPrint();		// 여기도 부모로 접근하고....이렇게 공통의 부모로 접근하는 자식을 생성하면 객체낭비를 방지할 수 있다.
			} else if(num == 3) {
				member = new MemberFileOutput();
			} else if(num == 4) {
				member = new MemberFileInput();
			} else if(num == 5) {
				member = new MemberNameAsc(); // Comparator 사용
			} else {
				System.out.println("*1~5까지만 번호를 허용합니다.");
				continue;
			}
			
			member.execute(list); // 공통되는 메소드 호출
		} //while
	}
}
/*
 ** MemberService.java
- 메뉴 작성

menu()
********************
  1. 등록
  2. 출력
  3. 파일 저장
  4. 파일 읽기
  5. 끝
********************
  번호 : 
 */