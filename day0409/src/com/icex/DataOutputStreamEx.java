package com.icex;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream은 기본 자료형 타입 그대로
		// 스트림을 통해서 기록할 수 있음
		// 스트림에 사용되는 자료형
		// readBoolean(), writeBoolean(boolean b), readInt(), writeInt(int v),
		// readUTF(), writeUTF(String s) 등

		// DataOutputStream은 다른 스트림을 통해서
		// 특정 Device와 연결할 수 있음

		DataOutputStream dos = null;

		FileOutputStream fos = null;

		
		try {
			fos = new FileOutputStream ("c:/data.sav");
			//c드라이브로 바로 파일을 내보냄.
			
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "사랑해요 자바 !!!";
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
