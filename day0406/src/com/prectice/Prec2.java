package com.prectice;
//파일 임포트
import java.io.File;
public class Prec2 {

	public static void main(String[] args) {
     //윈도우즈를 디렉토리라는 파일 변수로 
		File directory = new File("c:/windows");
		//만약 윈도우즈가 존재한다면
		if(directory.exists()) {
			//만약 윈도우즈가 디렉터리라면
			if(directory.isDirectory()) {
				//스트링 배열을 잡아주고, 윈도우즈의 리스트 메소드를 불러서 배열 안에 리스트를 넣어준다.
				String [] arr = directory.list();
				//포문으로 배열의 인덱스를 스트링 배열의 수만큼 돌려서 윈도우즈 내 파일들의 이름을 출력해준다.
				for(int i = 0; i <arr.length; i ++) {
					System.out.println("이름 출력:"+arr[i]);
				}
				
			}
			
		}
		
		
		

	}

}
