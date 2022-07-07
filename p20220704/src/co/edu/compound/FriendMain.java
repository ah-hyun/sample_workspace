package co.edu.compound;

public class FriendMain {
	public static void main(String[] args) {
		
		Friend f1 = new Friend();
//		f1.name = "김지수";
		f1.setName("김지수");
//		f1.tel = "010-6600-6666";
		f1.setTel("010-6600-6666");
//		f1.email = "f1@naver.com";
		f1.setEmail("f1@naver.com");
//		f1.birth = "7월 7일";
		f1.setBirth("7월7일");
//		f1.height = 165.3;
		f1.setHeight(170);
		System.out.println("키: " + f1.getHeight());
//		f1.weight = 50.2;
		f1.setWeight(-48);
		System.out.println("몸무게: " + f1.getWeight());
		f1.showInfo();
				
	}

}
