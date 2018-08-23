package com.ioexam;

import java.io.*;

public class FileCopyEx {

	public static void main(String[] args) {
	
		System.out.println("���� ���� ����......");
		long start = System.currentTimeMillis();
		//�ý����� ���� �ð��� ����
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		
		
		try {
		
			//������ �ִ� ������ �б� ���� FileInputStream ��ü�� ������
			
			src = new FileInputStream (new File("c:/fileout.txt"));
			//���纻 ������ �����ϱ� ���� FileOutputStream ��ü�� ������
			dest = new FileOutputStream (new File("c:/dest.txt"));
			//FileInputStream �� ���ؼ� �о���� ���� ������ ���� 
		    int readValue = 0;
		    //FileInputStream �� read()�޼ҵ带 ���ؼ� �о���� 
		    //���� ���� readValue�� ������
		    while((readValue = src.read()) != -1) {
		    	//readValue�� ����� ���� FileOutputStream�� write() �޼ҵ带 ���ؼ� ���Ͽ� ��
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
		
	System.out.println("���翡 �ɸ� �ð�"+copyTime+"��");
	}
	

}
