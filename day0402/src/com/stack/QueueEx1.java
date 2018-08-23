package com.stack;

import java.util.*;
import static java.lang.System.out;

public class QueueEx1 {
	// 퍼스트 인 퍼스트 아웃 방식 큐.
	// 들어가는 입구와 나오는 입구가 달라서 들어온 입구의 반대방향으로 나갈 수 있다. 결국에는 들어온 순서대로 데이터들이 출력될 수 있게 된다.

	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두색" };

	public static void main(String[] args) { //오퍼 픽이 널이 아닌 동안 폴 
		// 큐 구현에는 링크드리스트라는 메소드가 필요함
		Queue<String> qu = new LinkedList<String>();

		for (String str : colors) {

			qu.offer(str);// 데이터 추기
			// 큐는 오퍼라는 메소드를 활용하여 데이터 입력
		}
		// 큐는 링크드리스트로 객체 생성을 해주고 입력은 오퍼 메소드, 피크 메소드는 위치값이며, 해당 위치값이 널이 아닐때까지
		//돌아가는 반복문에 활용할 수 있다. 
		while (qu.peek() != null) {
			/*
			 * peek(): 피크 메소드는 가장 위쪽에 있는 데어터를 가리킨다. 첫번째 데이터
			 * 
			 * offer(): 오퍼 메소드는 데이터를 삽입(추가)
			 *
			 * poll() : 첫번째 데이터를 출력 후 저장된 위치를 삭제함
			 */
			out.println(qu.poll());

		}

	}
	

}
