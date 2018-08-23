package com.netex;
import java.io.*;
import java.net.*;
public class ServerSocketEx {

	
	public static void main(String[] args) {
		
		//접속자를 받아들이기 위해 ServerSocket이 필요
		try {
			ServerSocket ss = new ServerSocket(5000);

				while(true) {
					//클라이언트가 접속할 때까지 무한정 기다림
					//클라이언트가 접속하게 되면 클라이언트의 ip를 알아냄
					Socket s = ss.accept();
					InetAddress iaddr = s.getInetAddress();
					
					String user_ip = iaddr.getHostAddress();
					System.out.println(user_ip+"님이 접속하셨습니다.");
				}
		} catch (IOException io) {
			io.printStackTrace();
		}

		
	}
}
