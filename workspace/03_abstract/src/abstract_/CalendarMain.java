package abstract_;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMain {

	private int year;
	private int month;
	private int week;
	private int lastDay; // 28, 29, 30, 31
	
	public CalendarMain() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		this.year = scan.nextInt();
		System.out.print("월 입력 : ");
		this.month = scan.nextInt();
	}

	public void calc() {
		// 시스템 날짜를 기준으로 생성된다.
		// Calendar cal = new GregorianCalendar(); // Sub class(자식 클래스) 생성
		Calendar cal = Calendar.getInstance(); // 메소드를 이용하여 클래스 생성
		
		// 생성자, setter처럼 특정메소드에선 값을 집어넣어줄 수 있는 메소드가 있다. 이 메소드의 이름은 메소드마다 다르기때문에 그때그때 알아봐야 함
		cal.set(Calendar.YEAR, year);  		// 내가 원하는 년도
		cal.set(Calendar.MONDAY, month-1);  // 내가 원하는 월
		cal.set(Calendar.DAY_OF_MONTH, 1);  // 시작점을 무조건 1일로 만들기 위한 메소드 (이걸 안주면 현재 날짜를 기준으로 시작한다)
		// cal.set(year, month-1, 1);  		// -> 저 위의 set메소드 3개를 한 번에 묶어놓은 것
		
		week = cal.get(Calendar.DAY_OF_WEEK); // 1일에 해당하는 요일
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28, 29, 30, 31 (각 년도에 해당되는 마지막 날짜 계산)
		
	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<week; i++) { // 해당하는 달의 시작일을 일요일로 맞추고 거기에 맞춰 달력처럼 날짜를 출력
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {  // 해당하는 달력의 날짜를 나열
			System.out.print(i + "\t");
			
			if(week%7 ==0) System.out.println();
			week++;
		}
	}
	
	public static void main(String[] args) {
		CalendarMain c = new CalendarMain();
		c.calc();
		c.display();
	}
}



/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
        
클래스명 : CalendarEx
필드 : 
메소드 - 기본 생성자 : 월, 일을 입력
       calc()    : 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                   매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
       display() : 출력

클래스명 : CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
 */