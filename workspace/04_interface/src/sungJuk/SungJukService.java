package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();  // ArrayList의 데이터 타입을 SungJukDTO 하나만 잡으라고 제한하는 것
	Scanner scan = new Scanner(System.in);
	SungJuk sungjuk = null;  //중심이 되는 리모컨 뼈대(인터페이스)인 부모로 접근하고 생성하는건 자식걸로 생성하자 // null값으로 초기화 시켜주지 않으면 에러 뜸
	int num;
	
	public void menu() {
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 수정");
			System.out.println(" 4. 삭제");
			System.out.println(" 5. 정렬");
			System.out.println(" 6. 종료");
			System.out.println("************");
			System.out.print(" 원하는 기능을 고르세요 : ");
			num = scan.nextInt();
			System.out.println();
			
			if(num == 6) break;
			if(num == 1) {
				sungjuk = new SungJukInsert();   	// 부모 = new 자식		// 각각을 개체로 따로 가지는건 낭비다. 여기도 부모로 접근하고
			} else if(num == 2) {
				sungjuk = new SungJukList();		// 여기도 부모로 접근하고....이렇게 공통의 부모로 접근하는 자식을 생성하면 객체낭비를 방지할 수 있다.
			} else if(num == 3) {
				sungjuk = new SungJukUpdate();
			} else if(num == 4) {
				sungjuk = new SungJukDelete();
			} else if(num == 5) {
				sungjuk = new SungJukSort();
			} else {
				System.out.println("*1~6까지만 번호를 허용합니다.");
				continue;
			}
			
			sungjuk.execute(arrayList); // 공통되는 메소드 호출
		} //while
	}
}
