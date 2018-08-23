package com.mapex;

import java.util.*;
import static java.lang.System.out;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// ��ü ������ ����� �Ѵ�. ��Ʈ���� ��Ʈ���� ���ڸ��� ��ü�� �ٲ�� ������ ������ �� ����
		// ���ο� ��ü�� ������ �־�� ��.
		map.put("ȫ�浿", new Integer(30));
		map.put("���浿", new Integer(100));
		map.put("���浿", new Integer(10));
		map.put("���浿", new Integer(80));
		map.put("�ϱ浿", new Integer(70));

		/*
		 * Ű�� ���� set���·� ����(HashMap�� �̿��� �� key�� value�����ֱ� ���� entry�� �̿��� Map.Entry �������̽���
		 * �̿� ���� ��Ʈ��(Ű�� ���� �ѽ�(���)�� �Ǿ��ִ�. Map.entrySet �޼ҵ�� ��Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��� �並
		 * ��ȯ�� ���� ��Ʈ���� ������ ����ϴ� ����� �÷��� ���� �ݺ��ڷκ��� �����
		 */

		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		// ���� ���� ������ ���� ������ ����ϱ� ���� �ݺ����� ���Ϲ��� ����Ѵ�.
		
		
		
		
		while (it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			out.println(e.getKey() + "  " + e.getValue());

		}
		Set<String> set2 = map.keySet();

		// ������� ��µ����� ����.
		// ���� ����� ������ ���� ������.
		out.println("������ ��� : " + set2);

		// ���� �÷����� �̿��� �����Ѵ�.
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();

		int sum = 0;

		while (it2.hasNext()) {
			// it2��� ���� �����´�.
			it2.next();
			sum += 1;

		}
		out.println("���� : " + sum);
		out.println("��� : " + (float) sum / set2.size());
		out.println("�ְ����� : "+Collections.max(v));		
		out.println("�������� : "+Collections.min(v));		
		
	}

}
