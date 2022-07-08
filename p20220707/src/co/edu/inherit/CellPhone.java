package co.edu.inherit;
/*
	상속 (부모 <- 자식)
	CellPhone <- DmbCellPhone
*/
public class CellPhone extends Object {
	// 필드
	private String model;
	private String color;
	
	// 생성자
	public CellPhone() {} // 기본 생성자
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("bell");
	}
	void sendVoice() {
		System.out.println("메세지 전송");
	}
	void receiveVoice() {
		System.out.println("메세지 수신");
	}
	// get, set
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override //최상위 클래스
	public String toString() {
		return "model명은 " + model + ", 색상은 " + color + " 입니다.";
	}
	
	
}

