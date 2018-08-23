package com.vectorex;

import java.util.Collections;
import java.util.Vector;
import static java.lang.System.out;

public class VectorEx2 {

	private static final String colors[] = { "검정", "노랑", "녹색", "파랑", "주황색", "연두색" };

	public static void main(String[] args) {

		int idx;
		Vector<String> v = new Vector<String>();
		// 자료형이 아닌 객체형이 들어가기 때문에 일반화를 만들어 줌

		for (String str : colors)
			v.add(str);

		out.println("첫번째요소:" + v.firstElement());
		out.println("두번째요소:" + v.get(1));
		out.println("마지막요소:" + v.lastElement());

		// 첫번째 요소인 검정색을 흰색으로 변경
		v.set(0, "흰색");
		out.println("첫번째요소:" + v.firstElement());
		out.println("요소 개수:" + v.size());// 배열의 개수를 알려줌

		// 콜렉션이라는 클래스
		Collections.sort(v);
		out.println("\n오름차순 정렬:");
		for (String str : v)
			out.print(str + " ");
		out.println();

		// 검색기능은 정렬이 이후에 실행한다.
		// 그래서 정렬을 먼저! 해주고 검색기능을 처리해야 한다.

		/*
		 * int idx = Collections.binarySearch(v, "검정");
		 * System.out.println("\n파랑: "+idx+"index"); //이미 없어진 검정색을 찾게 되면 없다는 뜻으로 -1값이
		 * 붙는다.
		 */

		idx = Collections.binarySearch(v, "노랑");
		out.println(idx);
		out.println();

		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());

		out.println("\n내림차순 정렬:");
		for (String str : v)
			out.print(str + " ");
		out.println();

		idx = Collections.binarySearch(v, "주황색", Collections.reverseOrder());
		out.println(idx);
		out.println();


	}



}
