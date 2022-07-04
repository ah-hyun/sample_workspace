package co.edu;

import java.util.Scanner;

public class Example02 {
public static void main(String[] args) {
	// 사용자 입력값을 읽어서 100 ~ 90 : A, 80 : B, ~ 70 : C, 그 외 : D
	// 출력값 : 점수 78은 C 등급입니다!
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요. ");
	int score = scn.nextInt();
	
		if (score >=90) {		System.out.println("점수 " + score  + " 은 " + "A등급입니다!");
	} else if(score>=80) {
		System.out.println("점수 " + score  + " 은 " + "B등급입니다!");	} else if(score>=70) {
		System.out.println("점수 " + score  + " 은 " + "C등급입니다!");
	} else {
		System.out.println("점수 " + score  + " 은 " + "D등급입니다!");
		
 
	
	//char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : ((score >= 70) ? 'C' : 'D'));

	
	
	
	}
}
}