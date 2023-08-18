package member;

import java.io.IOException;

public class MemberMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		MemberService memberService = new MemberService();
		memberService.menu();
		System.out.println("프로그램 종료합니다");
	}
}

/*
Package : member
Class    : MemberMain.java
         MemberService.java
         MemberDTO.java

Interface : Member.java
추상메소드 : public void execute(List<MemberDTO> list);
구현 class : MemberInsert.java
           MemberPrint.java
           MemberFileInput.java
           MemberFileOutput.java

파일명 : member.txt
          

[문제] 회원관리

* 조건
- 회원의 정보는 이름(name), 나이(age), 핸드폰(phone), 주소(address)로 한다.
- 회원의 데이터를 입력받아서 파일에 저장하거나 파일의 내용을 읽어온다.


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

** MemberDTO.java
- 필드, 생성자, setter/getter


** MemberInsert.java

이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

등록완료

** MemberPrint.java

이름		나이	핸드폰			주소
홍길동		25	010-1234-1234		서울
프로도		30	010-1111-2222		부산
*/