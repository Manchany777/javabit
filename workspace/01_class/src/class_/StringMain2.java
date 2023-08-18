package class_;

import java.util.Scanner;
// 개조버전
public class StringMain2 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String originalStr = scan.nextLine();

        System.out.print("현재 문자열 입력: ");
        String nowStr = scan.nextLine();

        System.out.print("바꿀 문자열 입력: ");
        String replaceStr = scan.nextLine();

        String resultStr = changeString(originalStr, nowStr, replaceStr);

        System.out.println("치환 결과: " + resultStr);
    }

    public static String changeString(String originalStr, String nowStr, String replaceStr) {
        String lowerOriginalStr = originalStr.toLowerCase();
        String lowerNowStr = nowStr.toLowerCase();

        int index = lowerOriginalStr.indexOf(lowerNowStr);
        while (index != -1) {
            originalStr = originalStr.substring(0, index) + replaceStr
                    + originalStr.substring(index + nowStr.length());
            lowerOriginalStr = originalStr.toLowerCase();
            index = lowerOriginalStr.indexOf(lowerNowStr, index + replaceStr.length());  // -1 만날때까지 찾게 만듦
            System.out.println(index);
        }

        return originalStr;
    }
}


/*
[문제] 치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba (original)
현재 문자열 입력 : aa (current)
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/