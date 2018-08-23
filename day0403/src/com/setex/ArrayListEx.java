package com.setex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("공각기동대");
		list1.add("원령공주");

		List<String> list2 = new ArrayList<String>(list1);
		list2.add("라푸타");

		List<String> list3 = new ArrayList<String>();

		list3.addAll(list2);
		
		int n = list3.indexOf("원령공주");
		list3.add(n+1, "미래소년코난");		
		
		System.out.println(list3);

	}

}
