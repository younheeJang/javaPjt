package com.prectice;

import java.io.*;
import static java.lang.System.out;

public class Prec3 {

	public static void main(String[] args) throws IOException {

		File file = new File("c:/Hello.txt");

		if (file.exists()) {
			out.println("���� �̸�:" + file.getName());
		} else {
			if (file.createNewFile()) {
				out.println("���ο� ������ �����Ǿ����ϴ�.");
			}
		}
		// ==================================================

		// ���͸� ����

		File f1 = new File("c:/pk");
		if (!f1.exists()) {

			f1.mkdirs();

		} else {

			out.println("���͸� �̸�:" + f1.getPath());

		}

		// =====================================================

		// ���� �� ���͸� ����

		File f2 = new File("c:/abc.txt");

		if (f2.exists()) {

			f2.delete();

			out.println("���� �� ���͸� ���� �Ϸ�");
		}

		// ========================================================

		// ���� �� ���͸� �̸� ����

		File a = new File("c:/Hello.txt");
		File dest = new File("c:/pk/dest.txt");
		File dest2= new File("c:/pk/dest2.txt");

		if (a.exists()) {
        a.renameTo(dest);
		a.renameTo(dest2);			
			
		}

		if (f2.isDirectory()) {

			String[] str = f2.list();
			for (int i =0; i <str.length; i++) {

				out.println(str);
			}
		}
/*
		//���� �� ���丮 �̸� ����
		File src = new File("c:/Hello.txt");
		File dest = new File("c:/pk/dest.txt");
		File dest2 = new File("c:/pk/dest2.txt");
		
		if(src.exists()) {
						
			src.renameTo(dest);//��ζ�� ������ ����Ʈ�� �ٲ� ���̰�
			src.renameTo(dest2);//��ζ�� ������ ����Ʈ�� �ٲ� �� ����Ʈ ���� ���� ������ ���̴�.
			//����Ʈ�� ����Ʈ ���� ������ ����.
			
			
		}
		
		if(f2.isDirectory()) {
			String dir[]= f2.list();
			for(String dirs : dir)
			{
				System.out.println(dirs);
				
				
				
			}			
			
		}*/
		
		
		
	}

}
