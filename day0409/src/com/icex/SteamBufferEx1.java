package com.icex;

import java.io.*;

public class SteamBufferEx1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		
		sb.append("1.8");
		//�߰�
		//����� Java1.8�� ���´�.
		System.out.println(sb);
		
		//���� �ε��������� ���� �����ε�����ġ���� �� �ε��� ������ ���ڿ� ����
		sb.delete(2, 3);
		//���� �ε��� ��ġ������ ����
		System.out.println(sb);
	
		//���ڿ� ���� ���̿� ����
		sb.insert(3, "A1");
		System.out.println(sb);
	
		
		//���ۺ��� ������ �ش� �޼ҵ尡 ����� ������ �������ִµ�, �� �� �ε����� �ش� ����
		sb.replace(4, 7, "����");
		System.out.println(sb);
	
		sb.reverse();//���������� ������
		System.out.println(sb);
	
	
	}
}
