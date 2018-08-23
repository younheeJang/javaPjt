package com.ioexam;
import java.io.*;
public class FileCopyEx2 {

	public static void main(String[] args) {
	
				
				System.out.println("���� ���� ����......");
				long start = System.currentTimeMillis();
				//�ý����� ���� �ð��� ����
				
				FileInputStream src = null;
				FileOutputStream dest = null;
				
				
				
				try {
				
					//������ �ִ� ������ �б� ���� FileInputStream ��ü�� ������
					
					src = new FileInputStream (new File("c:/windows win.ini"));
					//���纻 ������ �����ϱ� ���� FileOutputStream ��ü�� ������
					dest = new FileOutputStream (new File("c:/dest.txt"));
					//FileInputStream �� ���ؼ� �о���� ���� ������ ���� 
				  
					int length = 0;
				    
				byte[] buffer = new byte[1024*8];
				//8Ű�ι���Ʈ ũ���� �ӽñ������� ����
				
				
				//���ƽ�Ʈ���� ���ؼ� �о���� �����͸� �ӽ� ������� ���ۿ� �ӽ������Ѵ�.
				//���ۿ� �װ�, �������� ������ ������ �����Ѵ�.
				
				
				while((length = src.read(buffer))!= -1) {
				
					//�ƿ����Ʈ���� ���ؼ� ���ۿ��׿��ִ� �����͸� ������ŭ ���Ͽ� �����
					
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
				
			System.out.println("���翡 �ɸ� �ð�"+copyTime+"��");
			}
			

		}

		
		

