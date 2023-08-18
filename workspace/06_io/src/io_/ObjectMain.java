package io_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException { // ClassNotFoundException은 IOException과 상속관계가 아니기에 어쩔 수 없이 둘 다 적어줘야 하낟.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		
		PersonDTO dto = new PersonDTO("홍길동",  25, 185.3);
		oos.writeObject(dto); // dto라는 데이터 객체를 통해 여러 데이터타입을 통합해서 한 번에 전송(아까처럼 데이터타입에 따라 하나씩 나눠서 보내지 않아도 된다.
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto2 = (PersonDTO)ois.readObject();  // ClassNotFoundException throws 필요
												 		// 자식 = (자식)부모 즉, 객체로 캐스팅이 필요
		System.out.println("이름 = " + dto2.getName());
		System.out.println("나이 = " + dto2.getAge());
		System.out.println("키 = " + dto2.getHeight());
		ois.close();
	}
}
