package com.netex;
import static java.lang.System.out;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class UnicastClient {

	String msg;
	BufferedReader br; /*= new BufferedReader(null);*/
	BufferedWriter bw; /*= new BufferedWriter(null);*/
	BufferedReader keyboard ;/*= new BufferedReader(null);*/
	Socket socket ;/*= new Socket(           , "1000");*/
	
	public UnicastClient() {
		
		
		try {
			socket = new Socket("Client", 6000);
		} catch (UnknownHostException fn) {
			System.out.println("서버를 찾을 수 없습니다.");
		} catch (IOException io) {
			System.out.println("오류 발생");
			System.exit(0);
		}
		
		
		
		try {
			msg = br.readLine();
			bw.write(msg);
		//클라이언트 창에서 출력문이 보여야 하므로,
		 System.out.println(msg);
		} catch (IOException io) {
			out.println("You've got the wrong type of message!");
			io.printStackTrace();
		}
		
		
		

	}

	public static void main(String[] args) {
    new UnicastClient();
	}

}
