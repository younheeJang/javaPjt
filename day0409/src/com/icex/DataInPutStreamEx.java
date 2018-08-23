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
			 * DataInputStream은 기본 자료형을 유지한 채로 저장된 값을 읽어들일 수 있는 read() 메소드가 존재함
			 * 
			 * 읽어들일 때는 반드시 (*****) 인트 더블 스트링의 순서) 기록한 순서대로 읽어와야 함
			 * 
			 */
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i값:" + i);
			System.out.println("d값:" + d);
			System.out.println("s값:" + s);
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
