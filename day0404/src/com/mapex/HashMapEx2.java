package com.mapex;

import java.util.*;
import static java.lang.System.out;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 객체 설정을 해줘야 한다. 인트형도 스트링도 들어가자마자 객체로 바뀌기 때문에 가지고 올 때는
		// 새로운 객체를 설정해 주어야 함.
		map.put("홍길동", new Integer(30));
		map.put("동길동", new Integer(100));
		map.put("서길동", new Integer(10));
		map.put("남길동", new Integer(80));
		map.put("북길동", new Integer(70));

		/*
		 * 키와 값을 set형태로 저장(HashMap을 이용할 때 key와 value묶어주기 위해 entry를 이용함 Map.Entry 인터페이스를
		 * 이용 맵의 엔트리(키와 값의 한쌍(페어)로 되어있다. Map.entrySet 메소드는 이클래스에 속하는 요소를 가지는 멥의 컬렉션 뷰를
		 * 반환함 멥의 엔트리의 참조를 취득하는 방법은 컬렉션 뷰의 반복자로부터 취득함
		 */

		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		// 위와 같이 설정해 놓은 값들을 출력하기 위해 반복문인 와일문을 사용한다.
		
		
		
		
		while (it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			out.println(e.getKey() + "  " + e.getValue());

		}
		Set<String> set2 = map.keySet();

		// 순서대로 출력되지는 않음.
		// 백터 말고는 순서가 없기 때문임.
		out.println("응시자 명단 : " + set2);

		// 값을 컬렉션을 이용해 저장한다.
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();

		int sum = 0;

		while (it2.hasNext()) {
			// it2라는 값을 가져온다.
			it2.next();
			sum += 1;

		}
		out.println("총점 : " + sum);
		out.println("평균 : " + (float) sum / set2.size());
		out.println("최고점수 : "+Collections.max(v));		
		out.println("최저점수 : "+Collections.min(v));		
		
	}

}
