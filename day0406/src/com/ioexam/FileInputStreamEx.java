package com.ioexam;
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fis = null;
		//������ �о���� �� ������ �� �ִ� ���� 100����Ʈ
		//������ ����� �� ������ �� �ִ� ���� 100����Ʈ
		byte read[] = new byte[100];
		byte console[]=new byte[100];
		
		
		try {
			System.out.print("���ϸ�:");
			System.in.read(console);
			//������ �����Ѵ�.
			String file = new String(console).trim();
			fis = new FileInputStream(file);
		fis.read(read, 0, read.length);
			


			System.out.println(new String(read).trim());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException ee) {
			ee.printStackTrace();
		}finally {
			
			try {
				
				if(fis != null)fis.close();
				
				
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			
		}
		
		
	}

}
