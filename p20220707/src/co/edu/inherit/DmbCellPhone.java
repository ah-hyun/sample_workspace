package co.edu.inherit;
/*
	상속 : 자식이 부모를 선택 (extends)
*/
public class DmbCellPhone extends CellPhone //CellPhone 이라는 부모를 선택하겠습니다.
{	private int channel;

	public DmbCellPhone() {
		super(); // 부모 생성자가 없으면 사용 불가.
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); //this.model, this.color
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmb화면 on");
	}
	void trunOff() {
		System.out.println("dmb화면 off");
	}
	//overriding : 재정의
	
	@Override //부모한테 있는 기능을 재정의
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 " + getColor() + ", 채널은 " + channel + " 입니다.";
	}
	
	
	
}
