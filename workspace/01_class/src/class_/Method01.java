package class_;

public class Method01 {
	int a;
	// System.out.println(a);   이런 명령들은 반드시 함수 안에 선언되야함
	int b = 10;
	
	//int c;    // 변수 선언
	//c = 20;   // 실행x (명령어는 함수에서만 가능)
	int d = 20;  // 이건 가능
	
	public static void idsp() {    // static함수 구현
		System.out.println("static method...");
	}
	
	public void output() {    // 함수 구현
		System.out.println("non-static method...");
	}
	
	public static void main(String[] args) {
		Method01.idsp(); // static함수 호출
		
		Method01 m = new Method01();
		m.output();
		
		new Method01().output(); // 1회용 용기로 사용하는 방법 (추천 x)
	}
}
