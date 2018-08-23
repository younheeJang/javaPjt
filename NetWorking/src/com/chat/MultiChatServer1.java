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
			
			//��Ʈ�ѹ��� �޾� ������ ����� �Ŀ��� ���Ϲݺ������� �� ���Ἲ�� ���ӽ����־�� �Ѵ�.
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
			
		//�Է¹��� �޽����� �Ľ� �޽����� ó���� �� �ν��Ͻ� ���� ����
		String message;
		String[] arrMessage;
	
		
		//����¿� �ʿ��� ���۸����� ����Ʈ������ �ΰ����� ����
		private BufferedReader inMessage = null;
		private PrintWriter outMessage = null;
		
		@Override
		public void run() {
		   
			
			try {
				
			//���ۿ���
			boolean status = true;
			
			//��ǲ�ƿ�ǲ��Ʈ���� �̿��� ������� �������ش�.
			inMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMessage = new PrintWriter(socket.getOutputStream(), true);
			//�޽����� ��°��� ���� ���Ͽ��� �پƿ�ǲ��Ʈ�� �޼ҵ带 ���� �޾Ƴ� ���ڿ��� ����Ʈ�����Ͱ�ä�� ���� 
			//�������ͽ��� Ʈ���� ���� �޽��� ������ ó���� ���ְڴٴ� �ǹ�.
			
			while(true) {
				
				message = inMessage.readLine();
				arrMessage = message.split("/");
				//���۵帮���� ������� �޼ҵ带 ���� �о�� �޽����� �ν��Ͻ� ���� �޽����� �����Ѵ�.
				//�Է¹��� �޽����� ��̸���Ʈ�� �����Ű�µ�, "/" �̿� ����  �����ڸ� ����Ͽ�, ���ڿ��� �����ؼ� 
				//��̸���Ʈ�� ������ ������ �� �ֵ��� ���ش�.
				
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
