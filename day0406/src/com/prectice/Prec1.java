package com.prectice;

import java.io.File;


public class Prec1 {

	public static void main(String[] args) {

		File f = new File("c:/abc.txt");
		
	System.out.println("파일 여부"+f.isFile()+"\n"
			+ "디렉터리 여부"+f.isDirectory()+"\n"
			+ "상대 경로"+f.getPath()+"\n"
			+ "절대 경로"+f.getAbsolutePath()+"\n"
			+ "디렉터리 혹은 파일 이름"+f.getName()+"\n"
			+ "파일의 길이"+f.length()+"\n"
			+ "최종 수정 날짜"+f.lastModified());
		
	}

	
	
}
