package inheritance;

public class Child extends Super {
	private String name;
	private int age;
	
	public Child() {
		System.out.println("Sub의 기본 생성자");
	}
	
	public Child(String name, int age, double weight, double height) {
		System.out.println("Sub의 생성자");
		
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}
	
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);	
	}
	
	public static void main(String[] args) {
		Child bb = new Child("홍길동", 25, 85.3, 183.5);
		bb.disp(); // 모든 내용 출력 (만약, Child 클래스에서 오버라이딩 한 게 없다면 부모 메서드의 몸무게, 키만 출력됨)
		System.out.println("----------------");
		
		Super cc = new Child("라이언", 30, 78.3, 178.9);
		cc.disp();
	}
}
