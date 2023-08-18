package sungJuk;

public class SungJukMain {

	public static void main(String[] args) {
		SungJukService sj = new SungJukService();
		sj.menu();
		System.out.println("프로그램 종료합니다");
	}
}
/* 월요일 문제
[문제] 성적 처리

[조건]
1. SungJukDTO.java
필드   : no(번호), 이름, 국어, 영어, 수학, 총점, 평균
메소드 : 생성자를 이용하여 데이터 얻기
       setter / getter
       calc() - 총점, 평균하는 계산

2. SungJukService.java
- menu() 를 작성한다.

3. SungJukInsert.java
- 번호, 이름, 국어, 영어, 수학를 입력하여 생성자를 통해 값을 입력한 다음 calc()함수로 계산한 총점과 평균 결과를 이곳에 반환한다.
- 번호를 중복해서 입력하지 않는다.

번호 입력 : 
이름 입력 : 
국어 입력 : 
영어 입력 : 
수학 입력 : 

입력되었습니다

4. SungJukList.java
- ArrayList에 저장된 모든 데이터를 출력한다.
- 소수이하 2째자리까지 출력한다.
 
번호		이름		국어		영어		수학 		총점		평균 */




/* 화요일 문제
[문제] 성적 처리
Package : sungJuk
Class   : SungJukMain.java
          SungJukService.java
          SungJukDTO.java (1인분)

Interface : SungJuk.java
추상메소드 : 
public void execute(ArrayList<SungJukDTO> arrayList);

implements Class    : SungJukInsert.java
	                  SungJukList.java
	                  SungJukUpdate.java
	                  SungJukDelete.java
	                  SungJukSort.java


[조건]
1. SungJukDTO.java
필드   : no(번호), 이름, 국어, 영어, 수학, 총점, 평균
메소드 : 생성자를 이용하여 데이터 얻기
       setter / getter
       calc() - 총점, 평균하는 계산

2. SungJukService.java
- menu() 를 작성한다.

3. SungJukInsert.java
- 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.
- 번호를 중복해서 입력하지 않는다.

번호 입력 : 
이름 입력 : 
국어 입력 : 
영어 입력 : 
수학 입력 : 

입력되었습니다

4. SungJukList.java
- ArrayList에 저장된 모든 데이터를 출력한다.
- 소수이하 2째자리까지 출력한다.
 
번호		이름		국어		영어		수학 		총점		평균

5. SungJukUpdate.java
- 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
- 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
번호 입력 : 78
잘못된 번호 입니다.

또는 
번호 입력 : 10

번호		이름		국어		영어		수학		총점		평균
10		홍길동

수정 할 이름 입력 : 
수정 할 국어 입력 : 
수정 할 영어 입력 : 
수정 할 수학 입력 : 

수정하였습니다.

6. SungJukDelete.java
- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
- 똑같은 이름이 있으면 모두 삭제한다.

삭제할 이름 입력 : 천사
회원의 정보가 없습니다

또는 
삭제할 이름 입력 : 홍길동 (홍길동이라는 이름 가진 SungJukDTO를 모두 제거)
삭제하였습니다.

7. SungJukSort.java
- menu() 만들어서 작성하시오

********************
  1. 총점으로 내림차순
  //2. 이름으로 오름차순
  3. 이전 메뉴 -> service 함수로 다시 오게
********************
  번호 : 
*/