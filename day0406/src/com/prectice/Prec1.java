package com.prectice;

import java.io.File;


public class Prec1 {

	public static void main(String[] args) {

		File f = new File("c:/abc.txt");
		
	System.out.println("���� ����"+f.isFile()+"\n"
			+ "���͸� ����"+f.isDirectory()+"\n"
			+ "��� ���"+f.getPath()+"\n"
			+ "���� ���"+f.getAbsolutePath()+"\n"
			+ "���͸� Ȥ�� ���� �̸�"+f.getName()+"\n"
			+ "������ ����"+f.length()+"\n"
			+ "���� ���� ��¥"+f.lastModified());
		
	}

	
	
}
