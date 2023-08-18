package constructor;

public class MemberMain {

	public static void main(String[] args) {
		// MemberService클래스 안의 menu(); 호출
		MemberService mem = new MemberService();
		mem.menu();
		System.out.println("프로그램을 종료합니다.");

	}
}
