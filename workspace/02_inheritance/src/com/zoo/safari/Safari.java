package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo z = new Zoo(); // extends함으로써 부모객체를 생성 so,
		z.tiger();
		// z.giraffe(); // 부모는 밑에 뭐가 있는지 모른다.
		// z.elephant(); // so, 다른 패키지에서 접근불가는 여전함
		// zoo.lion(); // private 접근 불가
		System.out.println("-----------------");
		
		Safari s = new Safari(); // 자식객체 생성
		s.tiger();
		s.giraffe(); // 상속받았으므로 접근 가능
		// s.elepahnt(); // default 접근 불가 - 다른 패키지의 자식 클래스 사용 불가능
		// s.lion(); // private 접근 불가
		
	}
}
