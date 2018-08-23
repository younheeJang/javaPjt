package com.stack;

import java.util.*;
import static java.lang.System.out;

public class QueueEx1 {
	// �۽�Ʈ �� �۽�Ʈ �ƿ� ��� ť.
	// ���� �Ա��� ������ �Ա��� �޶� ���� �Ա��� �ݴ�������� ���� �� �ִ�. �ᱹ���� ���� ������� �����͵��� ��µ� �� �ְ� �ȴ�.

	private static final String colors[] = { "����", "���", "���", "û��", "����", "���λ�" };

	public static void main(String[] args) { //���� ���� ���� �ƴ� ���� �� 
		// ť �������� ��ũ�帮��Ʈ��� �޼ҵ尡 �ʿ���
		Queue<String> qu = new LinkedList<String>();

		for (String str : colors) {

			qu.offer(str);// ������ �߱�
			// ť�� ���۶�� �޼ҵ带 Ȱ���Ͽ� ������ �Է�
		}
		// ť�� ��ũ�帮��Ʈ�� ��ü ������ ���ְ� �Է��� ���� �޼ҵ�, ��ũ �޼ҵ�� ��ġ���̸�, �ش� ��ġ���� ���� �ƴҶ�����
		//���ư��� �ݺ����� Ȱ���� �� �ִ�. 
		while (qu.peek() != null) {
			/*
			 * peek(): ��ũ �޼ҵ�� ���� ���ʿ� �ִ� �����͸� ����Ų��. ù��° ������
			 * 
			 * offer(): ���� �޼ҵ�� �����͸� ����(�߰�)
			 *
			 * poll() : ù��° �����͸� ��� �� ����� ��ġ�� ������
			 */
			out.println(qu.poll());

		}

	}
	

}
