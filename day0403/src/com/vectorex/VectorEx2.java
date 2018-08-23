package com.vectorex;

import java.util.Collections;
import java.util.Vector;
import static java.lang.System.out;

public class VectorEx2 {

	private static final String colors[] = { "����", "���", "���", "�Ķ�", "��Ȳ��", "���λ�" };

	public static void main(String[] args) {

		int idx;
		Vector<String> v = new Vector<String>();
		// �ڷ����� �ƴ� ��ü���� ���� ������ �Ϲ�ȭ�� ����� ��

		for (String str : colors)
			v.add(str);

		out.println("ù��°���:" + v.firstElement());
		out.println("�ι�°���:" + v.get(1));
		out.println("���������:" + v.lastElement());

		// ù��° ����� �������� ������� ����
		v.set(0, "���");
		out.println("ù��°���:" + v.firstElement());
		out.println("��� ����:" + v.size());// �迭�� ������ �˷���

		// �ݷ����̶�� Ŭ����
		Collections.sort(v);
		out.println("\n�������� ����:");
		for (String str : v)
			out.print(str + " ");
		out.println();

		// �˻������ ������ ���Ŀ� �����Ѵ�.
		// �׷��� ������ ����! ���ְ� �˻������ ó���ؾ� �Ѵ�.

		/*
		 * int idx = Collections.binarySearch(v, "����");
		 * System.out.println("\n�Ķ�: "+idx+"index"); //�̹� ������ �������� ã�� �Ǹ� ���ٴ� ������ -1����
		 * �ٴ´�.
		 */

		idx = Collections.binarySearch(v, "���");
		out.println(idx);
		out.println();

		// �������� ����
		Collections.sort(v, Collections.reverseOrder());

		out.println("\n�������� ����:");
		for (String str : v)
			out.print(str + " ");
		out.println();

		idx = Collections.binarySearch(v, "��Ȳ��", Collections.reverseOrder());
		out.println(idx);
		out.println();


	}



}
