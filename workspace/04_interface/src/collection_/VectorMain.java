package collection_;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	// 메모리 많이 잡아먹음 - 비추천
	public VectorMain() {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size());       //   항목 개수, 기본 개수 0
		System.out.println("벡터 용량 = " + v.capacity());   //  (담을 수 있는)용량 - Vector는 Map과 달리 담을 수 있는 공간을 정해놓음, 기본 용량 0
		
		for(int i=0; i<10 ; i++) {
			v.add(i+"");  // String 제네릭 타입에 int형인 i를 집어넣는 방법
		}
		
		for(int i=0; i<10 ; i++) {
			System.out.print(v.get(i)+ " ");
		} // for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity()); 
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.add("5");  // 중복 허용
		
		for(int i=0; i<v.size() ; i++) {
			System.out.print(v.get(i)+ " ");
		} // for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size());      // 단순히 몇 개인지 알려줌
		System.out.println("벡터 용량 = " + v.capacity());  // 용량초과시 기존의 항목개수만큼(10+10 = 20) 더 추가함
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		//v.remove("5");  // 앞에 있는 문자열 5를 제거
		v.remove(v.size()-1);
		Iterator<String> it = v.iterator();  // 이터레이터 방식으로 출력
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new VectorMain();
	}
}
