package constructor;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	public static final String JUNG = "11111"; // 상수화
	
//	@SuppressWarnings("finally")
	public Exam() {
		ox = new char[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("답안 입력 : ");
		dap = sc.next();		
				
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.print("이름 입력 : ");
//			name = sc.next();
//			System.out.print("답안 입력 : ");
//			dap = sc.next();
//		} catch (Exception e) {
//			System.out.println("개논물");
//		} finally {
//			return;
//		} //try-catch문
	}

	public String getName() {
		return name;
	}
	
	public char[] getOx() {
		return ox;
	}
	
	public int getScore() {
		return score;
	}
	
	public void compare() {
		for(int i=0;  i < ox.length; i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {   // 정답이 맞았을 떄에만 점수가 증가하도록
				ox[i] = 'O';
				score += 20;
			} else
				ox[i] = 'X';
		} //for
	}
}

/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'
- 1문제당 점수는 20점씩 처리

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
public static final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 를 이용하여 이름과 답을 입력받는다. 
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 2 // 객체배열 필요

이름 입력 : 홍길동
답 입력 : 12311  

이름 입력 : 코난
답 입력 : 24331

이름		1 2 3 4 5	점수
홍길동  	O X X O O	60
코난  	X X X X O	20
 */