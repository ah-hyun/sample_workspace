package co.edu;

public class Example02 {

	public static void main(String[] args) {
		
		int myHeight = 161;
		int yourHeight = 163;
		
		int theDifference = yourHeight - myHeight;
		
		myHeight = 167;
		
		if (myHeight > yourHeight) {
			System.out.println("나의 키가 " + theDifference + " cm만큼 더 큽니다.");
		}else {
			System.out.println("나의 키가 더 작습니다.");
		}
	}

}
