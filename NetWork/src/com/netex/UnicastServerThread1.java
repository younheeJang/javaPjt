package com.netex;
import java.net.*;
import java.io.*;
public class UnicastServerThread1 extends Thread{

	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	public UnicastServerThread1(Socket socket) {
	
		this.socket = socket;
	}

	@Override
	public void run() {
	
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
					while(true) {
						
						String message = br.readLine();
						System.out.println(message);
						
						bw.write(message+"\n");
						bw.flush();
					}
					
		} catch (IOException io) {
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("["+address+"]"+"is not conneted...");
			System.out.println("Try is again...");
		}
	}


}
