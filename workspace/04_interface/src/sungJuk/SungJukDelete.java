package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		System.out.println("=====회원 정보 삭제=====");
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
				   System.out.println("정말로 삭제하시겠습니까? (Y/N)");
				   String deleteConfirm = sc.next();
					
					if (deleteConfirm.equalsIgnoreCase("Y")) {
						arrayList.remove(i);
						System.out.println();
						System.out.println("=====회원 정보 삭제 완료=====");
					} else {
						System.out.println();
					    System.out.println("삭제 취소");
					}

				   System.out.println("수정후 남은 회원 정보\n");
				   System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					for(SungJukDTO sungJukDto : arrayList) {
						System.out.println(sungJukDto);
					}
				   
				   findNum = true;
				   break;
		}
	   }

	   if (!findNum) {
	       System.out.println("해당하는 회원번호가 조회되지 않습니다. 다시 입력해주세요.");
	       execute(arrayList);
	   }

	}
}
/*
- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
- 똑같은 이름이 있으면 모두 삭제한다.

삭제할 이름 입력 : 천사
회원의 정보가 없습니다

또는 
삭제할 이름 입력 : 홍길동 (홍길동이라는 이름 가진 SungJukDTO를 모두 제거)
삭제하였습니다.
*/