package constructor;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int count = sc.nextInt();
		System.out.println();
		
		Exam[] ex = new Exam[count];  // 아래의 객체들을 한 번에 객체배열로 생성
		//ex[0] = new Exam();
		//ex[1] = new Exam();
		
		//Exam ex1 = new Exam(); // 1. = Exam[] ex = new Exam[count];
		//Exam ex2 = new Exam();
		for(int i=0; i<ex.length; i++) {
			ex[i] = new Exam();  // 2. = ex[0] = new Exam(); ex[1] = new Exam();
			ex[i].compare();
			System.out.println();
			
		} // for
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(int i=0; i < count; i++) {
			System.out.print(ex[i].getName() + "\t");
			for(int j=0; j < ex[i].getOx().length; j++) {
				System.out.print(ex[i].getOx()[j] + " ");
			} // for문 j
			System.out.println("\t" + ex[i].getScore());
		} // for문 i
	}
}
