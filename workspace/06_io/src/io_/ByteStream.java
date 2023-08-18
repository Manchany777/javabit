package io_;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));  // new File : 문자열을 하나의 파일객체로 생성해라 (이건 써도되고 안써도 된다.)
		
		System.out.println(bis.read());  // 65(A) - 정수형 한 글자를 아스키코드로 출력
		System.out.println(bis.read());  // 66(B)
		System.out.println(bis.read());  // 67(C)
		
		int data;
		while ( (data=bis.read()) != -1) { // 정수형은 해당하는 값이 없을때 -1을 출력하는 걸 이용한 for문
			//System.out.print(data);        // 결과값 중 1310은 엔터 (49는 1, 50은 2, 43은 +, 45는 -)
			System.out.print((char)data);  
		}//while

		bis.close();
	}
}
