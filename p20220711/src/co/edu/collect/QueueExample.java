package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>(); // 먼저 들어간 요소부터 빼냄.
		
		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");

		while (!que.isEmpty()) {
			String result = que.poll();
			System.out.println(result);
		}
	}

}
