package com.icex;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {

		ObjectInputStream ois = null;

		try {
			// 파일에 저장된 객체를 읽어들이기 위해 ObjectInputStream객체 생성

			ois = new ObjectInputStream(new FileInputStream("c:/obj.sav"));
			// ObjectInputStream으로부터 읽어들인 직렬화된 객체를 역직렬화해서 객체를 생성할 수 있음
			// 역직렬화할 때 필요한 클래스 파일을 찾지 못했을 경우 예외처리 발생함

			Data data = (Data) ois.readObject();
			System.out.println("번호:" + data.getNo());
			System.out.println("이름:" + data.getName());
			System.out.println("메일:" + data.getMail());
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
