package com.ioexam;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {

		// ����Ʈ�� ���� ���� �� ���ο��� ������ ��ü�� �����Ѵ�.
		File f = new File("c:\\abc.txt");// ���� ��ġ�� ���ϸ�
		/*
		 * File f = new File("c:/abc.txt");
		 */

	
		System.out.println("�������� ���� : " + f.isFile());
		System.out.println("���丮���� ���� : " + f.isDirectory());
		// �������� ���丮������ ���� ���� �˾ƺ� �� ����
	
		System.out.println("�����: " + f.getPath());
		System.out.println("������: " + f.getAbsolutePath());
		System.out.println("���丮 Ȥ�� ���� �̸�: " + f.getName());
		System.out.println("������ ����: " + f.length());
		System.out.println("�������� ������¥: " + f.lastModified());


	
	
	}

}
