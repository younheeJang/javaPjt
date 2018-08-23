package com.icex;

import java.io.*;

public class DataInPutStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("c:/data.sav");
			dis = new DataInputStream(fis);
			/*
			 * DataInputStream�� �⺻ �ڷ����� ������ ä�� ����� ���� �о���� �� �ִ� read() �޼ҵ尡 ������
			 * 
			 * �о���� ���� �ݵ�� (*****) ��Ʈ ���� ��Ʈ���� ����) ����� ������� �о�;� ��
			 * 
			 */
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i��:" + i);
			System.out.println("d��:" + d);
			System.out.println("s��:" + s);
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (fis != null)
					fis.close();

			} catch (IOException io) {
				io.printStackTrace();
			}
			try {
				if (dis != null)
					dis.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
