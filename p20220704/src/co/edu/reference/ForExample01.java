package co.edu.reference;

public class ForExample01 {

	public static void main(String[] args) {
		
	//배열
		int[] tempAry = new int[5];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);
//			tempAry = new int[] {3,4,5,6,7};
		}
	
		
		int max = tempAry[0];
		for (int i = 0; i < tempAry.length; i++)  
		if (tempAry[i] > max) {
				max = tempAry[i];
				
		} 
			System.out.println("제일 큰값: " + max);
		}	
		
		// 제일 큰 값을 max;
		
//		for (int num : tempAry) {
//			System.out.println(num);
//		}
//		for (int max : tempAry )
		
}
