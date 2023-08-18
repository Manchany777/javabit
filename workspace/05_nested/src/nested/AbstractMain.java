package nested;

public class AbstractMain {

	public static void main(String[] args) {
		// 추상메소드가 있는 추상클래스
		// AbstractTest at = new AbstractTest(); // 추상 클래스는 new 불가능 - 에러 발생
		AbstractTest at = new AbstractTest() {   // 익명 이너클래스 : 상속 시키면 너무 복잡하고, 구현할 인스턴스 메소드가 없을 때 사용
												 // 흑기사를 대동시키면 됨 (new가 안되는 흑기사를 대신해 setName에다 오버라이딩 시켜서 사용)
			@Override
			public void setName(String name) {   // 구현부 
				this.name = name;
				
			}}; 
		at.setName("홍길동");
		System.out.println(at.getName());
		
		// 인터페이스
		InterA in = new InterA() {		// new가 안되는 인터페이스 대신해서 흑기사를 대동시킴 (혼동주의, 인터페이스를 new하는 게 아니라 인터페이스를 대신 구현해주는 익명 이너클래스를 new 해주는 것)
			public void aa() {}			// 익명 이너클래스로 흑기사 시키는 여러 방법 중 인터페이스 익명 이너클래스가 가장 많이 쓰임
			public void bb() {}
		};
		
		// 추상메소드가 있는 추상클래스
		AbstractExam ae = new AbstractExam() { 	// 추상클래스는 그 안에 추상메소드가 없을지라도 new 불가능
												// 이럴때도 역시 흑기사를 대동시킨다. 이 경우 AbstractExam클래스는 추상메소드가 없기 때문에 원하는 메소드 선택해서 Override 가능
		};
	}
} // 메소드를 구현시키는건 클래스만 가능, 즉 AbstractTest at = new AbstractTest()는 익명 이너 클래스로써 또 하나의 클래스를 생성시킨 것 (AbstractTest()와 {} 사이에 이름이 없다.)
// AbstractMain.java
// AbstractMain.class
// AbstractMain$1.class // 익명 이너클래스 (옆의 $1은 단순히 번호부여용)
