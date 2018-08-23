package com.ioexam;

import java.io.File;
//����, ���丮 ���� �� ����
import java.io.IOException;
import static java.lang.System.out;
public class FileEx3 {

	public static void main(String[] args) throws IOException {

		// ���� ����
		File f1 = new File("c:/Hello.txt");
		// �� ���� ����

		if (f1.exists()) {

			System.out.println("���� �̸�:" + f1.getName());

		} else {

			if (f1.createNewFile()) {

				System.out.println("���ο� ������ ��������ϴ�.");
			}

		}

		// ���丮 ����

		File f2 = new File("c:/pk");
		if (!f2.exists()) {
			f2.mkdirs();

		}

		else {
			System.out.println("���丮�̸�:" + f2.getPath());
		}

		// ���� �� ���丮 ����
		File f3 = new File("c:/abc.txt");
		if (f3.exists()) {
			f3.delete();
			
			out.println("���� �� ���͸� ���� �Ϸ�");
			// ����Ʈ��� �޼ҵ带 Ȱ���Ͽ� ������ ������ �� �ִ�.

		}

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
			
		}
		
	}

}
// ������ ��������鼭 �ͼ����� �߻��� �� �����Ƿ� ���ο� Ʈ�ο��� �ͼ����� �������,
// �ƴϸ� Ʈ���� ĳġ���� ����� �ͼ����� ������ ��� �Ѵ�.
