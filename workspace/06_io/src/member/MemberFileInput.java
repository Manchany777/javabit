package member;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput implements Member { // 읽는거

	@Override
	public void execute(List<MemberDTO> list) throws FileNotFoundException, ClassNotFoundException, IOException {
		list.clear(); // Arraylist 초기화 -  파일안에 있는 것만 가져오기 위해서 list안에 있는 걸 싹 지워버리고 초기화시킴 (그래야 기존에 있는 것과 섞이지 않음)
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("member.txt"));
			
			while(true) {
				try {
					MemberDTO memberDTO = (MemberDTO)ois.readObject(); // 자식 = (자식) 부모 // 최상위 객체인 Object를 MemberDTO로 강제 형변환
					list.add(memberDTO);
					System.out.print("이름 = " + memberDTO.getName());
					System.out.print("나이 = " + memberDTO.getAge());
					System.out.print("전화 = " + memberDTO.getPhone());
					System.out.print("주소 = " + memberDTO.getAddress());
				} catch(EOFException e) { // End Of File의 약자
				    // 파일의 끝에 도달하면 EOFException 발생
				    // 더 이상 읽을 객체가 없으므로 반복문을 종료하고, 여기(catch 블록)으로 넘어옴
				    System.out.println("파일의 끝에 도달하여 읽기 종료");
					break;
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				System.out.println("finally로 빠짐");
			}
			ois.close();
		} catch (IOException e) {
			System.out.println("Exception로 빠짐");
			e.printStackTrace();
		}	
		System.out.println("데이터가 위와같이 출력되었습니다.");
	}
}