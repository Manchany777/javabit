package com.apple;

import com.zoo.Zoo; // 다른 패키지에 있는 클래스를 사용하기 위해선 import를 해줘야 함

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨강 사과");
		
		//zoo클래스에서 tiger() 호출
		Zoo zoo = new Zoo();
		zoo.tiger();
		// zoo.giraffe(); -> protected 접근 불가
		//zoo.elephant(); -> default 접근 불가
		// zoo.lion();  -> private 접근 불가
	}
}
