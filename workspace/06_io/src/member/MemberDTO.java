package member;

import java.io.Serializable;

public class MemberDTO implements Serializable, Comparable<MemberDTO> {
	// 필드
	private String name;
	private int age;
	private String phone;
	private String address;
	
	// 생성자
	public MemberDTO(String name, int age, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	// setter
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
	
	// getter
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name + "\t" 
				+ age + "\t" 
				+ phone + "\t" 
				+ address;
	}

	@Override
	public int compareTo(MemberDTO o) {
		return 0;
	}}
