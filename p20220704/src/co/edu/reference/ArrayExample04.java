package co.edu.reference;

public class ArrayExample04 {

	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 84, 90

		int[][] banAry = new int[][] { { 80, 85, 83 }, { 79, 84, 90 } };
		
		// A반 평균
		int sum = 0;
		for (int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
		}
		System.out.printf("A반 평균: %.1f 입니다.\n", (double) sum / banAry[0].length);
	
		sum = 0;
		for (int i = 0; i < banAry[1].length; i++) {
			sum += banAry[1][i];

		}

		System.out.printf("B반 평균: %.1f 입니다.\n", (double) sum / banAry[1].length);

	}
}

