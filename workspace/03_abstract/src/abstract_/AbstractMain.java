package abstract_;

public class AbstractMain extends AbstractTest { // 추상클래스를 상속받은 클래스에서 상속받은 메서드를 구현하지 않으면 에러가 뜸
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// AbstractTest at = new AbstractTest(); // 추상클래스는 new 불가능
		AbstractTest at = new AbstractMain();  // 자식으로 생성하면서 부모를 참조하는 건 가능
		at.setName("홍길동");
		System.out.println(at.getName());

	}
}
