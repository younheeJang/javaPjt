package com.icex;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {

		ObjectInputStream ois = null;

		try {
			// ���Ͽ� ����� ��ü�� �о���̱� ���� ObjectInputStream��ü ����

			ois = new ObjectInputStream(new FileInputStream("c:/obj.sav"));
			// ObjectInputStream���κ��� �о���� ����ȭ�� ��ü�� ������ȭ�ؼ� ��ü�� ������ �� ����
			// ������ȭ�� �� �ʿ��� Ŭ���� ������ ã�� ������ ��� ����ó�� �߻���

			Data data = (Data) ois.readObject();
			System.out.println("��ȣ:" + data.getNo());
			System.out.println("�̸�:" + data.getName());
			System.out.println("����:" + data.getMail());
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
