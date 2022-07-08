package co.edu.interfaces.emp;

import java.util.Scanner;

/*
	배열기반 기능 구현
*/public class EmployeeArray implements EmployeeList {
	// 싱글톤 기반
	private static EmployeeArray instance = new EmployeeArray();
	private EmployeeArray () {}
	public static EmployeeArray getInstance() {
		return instance;
	}
	
	Employee[] list; // 사원정보를 담기 위한 배열 선언
	int empNum;
	Scanner scn = new Scanner (System.in);
 	
	@Override
	public void init() {
		System.out.print("사원 수를 입력하세요. >> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	@Override
	public void input() {
		System.out.printf("%d 사번을 입력하세요. >> ", empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.print("이름을 입력하세요. >>");
		String name = scn.nextLine();
		
		System.out.print("급여를 입력하세요. >> ");
		int sal = Integer.parseInt(scn.nextLine());
		
		list[empNum++] = new Employee (no, name, sal);
	
	}

	@Override
	public Employee search(int empId) {
		for (int i=0; i<empNum; i++) {
			if (list[i].getEmployeeId() == empId) {
				return list[i];
			}
		}
		return null;
	}

	@Override
	public void printList() {
		for (int i=0; i<empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
		
		
	}

		
	
}
