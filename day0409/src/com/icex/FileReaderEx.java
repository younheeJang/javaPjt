package com.icex;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {

		// 한문자씩 읽어들이는 메소드

		FileReader reader = null;

		try {
			// 파일로부터 한문자 단위로 읽어올 수 있는 reader 객체 생성
			reader = new FileReader("c:/song.txt");

			// 스트림을 통해 읽어들인 유니코드 값을 저장할 변수
			int readValue = 0;
			// 와일문을 통해 유니코드 값이 없을 때까지 읽어들이다가
			while ((readValue = reader.read()) != -1) {
				System.out.print((char) (readValue));
				// 인트형으로 저장받았으므로 캐릭터형으로 강제변환해서 출력해 준다.
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (reader != null)
					reader.close();

			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}