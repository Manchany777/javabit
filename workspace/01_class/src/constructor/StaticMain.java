package constructor;

class StaticTest {
	private int a; // 필드, 인스턴스 변수
	// private int a = 10; -> ① 필드에서 바로 초기화 (c언어는 이렇게하면 에러 뜸)
	private static int b; // 필드, 클래스 변수 // static변수는 static메모리에 따로 영역이 잡히기때문에 생성자에서 초기화가 불가능
	
	static { // static 변수는 실행하자마자 메모리에 잡히기때문에 생성자가 아닌 이런식으로 따로 초기화 시켜야함
		System.out.println("static 초기화 영역");
		b = 10;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		a = 10; // ② 이렇게 초기화도 가능
		// b = 10; // static을 생성자에서 쓸 수도 있지만 객체 생성할때마다 값을 덮어씌워서 인스턴스 변수 결과와 달라질 게 없다. 이럴거면 굳이 static을 쓸 이유가 없어지게됨
	}
	
	public void clac() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + a + " b = " + b);  // a : this 생략, b : 클래스명 생략
		System.out.println("a = " + this.a + " b = " + StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static 메소드");
		//System.out.println("a = " + this.a + " b = " + StaticTest.b); // this사용 불가능. static에서는 static끼리만 논다.
	}
}
//-----------------
public class StaticMain {

	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.clac();
		aa.disp();
		System.out.println("------------");
		
		StaticTest bb = new StaticTest();
		bb.clac();
		bb.disp();
		System.out.println("------------");
		
		StaticTest cc = new StaticTest();
		cc.clac();
		cc.disp();
		System.out.println("------------");
		
		StaticTest.output(); // 클래스명.메소드명()
		aa.output();   // 객체.메소드명()
		// output(); // 만약 같은 클래스에 있다면 메소드명만 가지고 호출 가능
		// static은 클래스명을 직접 불러도 되고, 이미 존재하는 객체를 써도 먹힌다.
	}
}
