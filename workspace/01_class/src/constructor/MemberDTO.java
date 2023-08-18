package constructor;

public class MemberDTO { // Data Transfer Object // 얘가 딱 1인분만 해주는 메소드 (실질적인 로직은 MemberService에서 함)
	private String name;
	private int age;
	private int phone;
	private String address;

	public MemberDTO(String name, int age, int phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}


	public String getName() { 
		return name; 
	}
	
	public int getAge() { 
		return age; 
	}
	
	public int getPhone() { 
		return phone; 
	}
	
	public String getAddress() { 
		return address; 
	}
}
//  MemberVO(value Object) 라고도 함