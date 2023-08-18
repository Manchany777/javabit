package collection_;

import java.util.ArrayList;

public class PersonMain{

	public ArrayList<PersonDTO> init() {  // 4. return값인 PersonDTO 클래스의 ArrayList를 void 대신에 적는다.
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("어피치", 28);
		PersonDTO cc = new PersonDTO("프로도", 33);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();  // 1. 위의 객체 3개를 담을 제네릭이 필요...즉, PersonDTO타입의 제네릭을 사용하는 ArrayList객체 생성
		list.add(aa);  // 2. 이 ArrayList안에 3개를 차곡차곡 담아줌
		list.add(bb);
		list.add(cc);
		
		return list; // 3. 이 배열을 나를 호출시킨 쪽으로 리턴필요
					 // list 안에는 클래스가 아닌 클래스 객체의 주소값이 담겨서  옮겨지게 된다. (클래스를 통쨰로 옮기는 건 무거워서 힘듦)
					 // 이때도 마찬가지로 옮겨지는건 list 그 자체가 아닌 list의 주소값을 리턴
	}
	public static void main(String[] args) {
		PersonMain main = new PersonMain();
		
		ArrayList<PersonDTO> list = main.init(); // 호출 후 똑같은 타입값으로 ArrayList주소값을 받아줌
												 // 이때 ArrayList는 init()의 ArrayList와는 다르다. 서로 각각 별개인 지역변수임
		
		System.out.println(list.get(0));  // 주소값 출력 : collection_.PersonDTO@58d25a40
		System.out.println(list.get(1));  // 주소값 출력 : collection_.PersonDTO@1b701da1
		System.out.println(list.get(2));  // 주소값 출력 : collection_.PersonDTO@726f3b58
		// 우리가 return으로 움직이는 건 객체배열 자체가 아니라 그 주소값이라는 의미
		
		System.out.println();
		System.out.println(list.get(0).getName() + "\t" + list.get(0).getAge());
		System.out.println(list.get(1).getName() + "\t" + list.get(1).getAge());
		System.out.println(list.get(2).getName() + "\t" + list.get(2).getAge());
		// 주소값이 아닌 그 주소값이 가리키는 객체의 내용물을 출력
		
		System.out.println();
		for(PersonDTO dto : list) {
			System.out.println(dto.getName() + "\t" + dto.getAge());
		} // 확장형 for문으로 출력
	}
}
