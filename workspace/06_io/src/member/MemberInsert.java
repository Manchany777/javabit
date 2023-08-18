package member;

import java.util.List;
import java.util.Scanner;

public class MemberInsert implements Member {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute(List<MemberDTO> list) {
 		System.out.print(" 이름 입력: ");
 		String name = sc.next();
 		System.out.print(" 국어 성적 입력: ");
 		int age = sc.nextInt();
 		System.out.print(" 영어 성적 입력: ");
 		String phone = sc.next();
 		System.out.print(" 수학 성적 입력: ");
 		String address = sc.next();
 		System.out.println("입력되었습니다.");
        
 		MemberDTO memberDTO = new MemberDTO(name, age, phone, address); // 위에서 따로따로 입력한 입력값들을 한 번에 모으는 역할을 하는 객체
 		list.add(memberDTO);
	}
}
/*
** MemberInsert.java

이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

등록완료
*/