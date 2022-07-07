package co.edu;

/*
 정적메소드, 정적필드 사용.
*/
public class StudentMain {
	private static String name;
	public static void main(String[] args) {
		
		System.out.println(args[0]);		
		System.out.println(args[1]);
		
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);

		System.out.println("이름: " + kim.getName());
		kim.showInfo();

		Student park = new Student("22-002", "박희수", 85);
		park.showInfo();

		Student han = new Student("22-003", "한수빈", 90);
		han.showInfo();

		Course course = new Course("김철수", "1-3", 5);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반정보: " + course.getBname());

		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(han);

		course.getStudents();
		
		// 최고점 학생 정보 보기.
		System.out.println("최고점수 학생: ");
		Student maxStudent = course.getMaxStudent();
		maxStudent.showInfo();
	
		// 평균 구하기
		System.out.println("반 평균: ");
		System.out.println(course.getAvgScore());
	
	}

}
