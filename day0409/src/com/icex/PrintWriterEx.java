package com.icex;

import java.io.*;

public class PrintWriterEx {

	public static void main(String[] args) {

		PrintWriter pw = null;
		FileOutputStream fos = null;

		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("c:\\printwriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);

			pw.println("�ȳ��ϼ���");
			pw.println("�� �����׿�");
			pw.println(100.0);
			pw.println(new Boolean(true));//Ŭ������ �̿�, ��ü�� ���� ����
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (fos != null) fos.close();
				if (bos != null) bos.close();
				if (pw != null)	pw.close(); 
			}	
			catch (IOException io) 
			{
				io.printStackTrace();
			}
			
			
		}
	}

}




/*try {
	if (fos != null) fos.close();
try {	if (bos != null) bos.close();
try {	if (ps != null)	ps.close(); 
}	catch (IOException io) {
	io.printStackTrace();
}
*/