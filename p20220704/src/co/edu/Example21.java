package co.edu;

import java.util.Scanner;

public class Example21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. ");
		int num = scn.nextInt();
		String grade="";
		
		if (num >= 90 && num <= 100) {
			if (num >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		} else if (num >= 80) {
			grade = "B";
		}else if (num >= 70) {
			grade = "C";
		}else {
		grade = "D";
	}
		System.out.println("점수 " + num + "은 " + grade + "등급입니다!");
	}
}
