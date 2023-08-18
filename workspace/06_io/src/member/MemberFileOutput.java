package member;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class MemberFileOutput implements Member { // 쓰는 것
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute(List<MemberDTO> list) throws IOException, FileNotFoundException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));

		for(MemberDTO memberDTO : list) {
			oos.writeObject(memberDTO);
		}
		oos.close();
		System.out.println("데이터가 입력되었습니다.");
	}
}
