package com.icex;

import java.io.*;

public class BufferedReaderEX {

	public static void main(String[] args) {

		FileInputStream fis = null;

		InputStreamReader isr = null;

		BufferedReader br = null;

		try {
			fis = new FileInputStream("c:/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			// �Ѷ��ξ� �о���� ���ڿ��� ������ ���� ����
			String str = null;
			// readLine() ���๮�ڸ� ������ ���๮�� ���������� ���ڿ��� ��ȯ�ϰ� ��Ʈ�� ������ ���� ��ȯ��
			while ((str = br.readLine()) != null) {

				System.out.println(str);

			}

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (br != null)	br.close();} catch (IOException io) {}
			try {	if (isr != null) isr.close();} catch (IOException io) {}
			try {	if (fis != null)	fis.close();} catch (IOException io) {}

		}

	}

}
