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
			System.out.println("���� ��� ��");
			io.printStackTrace();
		}	
		
		
		
	try {
		
		System.out.println("���� �غ� ��");
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
