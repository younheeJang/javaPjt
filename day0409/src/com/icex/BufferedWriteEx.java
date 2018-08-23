package com.icex;

import java.io.*;

public class BufferedWriteEx {

	public static void main(String[] args) {

		FileWriter fw = null;

		BufferedWriter bw = null;

		try {

			fw = new FileWriter("c:/hello.txt");
			bw = new BufferedWriter(fw);

			bw.write("대한민국");
			bw.newLine();//라인을 계속해서 추가해 쓸 수 있다
			bw.write("사랑해요!!!!" + System.getProperty("line.separator")); //라인 세퍼레이터로 개행
			bw.write("그리고 반가워요...");
			bw.flush();//버퍼를 비워준다.

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}

			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
			}

		}
	}
}
