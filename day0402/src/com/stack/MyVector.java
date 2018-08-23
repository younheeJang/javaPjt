package com.stack;

import java.util.*;
//API�� �̹� �����Ǿ� �ִ� Ŭ�����̹Ƿ� 
public class MyVector extends Vector {

	public MyVector() {
		super(1, 1);// �Ű������� �� ���� ���� ������ �̿�
	}

	public void addInt(int i) {// ���� �߰�
		addElement(new Integer(i));
	}

	public void addFloat(float f) {// �Ǽ� �߰�
		addElement(new Float(f));
	}

	public void addString(String s) {
		// ���ڿ� �߰�
		addElement(s);
	}

	public void addCharArray(char a[]) {
		// ���� �߰�
		addElement(a);
	}

	// ��� �޼ҵ�
	public void write() {

		Object o;

		int length = size();

		System.out.println("Number of vector elements is" + length + "and they : ");

		for (int i = 0; i < length; i++) {

			o = elementAt(i);

			if (o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o));

			} else {
				System.out.println(o.toString());
			}
		}
	}

}