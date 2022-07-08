package co.edu.inherit;

public class MainExample {

	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("AnyCall");
		phone.setColor("White");
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		
		phone.turnOn();
		phone.trunOff();
		
		phone.powerOff();
		
		//SmartPhone 기능.
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		System.out.println("자동형변환>>>>>>>>>>>");
		// 부모 > 자식
		CellPhone dphone = new DmbCellPhone("Iphone", "Red", 100);
		System.out.println(dphone.toString());
		
		CellPhone d2phone = new SmartPhone();
		CellPhone cphone = new CellPhone();
		cphone.setModel("LG Phone");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());
		
		if (cphone instanceof DmbCellPhone) {
		DmbCellPhone dcp = (DmbCellPhone) cphone;
		
		dphone.powerOn();
//		dphone.turnOn(); // 자식의 기능은 사용 불가.
		dcp.powerOn();
		dcp.turnOn();
	
	}

}
}