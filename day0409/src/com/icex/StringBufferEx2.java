package com.icex;

import java.io.*;
import static java.lang.System.out;
public class StringBufferEx2 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("1234567890");
		// ��Ʈ�� ���� ���� �⺻���� ������ ũ��� 16 �׸��� ��ü �ȿ� ����ִ� ���ڴ� 10���̹Ƿ� ��ü �뷮�� 26�̴�.

		System.out.println(sb.capacity());
		// ������ �뷮

		System.out.println(sb.length());
		// ���ۿ� ����� ���ڿ��� ����

		out.println();
		out.println("���ڿ� �߰� �� �뷮 �� ���ڿ��� ���� ��");
		
		// �߰�
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());
		// ���� ���� �뷮�� �뷮�� 26�� +2�� ��
		System.out.println(sb.length());

		sb.append("abcdefghijklmnopqrstuvwxyzabcdefgh");// �뷮�� �þ���� ���� 54�� �ʰ��ؾ� �Ѵ�.
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		sb.delete(1, 50);
		System.out.println(sb.capacity());//�ѹ� �þ ������ "�뷮"�� ���ڿ��� ���̸� ���� �����Ѵٰ� �ص�
		System.out.println(sb.length());//�پ���� �ʴ´�.

		
	}
}
