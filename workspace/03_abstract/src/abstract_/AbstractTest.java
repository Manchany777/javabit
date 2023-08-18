package abstract_;

public abstract class AbstractTest { // POJO 형식 (Plain Old Java Object) - private 잡고 setter & getter or constructor 잡고
	String name;
	
	public String getName() { // 구현
		return name;
	}
	public abstract void setName(String name); // 추상 메소드가 있으면 클래스도 추상 클래스이어야 한다.

}

// 추상 클래스에는 추상 메소드가 아닌 일반 메소드도 있을 수 있다. 이렇게 추상메서드와 일반 메서드가 섞여있는 걸 중첩 메서드라 한다.