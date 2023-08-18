package sungJuk;

public class SungJukDTO implements Comparable<SungJukDTO> {  // 딱 1인분(가장 작은 단위)의 내용을 설계하는 곳
	// 필드
	private int no;
	private String name;
	private int korean, english, math, total; // 각자 따로 만드는 것보다 이게 더 깰끔쓰
	private double avg;
	// *참고 : 
	// 1. ~DTO.java(DTO클래스의 필드) 2. DB의 컬럼 3. HTML
	// 이 3개의 순서와 이름은 똑같이 잡는게 국룰이다.
	
	// 생성자
	public SungJukDTO(int no, String name, int korean, int english, int math) {
		super();
		this.no = no;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	
	// getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	
	// setter
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// method
	public void calc() {
		total = korean + english + math;
		avg = (double)(korean + english + math)/3;
	}
	
	@Override // SungJukList에 번거롭고 지저분하게 출력하기 보다 toString을 오버라이딩 해서 여기서 깔끔하게 출력하게 만드는 게 코드양도 줄고 더 좋다.
	public String toString() {
		return no + "\t" 
				+ name + "\t" 
				+ korean + "\t" 
				+ english + "\t" 
				+ math + "\t" 
				+ total + "\t" 
				+ avg;
	}
	
	@Override
	public int compareTo(SungJukDTO dto) {
		// 내림차순
		if (this.total < dto.total) return 1;
		else if(this.total > dto.total) return -1;
		else return 0;
	}
}