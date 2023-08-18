package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {
	public CollectionMain2() {
		//ArrayList<String> list = new ArrayList(); // 의미 : Collection가 가지고 있는 모든 추상 메서드를 ArrayList가 implements(즉, 오버라이드) 했다.
		// CollectionMain에서 노란불이 뜨는 이유???
		ArrayList<String> list = new ArrayList(); 	// 안에는 String만 쓴다고 규정을 해주면 노란불이 사라지지만 대신 int형 자료인 아래 2개줄을 사용 불가함
		// 즉, 하나의 데이터 타입만 규정하고 쓰라는 의미
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); // 중복허용, 순서
		//list.add(15);
		//list.add(43.8);
		list.add("기린");
		list.add("코끼리");

		for(int i=0; i < list.size(); i++){ // 배열은 length, 리스트는 size
			System.out.println(list.get(i));
		}//for
		
		// 위와같은 방식이 맘에 안들면 아래와 같은 방식으로 해도 좋다.
		/*for(String str : list) {
			System.out.println(str);
		}//for */
	}

	public static void main(String[] args) {
		new CollectionMain2();

	}
}
