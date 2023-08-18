package inheritance;

class Test extends Object {
	
}
//---------------------
class Sample {
	
	public String toString() {  // Object최상위 부모객체의 toString 메서드 재정의
		return getClass() + "@개바부";   // 클래스명 + 개바부
	}
}
//---------------------
class Exam {
	private String name = "홍길동";
	private int age = 25;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}
//---------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);  // 클래스명@16진수;
		System.out.println("객체 t = " + t.toString()); // 똑같은 결과값
		System.out.println("객체 t = " + t.hashCode()); // 10진수로 주소값 출력
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s);  // 클래스명@개바부
		System.out.println("객체 s = " + s.toString()); // 똑같은 결과값
		System.out.println("객체 s = " + s.hashCode()); // 10진수로 주소값 출력
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 e = " + e);  // 여기 있는 e가 16진수로 출력되는 게 아니라 내가 toString메서드로 재정의한 내용이 출력된다. getter, setter 없이 가능
		System.out.println(e.getName() + "\t" + e.getAge()); // getter, setter 사용해서 출력하는 방법
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa);			  // 문자열은 자동으로 오버라이딩이 되기때문에 주소값이 아닌 문자열이 출력된다.
		System.out.println("객체 aa = " + aa.toString());	  // .toString을 찍어보면 더 이해가 잘 된다. 기본적으로 aa에는 toString이 생략이 된 것이기때문에 toString이 문자열을 오버라이딩 했다는 것을 알 수 있다.
		System.out.println("객체 aa = " + aa.hashCode());  // 문자열을 해시코드로 오버라이딩(믿으면 안된다. 짭해시)
		System.out.println();
		// 이에 대한 자세한 것은 아래 이론정리를 참고
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : " + (bb==cc)); 			// 주소 비교 - flase
		System.out.println("bb.equals(cc) : " + bb.equals(cc)); // 문자열 비교 - true
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : " + (dd==ee)); 			// 주소 비교 - flase
		System.out.println("dd.equals(ee) : " + dd.equals(ee)); // 주소 비교 - false
		System.out.println();
		// String의 equals는 문자열을 비교하는 것이고, Object의 equals는 주소를 비교하는 것이다. equals라고 해서 무조건 문자열이 아닐 수 있으니 주의하자
		
		String ff = new String("apple");
		String gg = new String("apple");
		System.out.println("ff==gg : " + (ff==gg)); 			// 주소 비교 - flase // Object의 주소값
		System.out.println("ff.equals(gg) : " + ff.equals(gg)); // 문자열 비교 - true  // 오버라이드된 String의 equals비교
		System.out.println();
		
		
		
		/* 이론정리
		class Object {
			public String toString() {}			클래스명@16진수
			public int hashCode() {}			10진수
			public boolean equals(Object ob){}	참조값 비교
		}

		class String
			public String toString() {}			문자열  // 오버라이딩을 하면 자식에게 우선권이 가기때문에 16진수값이 아닌 문자열이 찍히는 것이다.
			public int hashCode() {}			10진수 (믿으면 안된다)
			 									-> 표기할 수 있는 문자열은 무한대이기 때문에 10진수로는 다 표기할 수 없다.
			public boolean equals(Object ob){}	문자열 비교
		}
		 */
	}
}
