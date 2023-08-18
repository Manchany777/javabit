package interface_;

// public class InterMain implements InterA, InterB {  // 다중 interface implements 가능 but, 부모의 추상클래스를 모두 구현해야 함
public class InterMain implements InterC {  // 다중 implements가 가능하므로 InterA, InterB를 상속받은 InterC를 implements함으로써 InterA, InterB의 메소드도 InterMain에서 구현이 가능하다
	public void aa() {}
	public void bb() {}
	
	public void cc() {}
	public void dd() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
