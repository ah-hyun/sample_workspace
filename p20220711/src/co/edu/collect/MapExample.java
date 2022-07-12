package co.edu.collect;
/*
 *  이름, 점수 => map 저장.
 *  김민수, 80점 / 황현익, 75점 / 이현승 , 88점
 *  Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap <String, Integer>();
	
	map.put("김민수", 80);
	map.put("황현익", 75);
	map.put("이현승", 88);
	
	// 출력결과 :
	// 평균점수 : 81
	// 최고점수 : 88, 최고점수 학생의 이름 : 이현승.
	
	
	Scanner scn = new Scanner (System.in);
	System.out.println("학생 이름을 입력하세요.>> ");
	String name = scn.nextLine();
	
	
	Set<Entry<String, Integer>> set = map.entrySet();
	
	for (Entry<String, Integer> ent : set) {
		if (ent.getKey().equals(name)) {
			System.out.println("학생의 점수: " + ent.getValue());
		}
	}
	System.out.println("정보가 올바르지 않습니다.");
	
	
	
}
}