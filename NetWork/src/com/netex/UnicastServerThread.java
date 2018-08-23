package com.netex;

import java.io.*;
import java.net.*;

public class UnicastServerThread extends Thread {

	BufferedReader br; /* = new BufferedReader(null); */
	BufferedWriter bw; /* = new BufferedWriter(null); */
	Socket socket;

	
	
	
	@Override
	public void run() {
	
		try {
			br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
			
			//메시지 수신
			String msg = br.readLine();
			
			
			
			
			//메시지 전송
			bw.write(msg); 
			
		} catch (IOException io) {
			io.printStackTrace();
		}
	


	}

	public UnicastServerThread() {

	}

	public static void main(String[] args) {
		new UnicastServerThread();

	}

}
