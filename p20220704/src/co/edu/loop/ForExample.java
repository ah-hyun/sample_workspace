package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {
		/*int sum = 0;
		for (int i= 1; i <= 10; i++) {
			if(i%2 ==1) {
				
			
			sum = sum + i;
			System.out.println("i의 값: " + i + ", sum의 값: " + sum);
		}
		}
		System.out.println("홀수 합: " + sum);*/

		
		// 1 ~ 10 까지 result => 누적.
		//1,3,5,7,9 => 누적 (증감식으로 짝수,홀수 변경 가능) (i+= 2)
		//1,4,7,10 => 누적 (i+= 3)
		
		int result = 0;
		for (int i = 1; i <= 10; i+= 3) { 
		
			result += i;
			
			
		}
		System.out.println("1 ~ 10 까지 누적 합: " + result);
		System.out.println("-----------------");
		
		
		//1~10 까지 출력.
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("-----------------");
		// 10~1 까지 출력.
		for (int i = 10; i >=1; i--) {
			System.out.println(i);
		}
	}

}