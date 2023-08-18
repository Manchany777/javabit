package member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberNameAsc implements Member {
	// class String extends Object implements Comparable {  -> String은 최상위 객체를 상속하고 Comparable 인터페이스를 기본적으로 구현하기때문에
	//  @Override   // compareTo 메소드를 자세적으로 오버라이딩 하게 된다.
	//  public int compareTo(!!
	@Override
	public void execute(List<MemberDTO> list)
			throws IOException, FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("정렬 전");
		System.out.println("이름\t나이\t전화\t주소");
		for(MemberDTO memberDTO : list) {
			//System.out.print(personDTO.getName() + " ");  // 객체배열에서 바로 값 가져오기
			System.out.println(memberDTO);                 // toString을 오버라이딩 한 후에 메서드 호출하기
		}// for
		System.out.println();
		
		Comparator<MemberDTO> com = new Comparator<MemberDTO>() {
			// 오름차순
			@Override
			public int compare(MemberDTO m1, MemberDTO m2) {
				return m1.getName().compareTo(m2.getName());
			}
		};
		
		Collections.sort(list, com);   // 여기서는 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용하는 Comparator인터페이스로 이름으로 정렬하기를 익명 이너클래스를 사용해서 재구현
			
			
		// 출력
		System.out.println();
		System.out.println("정렬 후");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
		}// for
		System.out.println();
	}

}
