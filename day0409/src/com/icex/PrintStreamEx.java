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

			ps.println("홍길동");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
			//프린트스트림은 위와 같이 모든 자료형이 적용된다.
			//스트링 인트 불린 캐릭터 형
			
			
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
	
