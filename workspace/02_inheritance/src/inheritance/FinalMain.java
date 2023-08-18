package inheritance;

enum Color {
	RED, GREEN, BLUE, CYAN, MAGENTA // 상수들의 집합체라 세미콜론(;) 필요없음. 그냥 나열만 하면 된다.
	// 알아서 0,1,2,3,4 순서대로 인덱스를 준다. 
}
//---------------
class Final {
	public final String APPLE = "사과";
	public final String STRAWBERRY;  //3. // 상수는 필드에서 초기화를 안할 경우, 생성자에서 초기화를 해줘야 한다.
	
	public static final String LION = "사자"; //4. // 상수를 static변수로 만듦
	public static final String TIGER;  // static변수로 만든 상수에 초기값 선언을 안할 경우, 아래의 static메소드에서 선언을 해줘야함
	
//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;
//	public static final int CYAN = 3;
//	public static final int MAGENTA = 4;  // 이런 상수들이 수십수백개일때는 상수들의 집합체는 enum을 더 많이 쓴다.
	
	public Final() {
		this.STRAWBERRY = "딸기";
	}
	
	static {
		TIGER = "호랑이";
	}
}
//---------------
public class FinalMain {

	public static void main(String[] args) {
		//2. // final은 반드시 변수값을 대문자로 적어라
		final int A = 10;
		//1. // A++;   -> error가뜸 왜냐? final(상수)는 변경할 수 없는 수이니깐
		// A = 20; final의 값을 이미 위에서 정의했기때문에 재정의 불가
		System.out.println("A = " + A);
		
		final int B;
		B = 20;
		System.out.println("B = " + B);
		System.out.println();
		
		Final f = new Final();
		System.out.println("APPLE = " + f.APPLE);
		System.out.println("STRAWBERRY = " + f.STRAWBERRY);
		System.out.println();
		
		System.out.println("LION = " + Final.LION); // static변수이므로 new 없이 바로 클래스.변수명으로 호출 가능
		System.out.println("LION = " + f.LION); // 당연히 일반적인 방식처럼 인스턴스명으로도 호출이 가능하다.
		System.out.println("TIGER = " + f.TIGER);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED); // 상수는 static 걸려있으므로 가능 (왜 static 걸려있나? 인터페이스에서 쓰고 있으므로)??
		System.out.println("빨강 = " + Color.RED.ordinal()); // 열거 타입 상수가 열거 타입에서 선언된 순서를 보여줌
		
		for(Color datac : Color.values()) {
			System.out.println(datac + "\t" + datac.ordinal());
		}
	}
}
