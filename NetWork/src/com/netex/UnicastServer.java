package com.netex;
import java.io.*;
import java.net.*;
public class UnicastServer {

	BufferedReader br;/* = new BufferedReader(null);*/
	BufferedWriter bw ;/*= new BufferedWriter(null);*/
	ServerSocket server ;/*= new ServerSocket();*/
	
	public UnicastServer() {
		
	try {
			server = new ServerSocket(6000);
		} catch (IOException io) {
			System.out.println("서버 사용 중");
			io.printStackTrace();
		}	
		
		
		
	try {
		
		System.out.println("서버 준비 중");
		Socket socket = server.accept();

		
		
		
		while(true) {
			
			
			
			
		}
		
	} catch (IOException io) {
		io.printStackTrace();
		
	}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new UnicastServer() ;
	}


}
