package abstract_;

import java.util.Scanner;


abstract class Shape {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
			
	public Shape(){
		System.out.println("Shape 기본 생성자");
	}
	
	public abstract void calcArea(); // 오버라이딩되는 메서드는 추상화로 잡아줘서 메모리를 아끼게 바꿈
	public abstract void dispArea();
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
public class ShapeMain {
	
	public static void main(String[] args) {
	/*	Sam sam = new Sam(); // 1:1관계, 결합도 100%
		sam.calcArea();
		sam.dispArea();
		System.out.println();

		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		System.out.println();

		Sadari sadari = new Sadari();
		sadari.calcArea();
		sadari.dispArea();
	*/ 
		
		// 위처럼 각자 객체를 만들어서 오버라이딩 하면 부모 클래스의 메소드가 할일없이 메모리 낭비만 하게 된다.
		// 이를 방지하기 위해 부모를 생성하면서 그 리모콘에 자식을 각각 끼워넣는 다형성을 사용하게 된다. -> 오버라이딩 된 부모 메소드를 최대한 활용하기 위함
		
		// 다형성
		Shape shape;
		shape = new Sam(); // 부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa(); // 부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sadari(); // 부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}
}