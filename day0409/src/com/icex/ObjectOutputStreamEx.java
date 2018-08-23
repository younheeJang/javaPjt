package com.icex;

import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) {

		ObjectOutputStream oos = null;
		try {
			// �޸𸮿� ������ ��ü�� ����ȭ�ؼ� ��Ʈ���� ���� ����� �� �ִ� ObjectOutputStream
			// ��ü�� ������

			oos = new ObjectOutputStream(new FileOutputStream("c:/obj.sav"));
			// ObjectOutputStream�� ���ؼ� ����ȭ �� �� ���Ϸ� ��ϵ� Data ��ü ����
			// Data Ŭ������ �ݵ�� Serializable�� �����Ǿ� �־�� ��

			Data data = new Data();
			// ������ ��ü�� ������

			data.setNo(33);
			data.setName("�̼���");
			data.setMail("lee@naver.com");

			// ObjectOutputStream�� ��ü�� ����ȭ�Ͽ� ��Ʈ���� ���� ����� �� �ִ� writeObject()��
			// ���� �����
			oos.writeObject(data);

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
