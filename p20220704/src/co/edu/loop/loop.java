package co.edu.loop;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	//while 반복문의 종료조건.
	// 1 ~ 100 임의의 숫자를 생성.
		
		int temp = (int) (Math.random() * 100) + 1;
		System.out.println("숫자를 입력하세요. >> ");
		int inputVal = scn.nextInt();
		
		
		boolean istrue = true;
		while(istrue) {
			
			if(inputVal == temp) {
				System.out.println("맞췄습니다."); 
				istrue = false;
				
				
			} else if (inputVal > temp) {
				System.out.println("랜덤 숫자가 더 작습니다.");
				inputVal = scn.nextInt();
				
			} else if (inputVal < temp) {
				System.out.println("랜덤 숫자가 더 큽니다.");
				inputVal = scn.nextInt();
			
			}
		}
		System.out.println("end of prog.");
	}

}
