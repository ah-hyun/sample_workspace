package co.edu.inherit;

import java.util.Scanner;

/*
 * 등록, 조회, 목록
 */
public class FriendApp {
	// 기본 생성자 사용
	
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);
	
	public void start() {
		while (true) {
		System.out.println("1.등록 | 2.조회 | 3.목록 | . . . | 9.종료");
		System.out.println("번호를 선택하세요. >> ");
	
		int selectNo = Integer.parseInt(scn.nextLine());
		if (selectNo == 1) {
			add();
			
		}else if (selectNo == 2) {
			search();
			
		}else if (selectNo == 3) {
			list();
			
		}else if (selectNo == 9) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
		System.out.println("<<< 프로그램 종료 >>>");
} // end.
		private void add() {
			System.out.println("1.학교 | 2.회사 | 3.친구");
			System.out.println("번호를 선택하세요. >> ");
			int choice = Integer.parseInt(scn.nextLine());
			
			System.out.println("이름을 입력하세요. >> ");
			String name = scn.nextLine();
			System.out.println("연락처를 입력하세요. >> ");
			String phone = scn.nextLine();
			
			if(choice == 1) {
				System.out.println("학교명을 입력하세요. >> ");
				String univ = scn.nextLine();
				System.out.println("전공명을 입력하세요. >> ");
				String major = scn.nextLine();
				
				friends[friendNum++] = new UnivFriend(name, phone, univ, major);
			}else if (choice == 2) {
				System.out.println("회사명을 입력하세요. >> ");
				String company = scn.nextLine();
				System.out.println("부서명을 입력하세요. >> ");
				String department = scn.nextLine();
			
				friends[friendNum++] = new ComFriend(name,phone, company, department);
			}else if (choice == 3) {
				friends[friendNum++] = new Friend(name,phone);
			}
			
		}
		private void search() {
			// 친구이름 입력 => 친구상세정보 : showInfo()
			System.out.println("친구이름을 입력하세요. >> ");
			int count = 0;
			String fname = scn.nextLine();
			for (int i=0; i<friendNum; i++) {
				if (friends[i].getName().equals(fname)) {
					friends[i].showInfo();
				}else
					count++;
			}
			if (count == friendNum) 
				System.out.println("찾을 수 없습니다.");
		}
		
		private void list() {
			for (int i=0; i<friendNum; i++) {
			System.out.println(friends[i].toString());
			}
			
		}
}
