package io_;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");  
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		// BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt"))); 과 똑같은 방식임
		
		int size = (int)file.length();  // 파일의 length는 long타입이니까 size를 int형으로 주면 에러발생함 so, file.length()를 int로 강제 형변환 시켜야함
		
		byte[] b = new byte[size];
		bis.read(b, 0, size);  // 나는 b라는 배열을 0번째방부터 size개수만큼 다 읽어들인다. like for문
		
		System.out.println(new String(b));  // 배열안에 있는 int형을 String으로 형변환해서 출력
		
		// 배열.length
		// 문자열.length()
		// byte[size]
	}
}
