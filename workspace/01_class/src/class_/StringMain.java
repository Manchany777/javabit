package class_;

public class StringMain {
	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
		// 전부 대문자. 즉 상수이다. (값을 우리가 변경할 수 없다.)
		
		String a = "apple"; // literal 생성
		String b = "apple"; // a와 b 둘 다 똑같은 주소 참조 (리터럴은 메모리(heap영역)에 한 번밖에 안잡힘)
		if(a == b)System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b))System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");  // 인스턴스 생성
		String d = new String("apple");  // new는 새 주소값 계속 생성
		
		if(c == d)System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		// 무한정 new가 늘어나지 않게 하는 방식을 싱글톤이라 한다. -> 주로 DB에서 쓰는 방식
		if(c.equals(d))System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는" + 2023 + 7 + 19;  // 출력시 문자열이 앞에 있으면 뒤의 숫자도 문자열로 인식한다.
		System.out.println(e);
		System.out.println();
		
		/* 
		 "오늘 날짜는 "
		 "오늘 날짜는 2023"
		 "오늘 날짜는 20237"
		 e ---> "오늘 날짜는 2023719"
		 
		 문자열은 편집이 안 된다. -> so, 위의 과정에서 각각을 메모리에 할당하기 때문에 메모리에 4번의 생성이 일어난다.
		 이 과정에서 필요없어진 메모리는 JVM에 의해서 삭제 시 알아서 Garbage Collector로 보낸다.
		 Garbage Collector가 실행되면 컴퓨터는 멈춘다. (하지만 요즘 컴퓨터는 성능이 워낙 좋아서 티가 안남)
		 */
		
		/* 길이 구할때 차이점
		 배열.length
		 문자열.length()
		 */
		System.out.println("문자열 크기 = " + e.length());  // 공백도 크기로 취급한다.
		
		for(int i=0; i<e.length(); i++) {
			System.out.print(e.charAt(i) + "^");
		}
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11)); // 10번째 문자까지 출력
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("대문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); // -1 (배열 인덱스에 없으면 -1 리턴)
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
	}
}
