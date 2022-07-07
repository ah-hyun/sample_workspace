package co.edu.reference;

import java.util.Scanner;

public class maxsumavg {

	public static void main(String[] args) {
	
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner (System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int Num = Integer.parseInt (scn.nextLine());
			
			if (Num == 1) {
				System.out.println("입금액을 입력하세요.");
			int mn = Integer.parseInt (scn.nextLine()); 
			balance += mn;
			System.out.println("예금액> " + balance);
			}
			if (Num == 2) {
				System.out.println("출금액을 입력하세요.");
				int mn = Integer.parseInt (scn.nextLine()); 
				balance -= mn;
			System.out.println("출금액> " + balance);
			}
			if (Num == 3) {
				System.out.println("현재 잔액은 " + balance + " 원 입니다.");
			}
			if (Num == 4) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
		}
		
		
		
	}
}