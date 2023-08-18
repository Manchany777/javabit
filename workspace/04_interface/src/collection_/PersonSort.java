package collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		// ########## 문자열 비교
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println();
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data + " ");
		}
		System.out.println(); System.out.println();
		
		// 문자열 비교 후 정렬해주는 메서드
		Arrays.sort(ar); // Arrays : 배열과 관련된걸 처리해주는 클래스(안에다 문자열을 넣어주면 배열로 처리해줌) 
						  // 이 안에다 배열값을 넣어주면 Arrays가 알아서 크기별로 정렬해줌
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data + " ");
		}//for
		System.out.println(); System.out.println();
		System.out.println("----------------------------------------------");
		
		// ########## 객체 배열 비교
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("어피치", 35);
		
		ArrayList<PersonDTO> list = new ArrayList<>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전");
		for(PersonDTO personDTO : list) {
			//System.out.print(personDTO.getName() + " ");  // 객체배열에서 바로 값 가져오기
			System.out.println(personDTO);                  // toString을 오버라이딩 한 후에 메서드 호출하기
		}// for
		
		System.out.println();
		System.out.println("나이로 오름차순");
		Collections.sort(list);  // Collections.sort() : 객체 정렬을 위한 메소드
				// 이걸 이용하면 객체의 정렬이 가능하다. but 순서는 객체 배열을 통으로 옮기지만 비교는 그 배열의 요소 중 나이(age)끼리 한다.
				// 이때 객체배열의 어느 요소를 기준으로 sort할 것인지 기준을 정해줘야 한다. 이때 사용하는 인터페이스가 바로 Comparable 인터페이스이다. -> 이걸 PersonDTO에 구현해줘야 함
				// 구현을 위해  PersonDTO에서 Comparable inferface를 implements 해줘야 함
		System.out.println();
		
		System.out.println("정렬 후");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}// for
		System.out.println();
		System.out.println("//==============");
		
		// 나이가 아닌 이름으로 정렬해주고 싶은데 PersonDTO의 compareTo메소드를 건드리지 않고 여기서 만든다.
		System.out.println("정렬 전");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO); 
		}// for
		System.out.println();
		
		System.out.println("이름으로 오름차순");
		Comparator com = new Comparator<PersonDTO>() {  // 익명이너클래스로 구현 (이때, 나는 PersonDTO만 구현합니다. 라고 제네릭에 기준점을 잡아줘야됨)
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {  // 구현
				// if(p1.getName() < p2.getName()) return -1;  // String은 age와 달리 이런식으로 비교가 불가능
				return p1.getName().compareTo(p2.getName()); // 오름차순 // 우리가 구현 안해도 compareTo 자체적으로 -1, 1, 0을 가져옴. 이걸 가지고 정렬해주면 된다.
				// How? String은 이미 final class String extends Object implements Comparable<String>{} 로 오버라이딩 되어있기때문에

				//return p1.getName().compareTo(p2.getName())*1; // 내림차순 (위의 기본값인 -1에 -1을 곱해서 순서를 뒤집어 주는 것)
			}
		}; // 결론 : compareTo의 진짜 기준점은 age이지만 이걸 여기서 name으로 재정의시킨 것
		
		Collections.sort(list, com);  // 재정의한 메서드를 호출하여 문자열(이름)으로 정렬하려면 인자값으로 가져와야 한다. 그냥 list만 쓰면 기존의 age정렬을 가져옴
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}// for
		System.out.println();
	}
}