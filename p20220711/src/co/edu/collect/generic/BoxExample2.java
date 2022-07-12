package co.edu.collect.generic;

public class BoxExample2 {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		String reslut = box.get();
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer (boxong)
		int result1 = intBox.get();
	}

}
