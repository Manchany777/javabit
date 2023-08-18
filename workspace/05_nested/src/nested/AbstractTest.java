package nested;

public abstract class AbstractTest {  // POJO 형식 - Object한테만 상속받고, 멤버변수를 private로 주고, getter setter를 쓰는 전형적인 자바 문법 형식을 뜻함
	String name;

	public String getName() {  // 구현
		return name;
	}

	public abstract void setName(String name); // 추상메소드
}