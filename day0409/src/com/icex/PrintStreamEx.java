package com.icex;

import java.io.*;

public class PrintStreamEx {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {

			fos = new FileOutputStream("c:/hello2.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true);

			ps.println("ȫ�浿");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
			//����Ʈ��Ʈ���� ���� ���� ��� �ڷ����� ����ȴ�.
			//��Ʈ�� ��Ʈ �Ҹ� ĳ���� ��
			
			
		} catch (IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if (fos != null) fos.close();
				if (bos != null) bos.close();
				if (ps != null)	ps.close(); 
			}	
			catch (IOException io) 
			{
				io.printStackTrace();
			}

		}
			
	
			
			
			}

	}
	
