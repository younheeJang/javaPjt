package com.icex;

import java.io.*;

public class FileWriteEx {

	public static void main(String[] args) {
		// ��ǲ�� ��Ʈ���� ���� ��°� �޸� ��ü������ ���� �������� �ٷ� �Է��� ����
		FileWriter writer = null;
		try {
			// ���Ͽ� �ѹ��� ������ ����� �� �ִ� FileWriter ��ü ����
			writer = new FileWriter("c:/song.txt");

			// writer:������ ��ü�� �ٷ� ���ڿ��� ����� �� ����
			String s = "�б� ���� ������ � ������";

			writer.write(s);

			/*
			 * �ѱ��� ������ �а� �� �� �ִ� Reader, Writer�迭�� ��Ʈ���� ���������� ���۸� �����ϰ� ���� ����� ���۴� ���۰� ����á��
			 * ���� ��Ʈ���� ���� ������ flush()�� ���۰� �������� �ʾƵ� ���� �ϴ� �޼ҵ���
			 * 
			 * 
			 */
			writer.flush();
			// ������ ����

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (writer != null)
					writer.close();

			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
