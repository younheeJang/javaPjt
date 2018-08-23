package com.prectice;

import java.io.*;
import static java.lang.System.out;

public class Prec3 {

	public static void main(String[] args) throws IOException {

		File file = new File("c:/Hello.txt");

		if (file.exists()) {
			out.println("파일 이름:" + file.getName());
		} else {
			if (file.createNewFile()) {
				out.println("새로운 파일이 생성되었습니다.");
			}
		}
		// ==================================================

		// 디렉터리 생성

		File f1 = new File("c:/pk");
		if (!f1.exists()) {

			f1.mkdirs();

		} else {

			out.println("디렉터리 이름:" + f1.getPath());

		}

		// =====================================================

		// 파일 및 디렉터리 삭제

		File f2 = new File("c:/abc.txt");

		if (f2.exists()) {

			f2.delete();

			out.println("파일 및 디렉터리 삭제 완료");
		}

		// ========================================================

		// 파일 및 디렉터리 이름 변경

		File a = new File("c:/Hello.txt");
		File dest = new File("c:/pk/dest.txt");
		File dest2= new File("c:/pk/dest2.txt");

		if (a.exists()) {
        a.renameTo(dest);
		a.renameTo(dest2);			
			
		}

		if (f2.isDirectory()) {

			String[] str = f2.list();
			for (int i =0; i <str.length; i++) {

				out.println(str);
			}
		}
/*
		//파일 및 디렉토리 이름 변경
		File src = new File("c:/Hello.txt");
		File dest = new File("c:/pk/dest.txt");
		File dest2 = new File("c:/pk/dest2.txt");
		
		if(src.exists()) {
						
			src.renameTo(dest);//헬로라는 파일이 데스트로 바뀐 것이고
			src.renameTo(dest2);//헬로라는 파일이 데스트로 바뀐 후 데스트 투는 새로 생성된 것이다.
			//데스트와 데스트 투는 내용이 같다.
			
			
		}
		
		if(f2.isDirectory()) {
			String dir[]= f2.list();
			for(String dirs : dir)
			{
				System.out.println(dirs);
				
				
				
			}			
			
		}*/
		
		
		
	}

}
