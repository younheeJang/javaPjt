package com.ioexam;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		File directory = new File("c:/windows");
		if (directory.exists()) {
			// ���丮�� �����ϴ����� ���θ� �˾ƺ��� �Լ�
			if (directory.isDirectory()) {
				// ���丮������ ���θ� Ȯ��
				String[] fileNameList = directory.list();
				for (String fileName : fileNameList) {
					System.out.println("�����̸�:" + fileName);
				}

			}

		}
	}

}
