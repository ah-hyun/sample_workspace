package co.edu;

public class HelloWorld {
	public static void main(String [] args) {
		// 변수의 종류 : int(정수), double(실수), boolean(논리), String(문자열)
		String name = "김아현";
		
		int myAge = 20; // 선언하면서 값을 할당 => 초기화.
		int yourAge; //선언 : 초기화x
		yourAge = 22;
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + yourAge; //변수는 사용을 위해서 값이 할당.
		double resultl = (double) myAge + height;
		
		System.out.println(result);
		
		System.out.println("안녕하세요 " + name + " 입니다.");
	}

}
