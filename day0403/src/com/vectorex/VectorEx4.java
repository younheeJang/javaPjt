package com.vectorex;

import java.util.*;
import java.util.Vector;

public class VectorEx4 {

	public static void main(String[] args) {
		// Ŭ���� ��ü�� ���ͷ� ���� �� �ִ�. Ŭ������ ��ü�̱� �����̴�.

		Vector<MyData> v = new Vector<MyData>();
		
		v.add(new MyData("ȫ�浿",23));
		v.add(new MyData("��浿",26));
		v.add(new MyData("���浿",27));
		v.add(new MyData("�̱浿",30));
		
		
		//����� ������ �̿��ؼ� �Ѵ�.
		for(MyData my : v)
			System.out.printf("�̸�:%s, ����:%d\n", my.name, my.age);
		
		
	}

}
