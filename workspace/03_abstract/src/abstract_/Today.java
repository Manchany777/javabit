package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH:mm:ss E요일"); //  2023년 07월 21일
		System.out.println("오늘 날짜 : " + sdf.format(date));
		
		// 내 생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");  // 휴대폰 01028050057으로 입력받게 해야 나중에 쪼개기가 편한 것처럼
		Date birth = input.parse("19960706"); // 예외처리 에러 발생
		System.out.println("내 생일 : " + birth); // 자바가 제공하는 일반형식
		System.out.println("내 생일 : " + sdf.format(birth)); // 내가 직접 만든 형식
		System.out.println();
		
		// 기준은 시스템 날짜를 기준으로 생성이 된다.
		// 반드시 new 로만 객체를 생성한다는 건 고정관념이다.
		//Calendar cal = new Calendar();  		//추상 클래스라 new 불가능 - error
		//Calendar cal = new GregorianCalendar(); // Sub class(자식 클래스) 생성
		Calendar cal = Calendar.getInstance(); // ★ 메소드를 이용하여 클래스 생성 -> 좀 더 알아보기
												// 	PreparedStatememnt pstmt = con.preparedStatement(); 처럼
		
		int year = cal.get(Calendar.YEAR); 	  	   // int year = cal.get(1); -> 이렇게 하는 것보다 훨씬 코드 가독성이 좋다. (뭘 하는지 바로 알 수 있다.) 상수가 바로 이런 역할
		int month = cal.get(Calendar.MONTH); 	   // month = cal.get(2); // 1월-0, 2월-1
		int day = cal.get(Calendar.DAY_OF_MONTH);  //   day = cal.get(3);
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일-1, 월-2, 화-3
		String dayOfWeek = null;
		switch(week) {
			case 1 : dayOfWeek = "일"; break;
			case 2 : dayOfWeek = "월"; break;
			case 3 : dayOfWeek = "화"; break;
			case 4 : dayOfWeek = "수"; break;
			case 5 : dayOfWeek = "목"; break;
			case 6 : dayOfWeek = "금"; break;
			case 7 : dayOfWeek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfWeek + "요일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
	}
}

// 예외처리(Exception)
// 1. 컴파일
// - 자동차 보험
// - throws
// try ~ catch
// 2. 실행
