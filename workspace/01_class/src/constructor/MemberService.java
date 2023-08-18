package constructor;

import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	MemberDTO[] ar = new MemberDTO[3];
	
	public MemberService() {
		System.out.println("나는 기본 생성자입니다");
	}
	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 가입");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 수정");
			System.out.println(" 4. 삭제");
			System.out.println(" 5. 끝");
			System.out.println("************");
			System.out.println(" 번호 : ");
			num = scan.nextInt();

			/*if(num == 5) break;
			if(num == 1) insert();
			else if(num ==2) display();*/
			
			if(num == 1) {
				insert();
			} else if(num == 2) {
				display();
			} else if(num == 3) {
				update();
			} else if(num == 4) {
				delete();
			} else if(num == 5) 
				break; // while을 벗어나라	
		}
	}
	
	public void insert() {
		int i;
		for(i=0; i < ar.length; i++) {
			if(ar[i] == null) {
				
			System.out.println("이름 입력 : ");
			String name = scan.next();
			System.out.println("나이 입력 : ");
			int age = scan.nextInt();
			System.out.println("핸드폰 입력 : ");
			int phone =  scan.nextInt();
			System.out.println("주소 입력 : ");
			String address = scan.next();
		
			ar[i] = new MemberDTO(name, age, phone, address);
			System.out.println("가입 완료");
				
			break; // for문을 벗어나라
			} // if
		}  // for
		if(i  == ar.length) System.out.println("회원 마감");
	}
	
	public void display() {
		for(int i=0; i < ar.length; i++) {
			if(ar[i] != null) 
			System.out.println("이름 : " + ar[i].getName() + 
					" 나이 : " + ar[i].getAge() + 
					" 폰번 : " + ar[i].getPhone() + 
					" 주소 : " + ar[i].getAddress()
			);
		}
	}
	
	public void update() {
		System.out.println("핸드포 번호 입력 : ");
		int phoneNum = scan.nextInt();
		boolean findNum = false;
			
		for (int i = 0; i < ar.length; i++) {
		   if (ar[i] != null && ar[i].getPhone() == phoneNum) {
			   System.out.println("찾은 회원 정보:");
			   System.out.println("이름: " + ar[i].getName() +
			            " 나이: " + ar[i].getAge() +
			            " 폰번: " + ar[i].getPhone() +
			            " 주소: " + ar[i].getAddress());
			
			   System.out.println("수정 할 이름 입력: ");
			   String name = scan.next();
			   System.out.println("수정 할 나이 입력: ");
			   int age = scan.nextInt();
			   System.out.println("수정 할 폰번 입력: ");
			   int phone = scan.nextInt();
			   System.out.println("수정 할 주소 입력: ");
			   String address = scan.next();
			
			   ar[i] = new MemberDTO(name, age, phone, address);
			   System.out.println("회원 정보 수정 완료");
			
			   findNum = true;
			   break;
		}
	   }
	
	   if (!findNum) {
	       System.out.println("회원 정보를 찾을 수 없습니다. 다시 입력해주세요.");
	       update();
	   }
	}
		
	public void delete() {
		System.out.println("삭제할 회원의 폰번 입력: ");
		int phoneNum = scan.nextInt();
		boolean findNum = false;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone() == phoneNum) {
				System.out.println("찾은 회원 정보:");
				System.out.println("이름: " + ar[i].getName() +
				        " 나이: " + ar[i].getAge() +
				        " 폰번: " + ar[i].getPhone() +
				        " 주소: " + ar[i].getAddress());
				
				System.out.println("정말로 삭제하시겠습니까? (Y/N)");
				String deleteConfirm = scan.next();
				
				if (deleteConfirm.equalsIgnoreCase("Y")) {
				    ar[i] = null;
				    System.out.println("회원 정보 삭제 완료");
				} else {
				    System.out.println("삭제 취소");
				}
				
				findNum = true;
				break;
			}
		}
		
		if (!findNum) {
		    System.out.println("회원 정보를 찾을 수 없습니다. 다시 입력해주세요.");
		    delete(); // Call the delete() method recursively to prompt for a valid phone number again
		}
	}
}

/*
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   5. 끝내기
*************
  번호 :
*/

/*
수정 : update()
핸드폰 번호 입력 : 010-1111-1111
회원 정보를 찾을 수 없습니다.
또는
핸드폰 번호 입력 : 010-1234-5678

이름   나이   핸드폰   			주소
홍길동  25   010-1234-5678		서울

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 :

회원 정보 수정 완료

삭제 : delete()
핸드폰 번호 입력 : 010-1111-1111
회원 정보를 찾을 수 없습니다.
또는
핸드폰 번호 입력 : 010-1234-5678

회원 정보 삭제 완료
*/