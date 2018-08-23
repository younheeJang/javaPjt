package com.ioexam;

import java.io.*;

public class FileCopyEx {

	public static void main(String[] args) {
	
		System.out.println("파일 복사 시작......");
		long start = System.currentTimeMillis();
		//시스템의 현재 시간의 저장
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		
		
		try {
		
			//원본에 있는 파일을 읽기 위한 FileInputStream 객체를 생성함
			
			src = new FileInputStream (new File("c:/fileout.txt"));
			//복사본 파일을 생성하기 위한 FileOutputStream 객체를 생성함
			dest = new FileOutputStream (new File("c:/dest.txt"));
			//FileInputStream 을 통해서 읽어들인 값을 저장할 변수 
		    int readValue = 0;
		    //FileInputStream 의 read()메소드를 통해서 읽어들인 
		    //값을 변수 readValue에 저장함
		    while((readValue = src.read()) != -1) {
		    	//readValue에 저장된 값을 FileOutputStream에 write() 메소드를 통해서 파일에 씀
		    	dest.write(readValue);
		    
		    
		    
		    }
			
		} catch (FileNotFoundException fe) {

		} catch (IOException ii ) {
			ii.printStackTrace();
		}  finally {

			try {
			if(dest != null)dest.close();	
			} catch (IOException ii ) {
			 ii.printStackTrace();	
			}	try {
				if(src != null)src.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		} 

 
		long end = System.currentTimeMillis();
		long copyTime =(end - start)/1000;
		
	System.out.println("복사에 걸린 시간"+copyTime+"초");
	}
	

}
