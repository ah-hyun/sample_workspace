package co.edu.datebase;

public class Oracle implements Dao {

	@Override
	public void insert() {
		System.out.println("Orecle 입력합니다.");
		
	}

	@Override
	public void update() {
		System.out.println("Orecle 수정합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("Orecle 삭제합니다.");
		
	}
	
	
}
