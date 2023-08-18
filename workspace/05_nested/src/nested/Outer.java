package nested;

public class Outer {
	private String name;
	
	public void output() {
		// System.out.println(" 이름 = " + name + " 나이 = " + age); // 2. 바깥쪽 클래스는 안쪽 클래스의 멤버에 접근 불가능 (age 에서 에러발생)
		System.out.println(" 이름 = " + this.name + " 나이 = " + new Inner().age); // 2. So, 안쪽의 클래스로 객체를 생성해야 접근 가능
		// 3. name에는 this 생략 가능
	}
	
	class Inner {
		private int age;
		public void setName(String name) {
			Outer.this.name = name;
		}
		
		public void disp(){
			System.out.println(" 이름 = " + Outer.this.name + " 나이 = " + this.age); // 1. 상속하고 혼동 주의, 내부 클래스를 감싸고 있는 바깥 클래스의 멤버 변수에도 그냥 접근이 가능  
			// 4. age는 this 생략 가능
			// 5. name은 Outer.this. 생략가능
		}
	} // class inner
	
	public static void main(String[] args) {
		Outer ou = new Outer();  // 6. Outer 객체 생성
		ou.name = "홍길동"; // Outer 클래스의 변수 선언
		ou.output(); // 함수 호출
		
		// Inner in = new Inner();// 7. Inner 클래스는 생성불가 (중첩 클래스는 독립생성 불가능)
		Outer.Inner in = ou.new Inner(); // So, Outer안에 소속되어있음을 명시해야함
		in.age = 25;
		in.disp();
		
		Outer.Inner in2 = ou.new Inner();  // 8. in이너 클래스 객체는 in2와 주소값을 공유 (결국 서로 하나의 객체를 공유하는 셈)
		in2.age = 30;
		in2.disp();  // in과 공유하기 때문에 이름에 홍길동이라 뜬다
		
		Outer.Inner in3 = new Outer().new Inner();  // 9. 이너끼리 공유하기 싫을 때 만드는 방식. 이때의 객체는 Inner를 위한 1회용 
													// (참조하고 있는 주소값이 없기때문에 이 객체에서는 더이상 inner 객체가 생성이 안된다. = in2처럼 in4가 안된다는 얘기)
		in3.age = 35;
		in3.disp();  // 공유하지 않기때문에 이름에 null값이 뜬다.
		// in3.name = "코난" // this가 없는 static영역인 main에서는 접근불가 (아예 별개의 영역이기때문에)
						    // 코난이라는 자료를 주고 싶으면 저 위의 클래스 영역에서 해야지 여기서는 절대 불가능하다.
		in3.setName("코난"); // 여기서 넣고 싶으면 setter 사용해야 함
		in3.disp();
	}
}
