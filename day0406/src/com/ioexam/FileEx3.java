package com.ioexam;

import java.io.File;
//파일, 디렉토리 생성 및 삭제
import java.io.IOException;
import static java.lang.System.out;
public class FileEx3 {

	public static void main(String[] args) throws IOException {

		// 파일 생성
		File f1 = new File("c:/Hello.txt");
		// 빈 파일 생성

		if (f1.exists()) {

			System.out.println("파일 이름:" + f1.getName());

		} else {

			if (f1.createNewFile()) {

				System.out.println("새로운 파일을 만들었습니다.");
			}

		}

		// 디렉토리 생성

		File f2 = new File("c:/pk");
		if (!f2.exists()) {
			f2.mkdirs();

		}

		else {
			System.out.println("디렉토리이름:" + f2.getPath());
		}

		// 파일 및 디렉토리 삭제
		File f3 = new File("c:/abc.txt");
		if (f3.exists()) {
			f3.delete();
			
			out.println("파일 및 디렉터리 삭제 완료");
			// 딜리트라는 메소드를 활용하여 파일을 지워줄 수 있다.

		}

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
			
		}
		
	}

}
// 파일이 만들어지면서 익셉션이 발생할 수 있으므로 메인에 트로우즈 익셉션을 만들던지,
// 아니면 트라이 캐치문을 사용해 익셉션을 정리해 줘야 한다.
