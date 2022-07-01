package co.edu;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		
		//String name = new String("홍길동");
		// System.out.println("값을 입력.");
		Scanner sn = new Scanner(System.in);

		//String input = sn.nextLine(); //문자열
		//정수 int input = sn.nextInt();
		//System.out.printf("입력값은 %s", input);
		
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		//int result = num1 + num2; // 입력 2수의 합.
		
		
		if (num1 > num2) {
			int D = num1 - num2; 
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.", num1, num2, D);
		}else { int result = num2 - num1;
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.", num1, num2, result);
		}
		
		//System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.", num1, num2, result);
		// 입력값 a와 b의 합은 c 입니다.
		
		
	}

}
