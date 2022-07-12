package co.yedam;

/*
 * 문제 4: 임의의 값 생성.
 * Math.random()을 사용하여 1 ~ 100 의 임의의 값을 생성하여 배열(크기 6)에 저장 후
 * 가장 큰 값과 가장 작은 값을 구해서 출력하는 기능을 작성하세요.
 * 출력 예 : 가장 큰 값 : 97, 가장 작은 값 : 3
 */
public class Exam04 {
	public static void main(String[] args) {

		int[] intAry = new int[6];
		for (int i = 0; i < intAry.length; i++) {
		intAry[i] = (int) (Math.random() * 50); }
	
		int max = intAry[0];
		for (int i = 0; i < intAry.length; i++)  
		if (intAry[i] > max) {
				max = intAry[i];
		} 
		int s = intAry[0];
		for (int i = 0; i < intAry.length; i++)  
			if (intAry[i] < s) {
					s = intAry[i]; }
		
		System.out.println("가장 큰 값: " + max + " ,가장 작은 값: " + s);
		
		
				}
}
