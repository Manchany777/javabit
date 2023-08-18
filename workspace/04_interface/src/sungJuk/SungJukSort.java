package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	Scanner scan = new Scanner(System.in);
	SungJuk sungjuk = null;
	int num;
	
	public void menu() {
			System.out.println();
			System.out.println("*******************");
			System.out.println(" 1. 총점으로 내림차순");
			System.out.println(" 2. 이름으로 오름차순");
			System.out.println(" 3. 메인메뉴로 가기");
			System.out.println("*******************");
			System.out.print(" 원하는 기능을 고르세요 : ");
			num = scan.nextInt();
			System.out.println();
	}
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println("정렬 전");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO sungJukDTO : arrayList) {
			//System.out.print(personDTO.getName() + " ");  // 객체배열에서 바로 값 가져오기
			System.out.println(sungJukDTO);                 // toString을 오버라이딩 한 후에 메서드 호출하기
		}// for
		System.out.println();
		
		while(true) {
			menu();
			if(num == 1) {
				Collections.sort(arrayList);  // 여기서는 SungJukDTO에서 기본적으로 compareTo한 총점으로 sort하게 된다.
				
			} else if(num == 2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					// 오름차순
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
				
				Collections.sort(arrayList, com);   // 여기서는 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용하는 Comparator인터페이스로 이름으로 정렬하기를 익명 이너클래스를 사용해서 재구현
			} else if(num == 3) {
				break;
			} else {
				System.out.println("*1~3까지만 번호를 허용합니다.");
				continue;
			} //if
			
			// 출력
			System.out.println();
			System.out.println("정렬 후");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO sungJukDTO : arrayList) {
				System.out.println(sungJukDTO);
			}// for
			System.out.println();
		}//while
	}
}
/*
7. SungJukSort.java
- menu() 만들어서 작성하시오

********************
  1. 총점으로 내림차순
  //2. 이름으로 오름차순
  3. 이전 메뉴 -> service 함수로 다시 오게
********************
  번호 : 
*/