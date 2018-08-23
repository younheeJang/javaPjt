package com.ioexam;
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fis = null;
		//파일을 읽어들일 떄 저장할 수 있는 공간 100바이트
		//파일을 출력할 때 저장할 수 있는 공간 100바이트
		byte read[] = new byte[100];
		byte console[]=new byte[100];
		
		
		try {
			System.out.print("파일명:");
			System.in.read(console);
			//파일을 저장한다.
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
