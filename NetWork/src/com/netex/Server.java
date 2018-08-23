package com.netex;
import java.io.*;
import java.net.*;
public class Server {


	ServerSocket serverSocket = null;
	  
	  
	public Server() {
		try {
			serverSocket = new ServerSocket(5000);
			
		} catch(IOException io){
			System.out.println("This port number is already used...");
			System.exit(0);
			
		} try {
			
			while(true) {
				
				System.out.println("Server Socket is created...");
				
				Socket socket = serverSocket.accept();
			
				UnicastServerThread1 thread = new UnicastServerThread1(socket);
			
				thread.start();
			}
		}catch(IOException io1) {
			io1.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
