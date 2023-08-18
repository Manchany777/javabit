package class_;

class Person {
	private String name; // 필드, 초기화(null)
	private int age;  // 필드, 초기화(0)
	
	public void setName(String n) {  // 구현
		this.name = n;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setData(String a, int b) {
		this.name = a;
		this.age = b;
	}
	public void setData(){
		
	}
	
	public String getName(){
		return  name;
	}
	public int getAge(){
		return age;
	}
}
//------------------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa = new Person();
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("겍체 aa = " + aa);
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();

		Person bb = new Person();
		bb.setName("라이언");
		bb.setAge(30);
		System.out.println("겍체 bb = " + bb);
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();

		Person cc = new Person();
		cc.setData("코난", 35);
		System.out.println("겍체 cc = " + cc);
		System.out.println(cc.getName() + "\t" + cc.getAge());
		System.out.println();

		Person dd = new Person();  // 집어넣은 값이 없어서 String과 int의 초기값이 출력됨
		dd.setData();
		System.out.println("겍체 dd = " + dd);
		System.out.println(dd.getName() + "\t" + dd.getAge());
		System.out.println();
	}
}
