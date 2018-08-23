package com.chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;

import com.chat.MultiChatServer.ChatThread;

import java.net.Socket;
import java.net.ServerSocket;


public class MultiChatServer1 {

	
	private Socket socket =null;
	private ServerSocket serverSocket = null;
	
	private ArrayList<ChatThread> arrayList = new ArrayList<ChatThread>();
	
	
	public void start() {
		
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("server connected.........");
			
			//포트넘버를 받아 서버에 연결된 후에는 와일반복문으로 그 연결성을 지속시켜주어야 한다.
			while(true) {
			socket = serverSocket.accept();
			ChatThread chatThread = new ChatThread();
			arrayList.add(chatThread);
			
			
			}
		} catch (Exception e) {
			System.out.println("error occured!!!!!");
			
		}
		
		
	}
	
	class ChatThread extends Thread  {
			
		//입력받은 메시지와 파싱 메시지를 처리해 줄 인스턴스 변수 선언
		String message;
		String[] arrMessage;
	
		
		//입출력에 필요한 버퍼리더와 프린트라이터 널값으로 지정
		private BufferedReader inMessage = null;
		private PrintWriter outMessage = null;
		
		@Override
		public void run() {
		   
			
			try {
				
			//시작여부
			boolean status = true;
			
			//인풋아웃풋스트림을 이용해 입출력을 구성해준다.
			inMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMessage = new PrintWriter(socket.getOutputStream(), true);
			//메시지의 출력같은 경우는 소켓에서 겟아웃풋스트림 메소드를 통해 받아낸 문자열을 프린트라이터객채를 통해 
			//스태이터스가 트루일 동안 메시지 수신의 처리를 해주겠다는 의미.
			
			while(true) {
				
				message = inMessage.readLine();
				arrMessage = message.split("/");
				//버퍼드리더의 리드라인 메소드를 통해 읽어온 메시지를 인스턴스 변수 메시지에 저장한다.
				//입력받은 메시지를 어레이리스트에 저장시키는데, "/" 이와 같은  구분자를 사용하여, 문자열을 구분해서 
				//어레이리스트에 정보를 저장할 수 있도록 해준다.
				
				if(arrMessage[1]=="login") {
					
				}else if(arrMessage[1]=="logout") {
					
				}else {
					
				}
				
				
				
			}
			
			
			
			} catch (IOException io) {
			
				
				
			}			
		
		}
		
	}
	
	
	
	
}
