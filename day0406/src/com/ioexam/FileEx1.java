package com.ioexam;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {

		// 임포트로 파일 만든 후 메인에서 파일의 객체를 생성한다.
		File f = new File("c:\\abc.txt");// 파일 위치와 파일명
		/*
		 * File f = new File("c:/abc.txt");
		 */

	
		System.out.println("파일인지 여부 : " + f.isFile());
		System.out.println("디렉토리인지 여부 : " + f.isDirectory());
		// 파일인지 디렉토리인지를 위와 같이 알아볼 수 있음
	
		System.out.println("상대경로: " + f.getPath());
		System.out.println("절대경로: " + f.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일 이름: " + f.getName());
		System.out.println("파일의 길이: " + f.length());
		System.out.println("파일최종 수정날짜: " + f.lastModified());


	
	
	}

}
