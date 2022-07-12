package co.edu.collect.board;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
	BoardDAO list = BoardDAO.getInstance();
	Scanner scn = new Scanner (System.in);
	
		while(true) {
	System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
	System.out.println("메뉴를 선택하시오. >> ");
	
	int num =  scn.nextInt();
	if (num == 1) {
		
		
	}else if (num ==2) {
		System.out.print("제목을 입력하세요. >> ");
		String title = scn.nextLine();
		System.out.print("작성자를 입력하세요. >> ");
		String writer = scn.nextLine();
		System.out.print("내용을 입력하세요. >> ");
		String content = scn.nextLine();		
		Board bo = new Board (title, writer, content);
		list.add(bo);
		
//		Board list = new lists (title, writer, content);
		
	}else if (num ==3) {
		System.out.println("검색할 작성자를 입력하세요. >> ");
		String writer1 = scn.nextLine();
//		Board writer2 = list.search(writer1);
		
		
	}else if (num ==4) {
		
	}else if (num ==5) {
		System.out.println("프로그램 종료.");
		break;
	}

		
	}
	
	}

}

