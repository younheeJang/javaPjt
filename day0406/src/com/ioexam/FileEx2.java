package com.ioexam;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		File directory = new File("c:/windows");
		if (directory.exists()) {
			// 디렉토리가 존재하는지의 여부를 알아보는 함수
			if (directory.isDirectory()) {
				// 디렉토리인지의 여부를 확인
				String[] fileNameList = directory.list();
				for (String fileName : fileNameList) {
					System.out.println("파일이름:" + fileName);
				}

			}

		}
	}

}
