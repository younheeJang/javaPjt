package com.icex;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״��
		// ��Ʈ���� ���ؼ� ����� �� ����
		// ��Ʈ���� ���Ǵ� �ڷ���
		// readBoolean(), writeBoolean(boolean b), readInt(), writeInt(int v),
		// readUTF(), writeUTF(String s) ��

		// DataOutputStream�� �ٸ� ��Ʈ���� ���ؼ�
		// Ư�� Device�� ������ �� ����

		DataOutputStream dos = null;

		FileOutputStream fos = null;

		
		try {
			fos = new FileOutputStream ("c:/data.sav");
			//c����̺�� �ٷ� ������ ������.
			
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "����ؿ� �ڹ� !!!";
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}finally {
			
			
			try {
				if(dos != null) dos.close();
			} catch (IOException io) {
				io.printStackTrace();
			}		
		}
	}
}
