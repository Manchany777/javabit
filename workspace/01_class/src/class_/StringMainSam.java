package class_;

import java.util.Scanner;

public class StringMainSam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String original = scan.nextLine();

        System.out.print("현재 문자열 입력: ");
        String current = scan.nextLine();

        System.out.print("바꿀 문자열 입력: ");
        String change = scan.next();
        
        if(original.length() < current.length()) {
        	System.out.println("입력한 문자열의 크기가 작습니다.");
        	System.out.println("치환할 수 없습니다.");
        	//System.exit(0); // 프로그램 강제 종료
        	return;         // 메소드를 벗어나라 (void타입일 경우에는 강제종료 효과가 있다.)
        } else {
        	original = original.toLowerCase(); // 소문자로 변경
        	current = current.toLowerCase();
        	
        	int index = 0;
        	int count = 0;
        	
        	while( (index = original.indexOf(current, index)) != -1) {
        		index = index + 2;
        		count++;
        	}//while
        	
        	System.out.println(original.replace(current, change));
        	System.out.println(count + "빈 치환");
        } 
    }
}
