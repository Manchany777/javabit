package collection_;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	
	public MapMain() {
		// Map인터페이스의 모든 추상 메소드를 오버라이딩 하는 대신에 대신 implements를 구현해준 implements 클래스인 HashMap을 찾아서 생성함
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("book101", "백설공주"); // 변수명(코드명), 값(책이름)
		map.put("book201", "인어공주"); 
		map.put("book102", "백설공주"); // Values 중복 허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주"); // Key 중복 허용 - book101의 키값이 바뀜(이전의 값은 사라짐)
		System.out.println(map.get("book101")); // 엄지공주
		System.out.println(map.get("book102")); // 백설공주
		System.out.println(map.get("book501")); // null (없는 키의 값은 null로 잡힘)
	}
	
	public static void main(String[] args) {
		new MapMain();
	}
}
