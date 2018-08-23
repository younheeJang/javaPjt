package com.icex;

import java.io.*;

public class BufferedWriteEx {

	public static void main(String[] args) {

		FileWriter fw = null;

		BufferedWriter bw = null;

		try {

			fw = new FileWriter("c:/hello.txt");
			bw = new BufferedWriter(fw);

			bw.write("���ѹα�");
			bw.newLine();//������ ����ؼ� �߰��� �� �� �ִ�
			bw.write("����ؿ�!!!!" + System.getProperty("line.separator")); //���� ���۷����ͷ� ����
			bw.write("�׸��� �ݰ�����...");
			bw.flush();//���۸� ����ش�.

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}

			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
			}

		}
	}
}
