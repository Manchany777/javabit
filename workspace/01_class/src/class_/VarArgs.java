package class_;

public class VarArgs {

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = " + va.sum(10, 20));  // 호출
		System.out.println("합 = " + va.sum(10, 20, 30));
		System.out.println("합 = " + va.sum(10, 20, 30, 40));
	}
	
/*	public int sum(int x, int y) {  // 구현
		return x + y;
	}
	
	public int sum(int x, int y, int z) {  // 구현
		return x + y + z;
	}
	
	public int sum(int x, int y, int z, int l) {  // 구현
		return x + y + z + l;
	}
*/
	
	// 위처럼 개수만 다른 오버로딩은 코드개수가 너무 늘어나게 됨
	// 이것을 아래처럼 표현하면 메서드 하나로 동일 인수 자료형의 매개변수를 자유롭게 구현 가능 (...)의 의미 : 나는 자유롭게 인수를 받아들이겠다.
	// 이런식으로 들어온 데이터는 배열로 저장됨
	// 안에서 내부적으로 배열화 시킴
	public int sum(int... ar) { // 배열화
		int hap = 0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		} // for
		return hap;
	}
}
