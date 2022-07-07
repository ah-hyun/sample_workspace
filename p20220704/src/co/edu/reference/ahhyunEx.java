package co.edu.reference;

import java.util.Scanner;

public class ahhyunEx {

	public static void main(String[] args) {
		boolean run = true;
		int StudentNum = 0; //학생수
		int[] scores = null; //참조변수 초기화.
		Scanner scn = new Scanner (System.in);

		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("\n 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine()); //nextInt() > 정수타입, nextLine() > 문자열
			
			// 배열을 지정하지 않고 다른 메뉴를 선택하면 메세지 보여주기.
			if (scores == null) {
				if (!(selectNo == 1 || selectNo == 5)) {
					System.out.println("학생수를 먼저 지정하세요!!");
					continue;
				}
			}
			
			if (selectNo == 1) {
				System.out.print("학생수 입력>>> ");
				StudentNum = Integer.parseInt(scn.nextLine());
				scores = new int[StudentNum];
				System.out.println("정상적으로 처리되었습니다.");
			} 
			else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			}
			else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> " + scores[i] + "\n");
				}
			}
			else if (selectNo == 4) {
				System.out.print("분석 >>> ");
				int sum = 0;
				int max = -1;
				double avg=0;
				
				for ( int i = 0; i < scores.length; i++) {
					if (max < scores[i])
						max = scores[i];
				}
				
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					
				avg = sum / StudentNum;
				
				}
				System.out.println("최고 점수: " + max + "평균 점수: " + avg);
			}
			else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료.");
	}

}
