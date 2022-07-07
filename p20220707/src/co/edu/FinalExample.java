package co.edu;
/*
 상수 vs. 변수
 변수에 final이 붙으면 상수가 된다.
 메소드에 final이 붙으면 재정의가 불가하다.
 클래스에 final이 붙으면 상속이 불가하다.
*/

/*
 클래스 선언은 파일 하나에 1개 작성이 원칙.
 */
class Person {
	final String ssn; // 주민번호.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
public class FinalExample {

	public static void main(String[] args) {
		
		// 변수
		String name = "홍길동";
		name = "김민수";
		
		// 상수
		final int num = 10;
//		num = 20; // 새로운 값을 할당할 수 없음.
		
		Person person = new Person("971004-170417", "홍길동");
		person.name = "홍민수";
//		person.ssn = "971003-170417"; //final 붙어있으면 변경 불가.
	}

}
