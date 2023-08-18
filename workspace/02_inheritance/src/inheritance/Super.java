package inheritance;

public class Super {
	protected double weight, height;
	
	public Super() {  // 인수는 변수와 달리 데이터타입 중첩선언이 불가능 Super(double wieght, height)이 안 된다는 소리
		System.out.println("Super의 기본 생성자");
		this.weight = weight;
		this.height = height;
	}//  인수가 2개인 생성자 - weight,  height
	
	public Super(double weight, double height) {  // 인수는 변수와 달리 데이터타입 중첩선언이 불가능 Super(double wieght, height)이 안 된다는 소리
		System.out.println("생성자");
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.out.println("몸무게 = " + this.weight);
		System.out.println("키 = " + this.height);
	}
}
