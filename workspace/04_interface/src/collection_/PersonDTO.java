package collection_;

//1인분
public class PersonDTO implements Comparable<PersonDTO> {   // 클래스 대 클래스, 객체 대 객체끼리 비교시켜주는 인터페이스
														    // 나는 PersonDTO을 기준점으로 해서 PersonDTO끼리 비교 할겁니다 하고 제네릭 설정을 해줘야 함
													    	// 이때 Comparable의 메서드를 오버라이딩 해줘야 한다. (Comparable는 딱 하나(compareTo) 있다.)
	private String name;
	private int age;
	
	public PersonDTO() {
		
	}

	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}

	@Override
	public int compareTo(PersonDTO p) {
		// 나이로 오름차순
//		if (this.age < p.age) return -1;
//		else if(this.age < p.age) return 1;
//		else return 0;
		
		// 나이로 내림차순
		if (this.age < p.age) return 1;
		else if(this.age < p.age) return -1;
		else return 0;
	}
}
