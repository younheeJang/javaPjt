package com.setex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("�����⵿��");
		list1.add("���ɰ���");

		List<String> list2 = new ArrayList<String>(list1);
		list2.add("��ǪŸ");

		List<String> list3 = new ArrayList<String>();

		list3.addAll(list2);
		
		int n = list3.indexOf("���ɰ���");
		list3.add(n+1, "�̷��ҳ��ڳ�");		
		
		System.out.println(list3);

	}

}
