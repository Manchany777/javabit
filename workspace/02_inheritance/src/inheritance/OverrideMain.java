package inheritance;

class AA {
	public int a = 3;
	
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}
//----------------
class BB extends AA {
	public int a = 8; // 얘는 AA의 a과 완전 별개 (변수는 오버라이딩과 관계 없다. 오버라이딩은 함수에만 해당되는 것)
	
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}
//----------------
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); // BB:13
		System.out.println("aa : " + aa.a); // aa : 13
		System.out.println();
		
		AA bb = new BB(); // 부모 = 자식
		System.out.println(bb);
		bb.disp(); // BB : 13
		System.out.println("bb : " + bb.a); // bb : 3 (변수는 오버라이딩과 관계x)
		System.out.println();
		
		//부모(bb)의 주소값을 받아서 자식에게 던져줌
		BB cc = (BB)bb; // 자식 = (자식)부모
		System.out.println(cc);
		cc.disp(); // BB : 13
		System.out.println("cc : " + cc.a); // cc : 18
		System.out.println();
		
		AA dd = new AA(); // 자식들이 지지고 볶는건 나와 상관이 없다. 순수하게 자기 결과값만 출력
		dd.disp(); // AA : 8
		System.out.println("dd : " + dd.a); // dd : 8
		System.out.println();
	}

}
