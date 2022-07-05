package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int num) {
		return num * 2;
	}
	public static void main(String[] args) {
		// 메소드 호출구문.
		int result = sumAry(10);
		System.out.println("결과값: " + result);
		
		
		//배열 합계
	
		int sum = 0;
		double avg = 0;

		int[] intAry = { 45, 78, 12, 48, 99, 23 };
		// intAry 배열의 합과 평균.
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		avg = (double) sum / intAry.length;
		System.out.printf("intAry 합계: %d, 평균: %.1f 입니다.\n", sum, avg);
	
		
		
		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;
			sum += intArray[i];
		}
		avg = (double) sum / intArray.length;
		System.out.printf("intArray 합계: %d, 평균: %.1f 입니다.\n", sum, avg);
		
		
		// intArray 배열의 합과 평균.
		
		
		
		int[] scanArray = new int[5];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력>>>> ");
			scanArray[i] = scn.nextInt();
			sum += scanArray[i];
		}
		avg = (double) sum / scanArray.length;
		System.out.printf("scanArray 합계: %d, 평균: %.1f 입니다.\n", sum, avg);
		//scanArray 배열의 합과 평균.
	}

}
