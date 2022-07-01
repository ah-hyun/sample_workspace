package co.edu;

public class Varlable {
	public static void main(String[] args) {
		byte b1 = 127; // -128 ~ 127
		short s1 = 32767; // -32768 ~ 32767
		int n1 = 0; // -2147483648 ~ 2147483647
		long l1 = 0; 
		
		int result = b1 + 20;
		long resultl = l1 + (long) 20;
		result = (int) l1 + 20;
		
		char c1 = 'A';
		c1++; // c1에 +1
		//for(int i = 0; i < 27; i++) {
		//System.out.println(c1++);
		//}
		
		//이력변경추가 2022.07.01 12:55
		System.out.println("이력변경추가");
		
		// 깃에서 수정한 작업입니다.
		System.out.println("깃에서작업함");
		
		System.out.println(c1);
		System.out.println(result);
		System.out.println(resultl);
		
	}

}
