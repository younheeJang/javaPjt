package com.netex;
import java.io.*;
import java.net.*;
public class ServerSocketEx {

	
	public static void main(String[] args) {
		
		//�����ڸ� �޾Ƶ��̱� ���� ServerSocket�� �ʿ�
		try {
			ServerSocket ss = new ServerSocket(5000);

				while(true) {
					//Ŭ���̾�Ʈ�� ������ ������ ������ ��ٸ�
					//Ŭ���̾�Ʈ�� �����ϰ� �Ǹ� Ŭ���̾�Ʈ�� ip�� �˾Ƴ�
					Socket s = ss.accept();
					InetAddress iaddr = s.getInetAddress();
					
					String user_ip = iaddr.getHostAddress();
					System.out.println(user_ip+"���� �����ϼ̽��ϴ�.");
				}
		} catch (IOException io) {
			io.printStackTrace();
		}

		
	}
}
