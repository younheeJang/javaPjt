package com.netex;
import java.net.*;
import java.io.*;
public class Client {

	Socket socket = null;
	BufferedReader brInput = null;
	BufferedWriter bwOutput = null;
	BufferedReader brKey = null;
	
	public Client() {
	
		try {
			socket = new Socket("localhost", 5000);
			
		} catch (UnknownHostException ue) {
			System.out.println("Server is not found...");
			System.exit(0);
		} catch (IOException io) {
			System.out.println("Server cannot be connected...");
			System.exit(0);
		}
		
		try {
			brKey = new BufferedReader(new InputStreamReader(System.in));
			bwOutput = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()));
			brInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				System.out.println("SEND :");
				String message = brKey.readLine();
				
				bwOutput.write(message+"\n");
				bwOutput.flush();
				
				String getMessage = brKey.readLine();
				System.out.println("Message:"+getMessage);
			}
			
		} catch (IOException io) {
			System.out.println("Server not connected....");
			System.exit(0);
		}
	
	}

	
		public static void main(String[] args) {
			new Client();
		}
}
