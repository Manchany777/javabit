package collection_;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetMain {
	
	public SetMain() {
		Set<String> set = new HashSet<String>(); // Set도 Colleciont처럼 인터페이스라 new사용 불가, 이럴때는 Hashset 클래스를 쓴다. 제네릭까지 쓰면 에러가 사라짐
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); // Setter는 Collection과 달리 중복허용x, 순서도 x (지멋대로 들어감)
		set.add("기린");
		set.add("코끼리");
		
		Iterator<String> it = set.iterator();  // 메서드를 이용하여 생성
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} // while
	}

	public static void main(String[] args) {
		new SetMain();

	}
}
