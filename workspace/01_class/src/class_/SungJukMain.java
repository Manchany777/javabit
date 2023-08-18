package class_;

public class SungJukMain {

	public static void main(String[] args) {
		 SungJuk aa = new SungJuk();
		 System.out.println("객체 aa = " + aa);  // class_.SungJuk@7e774085
	     aa.setData("홍길동", 96, 85, 78);
	     aa.calcTot();
	     aa.calcAvg();
	     aa.calcGrade();
	     
	     System.out.println("이름     국어      영어     수학      총점      평균    학점");
	     System.out.println(aa.getName()+"\t"
	    		 +aa.getKor()+"\t"
	    		 +aa.getEng()+"\t"
	    		 +aa.getMath()+"\t"
	    		 +aa.getTot()+"\t"
	    		 +String.format("%.2f",aa.getAvg())+"\t"
	    		 +aa.getGrade());
	     System.out.println();
	     
	     SungJuk bb = new SungJuk();
	     System.out.println("객체 bb = " + bb);  // class_.SungJuk@7a79be86
	     bb.setData("코난", 100, 78, 55);
	     bb.calcTot();
	     bb.calcAvg();
	     bb.calcGrade();
	     
	     System.out.println("이름     국어      영어     수학      총점      평균    학점");
	     System.out.println(bb.getName()+"\t"
	    		 +bb.getKor()+"\t"
	    		 +bb.getEng()+"\t"
	    		 +bb.getMath()+"\t"
	    		 +bb.getTot()+"\t"
	    		 +String.format("%.2f",bb.getAvg())+"\t"
	    		 +bb.getGrade());
	     System.out.println();
	     
	     SungJuk cc = new SungJuk();
	     System.out.println("객체 cc = " + cc);  // class_.SungJuk@34ce8af7
	     cc.setData("라이언", 80, 76, 85);
	     cc.calcTot();
	     cc.calcAvg();
	     cc.calcGrade();
	     
	     System.out.println("이름     국어      영어     수학      총점      평균    학점");
	     System.out.println(cc.getName()+"\t"
	    		 +cc.getKor()+"\t"
	    		 +cc.getEng()+"\t"
	    		 +cc.getMath()+"\t"
	    		 +cc.getTot()+"\t"
	    		 +String.format("%.2f",cc.getAvg())+"\t"
	    		 +cc.getGrade());
	     System.out.println();
	}
}


/*
<숙제>
클래스 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
      calcTot()
      calcAvg()
      calcGrade()
       getName()
       getKor()
       getEng()
       getMath()
       getTot()
       getAvg()
       getGrade()

클래스 : SungJukMain

[실행결과]

이름	 국어	 영어	 수학	 총점	 평균	 학점
홍길동	 96	 85	 78
코난  100 78 55
라이언 80  76 85

총점 = 국어 +  영어 + 수학
평균 = 총점 / 과목수
학점 평균이 90 이상이면 A
  평균이 80 이상이면 B
  평균이 70 이상이면 C
  평균이 60 이상이면 D
  그 외는 F

평균은 소수이하 2째자리
*/