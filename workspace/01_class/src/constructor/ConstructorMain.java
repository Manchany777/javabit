package constructor;

public class ConstructorMain {
	private String name = null;
	private int age = 0;
	
	public ConstructorMain(){    // public void ConstructorMain() -> 에러는 아니지만 더이상 생성자가 아니게 됨(void시 생성자 자격박탈)
		System.out.println("기본 생성자");
	};
	
	public ConstructorMain(String name) {
		this(); // 위에 있는 기본 생성자(ConstructorMain()) 호출 - 생성자는 생성자끼리 호출이 가능하다.
		this.name = name;
	}
	public ConstructorMain(int age) {
		this("어피치");  // ConstructorMain(String name) 생성자 호출 -- 오버로드된 다른 생성자 호출
		this.age = age;
	}
	public ConstructorMain(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain(); // 여기서 ()가 생성자의 역할을 함 -> 기본 생성자 호출 후 복귀
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println("-------------------");
		
		ConstructorMain bb = new ConstructorMain("홍길동");
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println("-------------------");
		
		ConstructorMain cc = new ConstructorMain(30);
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println("-------------------");
		
		ConstructorMain dd = new ConstructorMain("홍길동", 30);
		System.out.println(dd.name + "\t" + dd.age);
		System.out.println("-------------------");
	}
}