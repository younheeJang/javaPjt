package com.mapex;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class HashMapEx1 {
	public static void main(String[] args) throws IOException {

		/*
		 * Map<Ű, ��> : Ű�� �ߺ��� ������� ���� ���� �ߺ��� �����
		 */

		// �ؽ� ��
		Map<String, String> map = new HashMap<String, String>();
		// ������ ���͸���� ����. �ʿ����� ���������� ������ ����.
		// ���ʹ� ����Ʈ�����̱� ������ ������ ����.


		out.println(map);
		out.println();
		// Ű�� ���� �̿���
		String key;
		//��Ʈ���� �ԷµǸ鼭 �ڵ����� ��ü(������Ʈ) ���� ���Ѵ�.
		Set set = map.keySet();
		// �ʿ� Ű���� �����ϰ� Ű���̶�� �޼ҵ带 �̿��ؼ� Ű���� ���
		
		//�������̽� ���ͷ����͸� ������ Ű�� ����Ͽ� ��ü ����� �ϰ� �Ǹ� ���� ������� ���� �� ����.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			//���ͷ����͸� ������ Ű�� �Է¹޾� ��¿� �̿��Ϸ��� �� ������ (String)�� ���� ���ͷ�����
			//�Է� �κ� �տ� ��Ʈ������ ���� ��ȯ�� ����� ��. Ű�� ��Ʈ���̴�.
			key = (String) it.next();
			out.println(map.get(key));
		}
		out.println();

		map.put("��ȭ", "���̾��");
		out.println(map);
		out.println();
		
		//������ Ű�� ���� ���� �����Ѵ�.
		//��ȭ ��� ������ Ű�� ���̾���̶�� ���ο� ���� �Է��ϸ� ���� ���� ����ϰ� �Ǿ��� ��
		//Ű�� �����ִ� ���� ���̾������ �ٲ� ��µȴ�.
			
	}

}
