package co.edu.collect.generic;

public class BoxExample {

	public static void main(String[] args) {
		Box strBox = new Box();
//		strBox.set(new String("문자열"));  // 매개값 : object
		String result = (String) strBox.get();
		System.out.println();
	}

}
