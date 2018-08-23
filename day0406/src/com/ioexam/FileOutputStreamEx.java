package com.ioexam;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("c:\\fileout.txt");
			String message = "Á¹Áö¸¶¼¼¿ä";
			fos.write(message.getBytes());
			fos.close();
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		} finally {
			
			try {
				if(fos !=null)fos.close();
			} catch (IOException ii) {
				ii.printStackTrace();
		    }

		}
	}
}
