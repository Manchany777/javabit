package constructor;

class Fruit {
	private String pum;
	private int jan;
	private int feb;
	private int mar;
	private int tot;
	private static int sumJan;
	private static int sumFeb;
	private static int sumMar;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}

	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	
	public void display() {
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
	}
	
    public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
    }
}
//-------------------
public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = new Fruit[3];
		ar[0] = new Fruit("사과", 100, 80, 75);
		ar[1] = new Fruit("포도", 30, 25, 10);
		ar[2] = new Fruit("딸기", 25, 30, 90);
		
		int i;
		for(i = 0; i < ar.length; i++) {
			ar[i].calcTot();
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("---------------------------------------");
		for(i = 0; i < ar.length; i++) {
			ar[i].display();
		}
		System.out.println("---------------------------------------");
		Fruit.output();
	}
}


/*
[문제] 과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드   : pum, jan, feb, mar, tot
        sumJan, sumFeb, sumMar

메소드 : 생성자(품명, 1월, 2월, 3월)
        calcTot()
        display() - 품명, 1월, 2월, 3월, 합계 출력
        public static void output() - 1월 합계, 2월 합계, 3월 합계 출려겨

클래스 : FruitMain

[실행결과] -> 생성자로 입력
---------------------------------
PUM		JAN   FEB   MAR		TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     65
딸기     25    30    90     145
---------------------------------
       155    135   175				output()로 처리
 */