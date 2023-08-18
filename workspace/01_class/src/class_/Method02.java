package class_;

public class Method02 {

	public static void main(String[] args) {
		// main 메소드는 맨위나 아래에 적어라. 중간에 낑겨쓰지 마라. 가독성 떨어진다.
		Method02 m = new Method02();
		
		int s1 = m.sum(25, 36); // 호출
		System.out.println(" 합 = " + s1);
		
		double s2 = m.sub(25, 36); // 호출
		System.out.println(" 차 = " + s2);
		
		double s3 = m.mul(25, 36); // 호출
		System.out.println(" 곱 = " + s3);
		
		double s4 = m.div(25, 36); // 호출
		// System.out.println(" 몫 = " + s4);
		System.out.println(" 몫 = " + String.format("%010.3f", s4));  
		// String.format() : 리턴되는 문자열의 형태를 지정하는 메소드 
		/* String.format("%10.3f", s4));   : 받은 자료를 실수로 포맷팅하고 문자열로 만듦
		   %5.3f : 총 5개의 숫자를 표현하는데 그중 3자리를 소수점으로 표현
		   .3% : 소수점 이하만 맞춰주고 나머지는 알아서
		   %0.3f (x) : 자바는 .3 앞에 유효숫자만 가능하다. c언어는 가능
		   %010.3f : .포함 총 10개의 공간을 만드는데 뒤의 3개는 소수점으로 할당하고, 나머지 빈공간은 0으로 채운다 */
		// 참고 :  format과 concat은 문자열을 다른 형태의 문자열로 변환해주는 메소드이다.
	}
	
	public int sum(int x, int y) {	// 메소드 구현
		// sum(int x, y); (x) // 변수 데이터 타입은 무조건 개별 선언해야 한다. 인자 두 개의 형이 같더라도 따로 선언해야함
		return x+y;
		// return x+y, x-y, x*y, x/y; (x) 리턴값은 하나만 가능
	}
	
	public double sub(double x, double y) {
		return x-y;
	}
	
	public double mul(double x, double y) {
		return x*y;
	}
	
	public double div(int x, int y) {
		return (double) x/y;  // 강제형변환 (cast연산)
						      // int형으로 받은 인자값에 대한 소수점 값을 리턴하기 위해 잠시만 double형으로 바꿈
	}
}
