package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.print(" 번호 입력: ");
        int no = sc.nextInt();
        
        // 중복값 체크를 위한 반복문
 		while (checkNum(arrayList, no)) {
 			System.out.println("해당 번호는 이미 등록되어 있습니다. 다른 번호를 입력해주세요.");
 			System.out.print(" 번호 입력: ");
 			no = sc.nextInt();
 		}//while
        
 		// null값 체크를 위한 if문 (포기) -> arrayList안에 값이 하나라도 있으면 false가 되서 의미가 없음 (해당값에 대한 유효성 검사는 값이 입력되고 난 후에 수행되어야)
//        while (checkNull(arrayList)) {
//        	System.out.println("ggg");
//        	System.out.println("(" + no + "번에는 아직 입력된 값이 없습니다. 계속 하시려면 다시 한 번 입력해주세요)");
//        	break;
//        }
 		
 		System.out.print(" 이름 입력: ");
 		String name = sc.next();
 		System.out.print(" 국어 성적 입력: ");
 		int korean = sc.nextInt();
 		System.out.print(" 영어 성적 입력: ");
 		int english = sc.nextInt();
 		System.out.print(" 수학 성적 입력: ");
 		int math = sc.nextInt();
 		System.out.println("입력되었습니다.");
        
 		SungJukDTO sungjukDTO = new SungJukDTO(no, name, korean, english, math); // 위에서 따로따로 입력한 입력값들을 한 번에 모으는 역할을 하는 객체
 		arrayList.add(sungjukDTO);
 		sungjukDTO.calc();
	}
	
	
	// 중복값 체크를 위한 메소드
	private boolean checkNum(ArrayList<SungJukDTO> arrayList, int no) {
		for (SungJukDTO dto : arrayList) {
	        if (dto.getNo() == no) {
	            return true; // 중복된 번호가 존재하는 경우 true 반환
	        }
	    }
	    return false; // 중복된 번호가 존재하지 않는 경우 false 반환
	} 
	// TMI : ArrayList는 종류 후에도 주소값은 지워지지만 직접 참조받은 DTO값은 지워지지 않고 그대로 메모리에 남아있는 게 단점이다. 이게 쌓이면 메모리 누수로 뻑날 수도 있어서 이 부분이 단점
	
	// 해당 번호의 Null값 체크를 위한 메소드 (포기)
//	private boolean checkNull(ArrayList<SungJukDTO> arrayList) {
//		if(arrayList.isEmpty()) {
//			return true;
//		} else {
//			return false;
//		}//if
//	}
}
