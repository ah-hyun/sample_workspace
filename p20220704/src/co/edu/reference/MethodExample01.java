package co.edu.reference;

public class MethodExample01 {

	public static void main(String[] args) {
		// 실행구문.
//		long sum = sum (20); // 매개값
//	showInfo("홍길동", 20);
//	showInfo("김아현", 27);
//	printStar(4, "야호");
//		gugudan();
	
//	public static void gugudan() {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.printf("%2d * %2d = %2d ", j, i, j*i);
//			}
//		System.out.println();
		}
	{
	}
	
//	
//	public static void printGugudan(int num) {
//		for (int i = 1; i < 10; i++) {
//		System.out.println(num + " * " + i + " = " + (num*i) );
//		} 
//		

//	public static void printGugudan() {
//		int i, dan;
//		for (dan = 2; dan <= 9; dan++) {
//			System.out.print("[" + dan + "단]\t");
//		}
//		System.out.println();
//		for (i = 1; i <= 9; i++) {
//			for (dan = 2; dan <= 9; dan++) {
//				System.out.print(dan + "*" + i + "=" + i * dan + "\t");
//			}
//			System.out.println();
{
	}
	
	
	
	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
			
					System.out.print(shape);
				}
					System.out.println();
				}
	}

//				System.out.println();
		
//		for (int i = 0; i <= times; i++)
//		System.out.println(shape);

	
	
	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name  + "입니다. 나이는 " + age + "살 입니다.");
	}
	
	// 정의구문.
	public static long sum (int num) { //매개변수
		int result = num * 2;
		return result; // 자동형변환
	}
	
}
