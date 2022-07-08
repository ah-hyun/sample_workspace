package co.edu.inherit;

public class Friend {

	// 필드
	private String name;
	private String phone;
	
	
	
	
	// 생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	//get, set


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "Friend [이름: " + name + ", 연락처: " + phone + "]";
	}
	
	public void showInfo() {
		// 친구이름, 연락처 출력.
		System.out.printf("이름: %s, 연락처: %s", name, phone);
	}
	
}
