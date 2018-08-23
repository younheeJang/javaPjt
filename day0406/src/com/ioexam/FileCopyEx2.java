package com.ioexam;
import java.io.*;
public class FileCopyEx2 {

	public static void main(String[] args) {
	
				
				System.out.println("파일 복사 시작......");
				long start = System.currentTimeMillis();
				//시스템의 현재 시간의 저장
				
				FileInputStream src = null;
				FileOutputStream dest = null;
				
				
				
				try {
				
					//원본에 있는 파일을 읽기 위한 FileInputStream 객체를 생성함
					
					src = new FileInputStream (new File("c:/windows win.ini"));
					//복사본 파일을 생성하기 위한 FileOutputStream 객체를 생성함
					dest = new FileOutputStream (new File("c:/dest.txt"));
					//FileInputStream 을 통해서 읽어들인 값을 저장할 변수 
				  
					int length = 0;
				    
				byte[] buffer = new byte[1024*8];
				//8키로바이트 크기의 임시기억공간을 선언
				
				
				//인픗스트림을 통해서 읽어들인 데이터를 임시 저장소인 버퍼에 임시저장한다.
				//버퍼에 쌓고, 데이터의 개수를 렝스에 저장한다.
				
				
				while((length = src.read(buffer))!= -1) {
				
					//아우숫스트링을 통해서 버퍼에쌓여있는 데이터를 렝스만큼 파일에 기록함
					
					dest.write(buffer, 0, length);
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

		
		

