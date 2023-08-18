package class_;

public class SungJukmain2 {
	public static void main(String[] args) {
		SungJuk aa = new SungJuk(); // 객체
		SungJuk bb = new SungJuk(); // 객체
		SungJuk cc = new SungJuk(); // 객체
		
		SungJuk[] ar = new SungJuk[3]; // 객체배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		Object[] br = new Object[3]; // 다형성(클래스 타입을 객체의 최상위 클래스로 사용해서 어떤 타입이든 사용 가능하게 함)
		
		ar[0].setData("홍길동", 96, 85, 78);
		ar[1].setData("코난", 100, 78, 55);
		ar[2].setData("라이언", 80, 76, 85);
		System.out.println();
		
		System.out.println("이름     국어      영어     수학      총점      평균    학점");
		for(int i=0 ; i < ar.length; i++) {
			 //System.out.println("객체 ar = " + ar[i]);  // class_.SungJuk@7a79be86
			 ar[i].calcTot();
			 ar[i].calcAvg();
			 ar[i].calcGrade();
		     
		     System.out.println(ar[i].getName()+"\t"
		    		 +ar[i].getKor()+"\t"
		    		 +ar[i].getEng()+"\t"
		    		 +ar[i].getMath()+"\t"
		    		 +ar[i].getTot()+"\t"
		    		 +String.format("%.2f",ar[i].getAvg()) +"\t"
		    		 +ar[i].getGrade());
		     System.out.println();
		} // for
		System.out.println("--------------------------------------");
		
		for(SungJuk data : ar) {  // 확장형 for문 - ar의 (배열)크기만큼 for를 반복한다
			data.calcTot();
			data.calcAvg();
			data.calcGrade();
		     
		    System.out.println(data.getName()+"\t"
		    		 +data.getKor()+"\t"
		    		 +data.getEng()+"\t"
		    		 +data.getMath()+"\t"
		    		 +data.getTot()+"\t"
		    		 +String.format("%.2f",data.getAvg()) +"\t"
		    		 +data.getGrade());
		}
	}
}

/* <조건>
	 [실행결과]
	X	Y	합	차	곱	몫
	320	256
	258	127
	572	326
	
	클래스 : Compute
	필드 : x, y, sum, sub, mul, div
	
	setX()
	setY()
	calc() - 합, 차, 곱, 몫 계산
	getX()
	getY()
	getSum()
	getSub()
	getMul()
	getDiv()
	
	클래스 : ComputeMain
 */
