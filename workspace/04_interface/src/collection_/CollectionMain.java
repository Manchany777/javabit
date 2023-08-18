package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	// 모든 인터페이스는 추상 메소드를 구현해야 한다.
	// 콜렉션도 인터페이스의 한 종류이다.
	// 자바 api를 들어가보면 콜렉션에 있는 추상 메소드가 15개나 된다.
	// 그렇다면 collection을 쓸 때마다 이걸 다 직접 구현해야 할까? ㄴㄴ 대신 구현해주는 클래스가 있다. 여러 종류가 있지만 그 중 하나가 ArrayList이다.
	public CollectionMain() {
		Collection coll = new ArrayList(); // 의미 : Collection가 가지고 있는 모든 추상 메서드를 ArrayList가 implements(즉, 오버라이드) 했다.
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복허용, 순서
		coll.add(15);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		// ArrayList<String> cats = new ArrayList<String>();와는 달리 get을 쓸 수 없다. 
		// 왜냐하면 add메소드는 ArrayList가 자체적으로 오버라이딩 했지만 get메서드는 그렇지 않기 때문이다. (어디까지나 여기서의 coll 객체는 Collection을 가리키는 거지 ArrayList를 가리키는 게 아니다.)
		// 그러면 저장한 배열요소를 꺼내려면 어떻게 해야할까? 이럴때 유용하게 쓰는게 Iterator이다.
		// Iterator it = new Iterator(); // 참고) Iterator 또한 인터페이스이다, so 절대로 new 생성 불가능
		Iterator it = coll.iterator(); // 안의 메소드를 이용하여 인터페이스 생성
		
		it.hasNext(); // 마지막에 항목이 있는지 검사하는 메소드 - 만약에 항목이 있으면 T, 없으면 F
		it.next(); // 현재 위치에서 항목을 꺼내 저장하고 다음 항목으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} // while
	}

	public static void main(String[] args) {
		new CollectionMain();

	}

}
