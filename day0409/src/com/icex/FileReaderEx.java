package com.icex;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {

		// �ѹ��ھ� �о���̴� �޼ҵ�

		FileReader reader = null;

		try {
			// ���Ϸκ��� �ѹ��� ������ �о�� �� �ִ� reader ��ü ����
			reader = new FileReader("c:/song.txt");

			// ��Ʈ���� ���� �о���� �����ڵ� ���� ������ ����
			int readValue = 0;
			// ���Ϲ��� ���� �����ڵ� ���� ���� ������ �о���̴ٰ�
			while ((readValue = reader.read()) != -1) {
				System.out.print((char) (readValue));
				// ��Ʈ������ ����޾����Ƿ� ĳ���������� ������ȯ�ؼ� ����� �ش�.
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (reader != null)
					reader.close();

			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}