package io_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws IOException {  
		// 원래대로면 FileNotFoundException과 IOException 둘다 throws 해야하나 (throws FileNotFoundException, IOException -> 이런식으로)
		// 상위 예외객체인 IOException 하나만으로 예외처리를 해줘도 됨
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt")); // FileNotFoundException 예외처리 필요 (자바단에서 만약의 사태를 대비해서 그렇게 하도록 강제함)
																						 // 해당 파일이 없으면 생성해줌 (읽어오는건 파일이 없으면 에러뜸)
		dos.writeUTF("홍길동");  // 여기서도 IOException 예외처리를 해야한다. (만약의 사태를 대비해서 그렇게 하도록 자바단에서 강제함)
		dos.writeInt(25);
		dos.writeDouble(185.3);
		dos.close();
		// ※ 해결방식 2가지
		// Add throws declaration       // 자바 가상머신에게 던진다 (이 예제에선 첫번째걸로 했음)
		// Surround with try/catch      // 내가 만든try-catch 구문으로 던진다
		
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);
		dis.close();
	}
}
