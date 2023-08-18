package interface_;

public interface InterA {
	// 상수 지정
	public static final String NAME = "홍길동"; // 상수
	public int AGE = 25; //상수 - public static final 생략가능
	
	// 추상 메소드 지정
	public abstract void aa();
	public void bb(); // - abstact 생략 가능
	
	// 틀 지정 완료
}
