package interface_;

import java.util.Scanner;

public class ComputeService {
	Scanner scan = new Scanner(System.in);
	Compute com = null;  // null값으로 초기화 시켜주지 않으면 에러 뜸
	int num;
	
	public void menu() {
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 합");
			System.out.println(" 2. 차");
			System.out.println(" 3. 곱");
			System.out.println(" 4. 몫");
			System.out.println(" 5. 종료");
			System.out.println("************");
			System.out.println(" 번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break;
			if(num == 1) {
				//Sum sum = new Sum();  // 1:1관계, 결합도 100% -> 바람직하지 못한 방식 (클래스의 수가 많아지면? 메모리 낭비↑)
				com = new Sum(); // '부모 = 자식' 으로 접근
			} else if(num == 2) {
				com = new Sub();	
			} else if(num == 3) {
				com = new Mul();			
			} else if(num == 4) {
				com = new Div();
			} else {
				System.out.println("1~5까지만 번호를 허용합니다.");
				continue;
			}
			
			com.disp(); // 공통되는 메소드 호출 (if문 개개에 적을 필요없음...이 호출 자체는 if문과 상관없다.)
		} //while
	}// menu
}
