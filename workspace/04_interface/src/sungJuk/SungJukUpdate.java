package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		System.out.println("#####회원 정보 수정#####");
		System.out.print(" 번호 입력 : ");
		int no = sc.nextInt();
		boolean findNum = false;
			
		for (int i = 0; i < arrayList.size(); i++) {
			   if (arrayList != null && arrayList.get(i).getNo() == no) {
				   System.out.println("찾은 회원 정보:");
				   System.out.println(arrayList.get(i).getNo() + "번 조회 완료");
				   System.out.println("번호: " + arrayList.get(i).getNo() +
				            " 이름: " + arrayList.get(i).getName() +
				            " 국어: " + arrayList.get(i).getKorean() +
				            " 영어: " + arrayList.get(i).getEnglish() +
				            " 수학: " + arrayList.get(i).getMath() +
				            " 총점: " + arrayList.get(i).getTotal() +
				            " 평균: " + arrayList.get(i).getAvg());
				   
				   System.out.println();
				   System.out.print("수정 할 이름 입력: ");
				   String name = sc.next();
				   System.out.print("수정 할 국어점수 입력: ");
				   int korean = sc.nextInt();
				   System.out.print("수정 할 영어점수 입력: ");
				   int english = sc.nextInt();
				   System.out.print("수정 할 수학점수 입력: ");
				   int math = sc.nextInt();		
				   
				   SungJukDTO sungjukDTO = new SungJukDTO(no, name, korean, english, math);
				   arrayList.set(i, sungjukDTO);
				   sungjukDTO.calc();
				   
				   System.out.println();
				   System.out.println("#####회원 정보 수정 완료#####");
				   System.out.println("수정한 회원 정보");
				   System.out.println("번호: " + arrayList.get(i).getNo() +
				            " 이름: " + arrayList.get(i).getName() +
				            " 국어: " + arrayList.get(i).getKorean() +
				            " 영어: " + arrayList.get(i).getEnglish() +
				            " 수학: " + arrayList.get(i).getMath() +
				            " 총점: " + arrayList.get(i).getTotal() +
				            " 평균: " + arrayList.get(i).getAvg());
				   
				   findNum = true;
				   break;
		}
	   }

	   if (!findNum) {
	       System.out.println("잘못된 번호 입니다. 다시 입력해주세요.");
	       execute(arrayList);
	   }
	}

}
/*
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

수정하였습니다.*/