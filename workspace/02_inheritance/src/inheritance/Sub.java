package inheritance;

public class Sub extends Super {
	private String name;
	private int age;
	
	public Sub() {
		System.out.println("Sub의 기본 생성자");
	}
	
	public Sub(String name, int age, double weight, double height) {
		super(weight, height); // 부모 생성자 호출 (기본x 일반 생성자)
		
		System.out.println("Sub의 생성자");
		
		this.name = name;
		this.age = age;
		// super.weight = weight; // this.weight = weight;  // 부모에게 상속받은건 정확하게 부모것이라고 지칭하는 것도 가능
		// super.height = height; //this.height = height;   // 둘 중 편한 걸로
	}
	// 생성자가 오버로드된 다른 생성자를 강제 호출할 수 있듯이, 자식 생성자는 부모 생성자를 강제로 호출이 가능하다.
	// 이때는 무조건 생성자의 맨 위에 써야함
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
	public static void main(String[] args) {
		Sub aa = new Sub();
		System.out.println("------여기까지 aa--------");
		System.out.println();
		
		Sub bb = new Sub("홍길동", 25, 85.3, 183.5);
		bb.disp(); // 몸무게, 키만 출력됨
		System.out.println();
		bb.output(); // 모든 내용 출력
		System.out.println("------여기까지 bb--------");
		
		Super cc = new Sub("라이언", 30, 78.3, 178.9);
		// cc.output(); // 에러 뜸(Sub 객체가 Super만 참조하고 있기때문)
		cc.disp(); 		// 이건 가능
	}
}


// Sub 클래스 생성을 하면 --- 자신의 클래스와 부모 클래스를 모두 생성한다.
//					--- 생성자 2번 호출 (대신 부모는 기본 생성자를 호출)
// so, Super() 클래스에 인자값이 있는 클래스("public Super(double weight, double height)")만 적으면 에러가 뜸 
// --> 해결 : 기본 생성자를 추가로 적거나, 인자값이 있는 생성자를 삭제하거나