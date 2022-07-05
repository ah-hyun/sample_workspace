package co.edu.reference;

public class ArrayExample02 {

	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기 : 5, intAry.length
		
		
		intAry[2] = 30;
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
//				
//		if (i % 2 == 0) // 짝수인 순번 출력.

		int sum = 0;
		for (int i=0; i<intAry.length; i++) {
		
//		if (intAry[i] % 2 == 0) { 
//		System.out.println(intAry[i]); //짝수 출력.
		sum += intAry[i];
		}
		System.out.println("합계: " + sum);
	
		}
	}


