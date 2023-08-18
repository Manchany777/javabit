/*package inheritance;

import java.util.Scanner;


class Shape {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
			
	public Shape(){
		System.out.println("Shape 기본 생성자");
	}
	
	public void calcArea(){
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea(){
		System.out.println("도형을 출력합니다");
	}
}
//---------------------
class Sam extends Shape {
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam 기본생성자");
		System.out.print("밑면 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override  // 이 메서드가 오버라이드 했음을 표시
	public void calcArea(){  // 오버라이딩 1
		area = base * height / 2.;
	}
	@Override  // 이 메서드가 오버라이드 했음을 표시
	public void dispArea(){  // 오버라이딩 2
		System.out.println("삼각형 넓이 = " + area);
	}
}
//---------------------
class Sa extends Shape {
	protected double width, height;
	
	public Sa() {
		System.out.println("Sa 기본생성자");
		System.out.print("밑면 : ");
		width = scan.nextDouble();
		System.out.print("높이 : ");
		height = scan.nextDouble();
	}
	
	@Override
	public void calcArea(){
		area = width * height;
	}
	@Override
	public void dispArea(){
		System.out.println("사각형 넓이 = " + this.area);
	}
}
//---------------------
class Sadari extends Shape {
	protected double top, bottom, height;
	
	public Sadari() {
		System.out.println("Sadari 기본생성자");
		System.out.print("윗변 : ");
		top = scan.nextDouble();
		System.out.print("밑변 : ");
		bottom = scan.nextDouble();
		System.out.print("높이 : ");
		height = scan.nextDouble();
	}
	
	@Override
	public void calcArea(){
		area = (top + bottom)*height / 2;
	}
	@Override
	public void dispArea(){
		System.out.println("사다리꼴의 넓이 = " + this.area);
	}
}
//---------------------
public class ShapeMain2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Sam sam = new Sam();
		Sa sa = new Sa();
		Sadari sadari = new Sadari();
		
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 삼각형 넓이 구하기");
			System.out.println(" 2. 사각형 넓이 구하기");
			System.out.println(" 3. 사다리꼴의 넓이 구하기");
			System.out.println(" 4. 끝");
			System.out.println("************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			
			if(num == 1) {
				sam.calcArea();
				sam.dispArea();
				System.out.println();
			} else if(num == 2) {
				sa.calcArea();
				sa.dispArea();
				System.out.println();
			} else if(num == 3) {
				sadari.calcArea();
				sadari.dispArea();
				System.out.println();
			} else if(num == 4) {
				break;
			}
		}
	}
}*/
