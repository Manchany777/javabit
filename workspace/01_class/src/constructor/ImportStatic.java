package constructor;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.Random;

public class ImportStatic { // static으로 import하면 앞의 클래스명 생략하고 메소드명만 입력이 가능하다. 하지만 추천하지는 않는 방식

	public static void main(String[] args) {
		// 위에서 static으로 import하면 System.out.println(); 대신 out.println(); 사용 가능
		
		System.out.println(Math.random());
		// = System.out.println(random());  
		// 위에서 static으로 import하면 Math.random() 대신 random() 사용 가능
		System.out.println((int)(Math.random() * 26) + 65); // 65~90 사이의 난수
		System.out.println((char)(Math.random() *26 + 65)); // 해당하는 아스키코드값에 대응되는 알파벳 출력
		System.out.println(Math.pow(3, 4));  // 3의 4승 (정수형으로 입력해도 실수형으로 리턴함)  
		// 위에서 static으로 import하면 Math.pow(3, 4) 대신 pow(3,4) 사용가능
		System.out.println(String.format("%.2f", 12.567)); // 12.57
		// 위에서 static으로 import하면 String.format("%.2f", 12.567)대신 format("%.2f", 12.567)
		System.out.println();
		
		Random r = new Random(); // 난수만 만들어주는 전용 클래스
		System.out.println(r.nextDouble()); // 0<= 난수 <1
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100) + 1); // 1 ~ 100
		// -> 위의 Math클래스와 똑같은 난수를 만들어내는 메소드이지만 ???하는 게 다르다.
		
	}
}


/*
난수란?
0 <= 난수 < 1

x ~ y 사이의 난수
(int)(math.random() * (y-x+1) +x;
*/