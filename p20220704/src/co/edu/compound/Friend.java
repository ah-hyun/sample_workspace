package co.edu.compound;
/*
 * 이름, 연락처, 이메일, 생일, 키, 몸무게
 */
public class Friend {

	// 필드. 규칙(소문자-두번째부터 대문자, camelCase, 영문이먼저)
	
	private String name;
	private String tel;
	private String email;
	private String birth;
	private double height; 
	private double weight;
	
	// 생성자: 기본생성자를 생성.
	public Friend() {
		
	}
	
	
	// 메소드.
	public void showInfo() {
		System.out.printf("이름: " + name + ", 연락처: " + tel);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setHeight(double height) {
		if (height > 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			this.height = 165.3;
		} else {
			this.height = height;
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			this.weight = 50.2;
		} else {
			this.weight = weight;
		}
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}


	public String getEmail() {
		return email;
	}


	public String getBirth() {
		return birth;
	}
	
	// 이름, 연락처를 보여주는 showInfo()

}


