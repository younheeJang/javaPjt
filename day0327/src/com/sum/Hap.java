package com.sum;

import java.util.*;

public class Hap {

	// �Է�

	private int su;// �Է� ���� ���� ������ ����

	public void input() {
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.print("���� �Է�: ");// �Է��ϼ���
			su = scanner.nextInt();// �Է� �ޱ�

		} while (su < 1 || su > 100);
		// ���ǿ� �´� ���� ������ �ٽ� �Է��ϰԲ� 1~100�� ���� �Է� ������ ���� �޼ҵ�� �Ѿ�
		// ������ ó��

	}

	// �Է¹��� ���� sum �޼ҵ忡 �־ ������
	// ���� �� ó��
	public int sum() {

		int s = 0; // ����� ������ ����

		// 10�� ���� 10�� �� ������ �����ϸ� ���� ��
		for (int i = 1; i <= su; i++) {

			s += i;
		}

		return s;
	}

	// ���

	public void write(int s) {
//sum()�޼ҵ忡�� ����� ���Ϲ޾� write()���� ���ڰ����� �޾Ƽ� ó���Ѵ�.
		System.out.println("1~"+su+"������ ��:"+s);
		
	}

}
