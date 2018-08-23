package com.vectorex;

import java.util.Collections;
import java.util.Vector;
import static java.lang.System.out;

public class VectorEx3 {
	private static final String colors[] = { "����", "���", "���", "�Ķ�", "��Ȳ��", "���λ�" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		for (String str : colors)
			v.add(str);

		System.out.println("��ü���");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

		// �˻�
		String s = "���λ�";

		if (v.contains(s)) {

			int i = v.indexOf(s) + 1;
			out.println(s + "--->��ġ:" + i);
		}

		// ����
		v.remove("���λ�");

		System.out.println("���� �� ���");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

		v.remove(4);
		System.out.println("���� �� ���");
		for (String str : v)
			System.out.print(str + " ");

		System.out.println();

	}

}


