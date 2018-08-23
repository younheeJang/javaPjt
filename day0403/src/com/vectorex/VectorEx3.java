package com.vectorex;

import java.util.Collections;
import java.util.Vector;
import static java.lang.System.out;

public class VectorEx3 {
	private static final String colors[] = { "검정", "노랑", "녹색", "파랑", "주황색", "연두색" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		for (String str : colors)
			v.add(str);

		System.out.println("전체출력");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

		// 검색
		String s = "연두색";

		if (v.contains(s)) {

			int i = v.indexOf(s) + 1;
			out.println(s + "--->위치:" + i);
		}

		// 삭제
		v.remove("연두색");

		System.out.println("삭제 후 출력");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

		v.remove(4);
		System.out.println("삭제 후 출력");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

	}

}


