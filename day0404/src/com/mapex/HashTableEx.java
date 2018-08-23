package com.mapex;

import java.util.*;
//����Ʈ ����� �ؽ� ���̳� �ؽ� ���̺� ��� ����
import static java.lang.System.out;

public class HashTableEx {

	private static final String name[] = { "�̼���", "ȫ�浿", "��浿", "������", "�����", "���Ȱ�" };
	// Ű�� �ߺ��� ������� ����
	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "555-5555", "555-5555", "666-6666" };
	// ���� �ߺ��� �����

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		// �ؽ� ���̺� ������(Ű, ��)�� �Է��� �� ����.
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
			// �ؽ����̺��� ���� Ű�� �̿��Ͽ� �˻�
		}//Ű�� ���� �ؽ����̺� �Է� ��!
		
		String str = ht.get("ȫ�浿");
		//str�� �޾ƿ� Ű���� ���� �ƴ϶��
		if (str != null) {
			out.println("ȫ�浿�� ��ȭ��ȣ:" + str);
		//����Ѵ�.
		}
		// Ű�� �����ϴ� �� �˻�
		if (ht.containsKey("�����")) {
			out.println("������� �����մϴ�.");
		}
		// �����Ͱ� �����ϴ� �� �˻�
		if (ht.containsValue("555-5555")) {
			out.println("�˻��Ͻ� ��ȭ��ȣ�� �����մϴ�.");
		}
		// ���Ȱ踦 �����ϱ�
		ht.remove("���Ȱ�");

		if (ht.containsKey("���Ȱ�")) {
			out.println("���Ȱ谡 �����մϴ�.");
		} else {
			out.println("�������� ����");
		}

	}

}
