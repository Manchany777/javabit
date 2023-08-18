package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDeleteSam implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		int sw = 0; // switch 변수
		
		/* error - java.util.ConcurrentModificationException	// 현재의 위치를 못찍고 들어가는 예외
		for(SungJukDTO sungJukDTO : arrayList) {
			if(sungJukDTO.getName().equals(name)) {
				sw = 1;
				arrayList.remove(sungJukDTO);
				// 똑같은 이름이 있을 수도 있으니 break를 안 된다.
			}//if
		}//for
		*/
		// ConcurrentModificationException의 의미??
		// Arraylist는 remove메소드로 중간에 있는 배열요소를 삭제하면 
		// 인덱싱을 재실행하는데 문제는 이때 재정렬 되면서 인덱싱의 위치를 다시 잡아서 인덱스 위치가 바뀌게 된다.
		// 이건 지금 쥐고있는 Arraylist의 사이즈가 바뀌어버렸다는 걸 의미하고 이로인해 확장형for문이 제대로 돌지 못하는 것
		// (Arraylist의 배열위치가 실행중간에 바뀌어 버리면 확장형for문은 사용할 수 없다.)
		
		// 이런 문제를 해결하기 위해 대신 Iterator를 쓰는 것
		// Arraylist가 각 객체배열요소의 인덱스 주소를 참조하고 있듯이 it라는 Iterator도 주소값을 참조한다.
		Iterator<SungJukDTO> it = arrayList.iterator(); // iterator 메소드를 이용하여 Iterator 객체 생성
		while(it.hasNext()) {  // Iterator에 있는 이 값이 없을 때까지 반복해라 (값이 없으면 false를 반환)
			SungJukDTO dto = it.next(); // it.next(); - 현재 위치의 항목을 꺼내서 Iterator버퍼공간에 보관 하고 다음으로 이동
			// SungJukDTO dto - 꺼내서 버퍼공간에 담아준 내용을 dto에 넘겨주라는 의미
			// 현재의 항목을 next()로 버퍼에 담는 순간 it이 가리키는 SungJukDTO의 주소값은 이미 다음 항목을 가리키고 있다.
			
			if(dto.getName().equals(name)) {
				sw = 1;
				it.remove(); //it.next()가 반환하는 항목(아까 임시버퍼에 저장한 항목)을 제거
				// it 가 가리키고 있는 곳(DTO을 지우는 게 아니라 next()메소드로 보관한 버퍼공간의 내용을 지우는 것
				// 즉 remove는 현재 it이 가리키고 있는 항목이 아닌 next()로 버퍼로 넘겨 이미 이전의 항목이 된 내용을 지우는 것 뿐이므로 절대 SungJukDTO의 인덱스와 상관이 없다.
				// 왜냐하면 버퍼에 있던 이전의 항목이 삭제되어 SungJukDTO의 항목이 바뀌어도 이미 it은 다음 항목을 가리키고 있으니까 문제가 없다는 애기
				// 따라서 에러없이 깔끔하게 결과값을 출력해준다.
			}
			
		}//while
		
		if(sw == 0)
			System.out.println("회원의 정보가 없습니다");
		else
			System.out.println("삭제 완료");
	}
}














