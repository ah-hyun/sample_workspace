package co.edu.compound;

import java.util.Date;
/*
	등록/ 조회/ 수정/ 삭제/ 리스트
	id : user1, passwd : 1212 => 로그인 되었습니다!
							  => 아이디, 비밀번호를 확인하세요!
*/
import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner (System.in);
		String myid = "user1";
		String mypw = "1212";

		// 로그인 처리 기능.
	
		boolean lg = true;
		while (lg) {
			
			System.out.println("아이디를 입력하세요. >>");
			String id = scn.nextLine();
			
			System.out.println("패스워드를 입력하세요. >>");
			String pw = scn.nextLine();
			
			if (myid.equals(id) && mypw.equals(pw)) {
				System.out.println("로그인 되었습니다!");
				lg = false;
			} else if (myid != id && mypw != pw) {
				System.out.println("아이디와 비밀번호를 확인해주세요!");
			
			}
		}
		
		boolean run = true;
		
		while (run) {
			System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.리스트 | 6.종료");
			System.out.print("선택>> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0))
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("글 작성자를 입력하세요.");
				String writer = scn.nextLine();
				
				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);
				
				// 배열의 비어있는 위치에 저장.
				for (int i=0; i<boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board; // 비어있는 위치에 1건 저장.
						break;
					}
				}
				System.out.println("정상적으로 입력하였습니다.");
			}
			else if (selectNo == 2) {
				// 게시글 조회: 제목 조회
				System.out.print("조회할 제목을 입력하세요.");
				String findTirle = scn.nextLine();
				
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTirle)) {
						
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시는 %s, 조회수는 %d \n", 
											boards[i].getTitle(),boards[i].getContent(), boards[i].getWriter(), 
											boards[i].getCreateDate(),boards[i].getHitCount());
						
						// count 증가.
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					}

					else if (boards[i] == null) {
							
						System.out.println("등록되지 않은 데이터입니다.");
						break;
						}
					
						}
			
				} 
				
			
			
			else if (selectNo == 3) {
				
			}
			else if (selectNo == 4) {
				
				System.out.println("삭제할 제목을 입력하세요.");
			String deleteTirle = scn.nextLine();
			for (int i=0; i<boards.length; i++) {
				if  (boards[i].getTitle().equals(deleteTirle)) {
						boards[i] = null;
						System.out.println("삭제되었습니다.");
						break;
				}
			}
				
			}
			else if (selectNo == 5) {
				// 전체리스트 확인.
				System.out.println(" ========== 글 목 록 ============== ");
				for (int i=0; i<boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시는 %s, 조회수는 %d \n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(),
								boards[i].getCreateDate(), boards[i].getHitCount());
					}
				}
				
			}
			else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다...");
				run = false;
			}
			
			
		}
		System.out.println("<< 프로그램 종료 >>");
		
		
		

	}

}
