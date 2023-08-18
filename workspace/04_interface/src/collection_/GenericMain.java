package collection_;
class GenericTest<T>{
	T a;
	
	public void setA(T a){  // 아직 무슨 타입인지 모르기에 그냥 T a로
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
}
//-----------------------
public class GenericMain {
	
	public static void main(String[] args) {
		// 한 가지 타입으로만 쓰자고 규명하는 것
		GenericTest<String> aa = new GenericTest<String>();  // String 타입으로 규정
		aa.setA("홍길동");
		System.out.println(aa.getA());
		
		//aa.setA(25); // (x) 자체적으로 String 타입으로 쓴다고 선언했는데 int형을 쓰면 에러가 남
		GenericTest<Integer> bb = new GenericTest<Integer>();   // Integer 타입으로 규정
		bb.setA(25);
		System.out.println(bb.getA());
	}
}
