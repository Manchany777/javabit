package constructor;

public class MemberDTOSam { // Data Transfer Object // 얘가 딱 1인분만 해주는 메소드 (실질적인 로직은 MemberService에서 함)
	//---------field
	private String name;
	private int age;
	private String phone;
	private String address;
	
	//---------constructor
	public MemberDTOSam(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	//---------getter
	public String getName() { 
		return name; 
	}
	
	public int getAge() { 
		return age; 
	}
	
	public String getPhone() { 
		return phone; 
	}
	
	public String getAddress() { 
		return address; 
	}
	
	//---------setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//---------toString overriding
	@Override
	public String toString() {
		return name + "\t" + phone + "\t" + address;
	}

}
//  MemberVO(value Object) 라고도 함