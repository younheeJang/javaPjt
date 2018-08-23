package com.chat;

//io에서 필요한 임포트 종류
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//net에서 임포트 해야할 것
import java.net.ServerSocket;
import java.net.Socket;

//유틸에서 임포트 해야할 것
import java.util.ArrayList;

public class MultiChatServer {

	// 서버소켓과 클라이언트 연결 소켓
	private ServerSocket ss = null;
	private Socket s = null;

	// 연결된 클라이언트 스레드(ChatThread )를 관리하는 ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();

	// 멀티채팅 메인 구성 :스타트라는 메소드 구성
	public void strat() {
		try {

			// 서버 소켓 생성(포트넘버)
			ss = new ServerSocket(5000);
			System.out.println("server start..........................");

			// 무한루프를 돌면서 클라이언트 연결을 기다림
			while (true) {
				s = ss.accept(); // 연결이 되면, (소켓 = 서버 소켓.액셉트();ㅔ
				// 연결된 클라이언트에서 스레드 클래스 생성함
				ChatThread chat = new ChatThread();
				// 클라이언트를 리스트에 추가
				chatlist.add(chat);
				// 스레드 시작
				chat.start();

			} // end of while

		} catch (Exception e) {

			System.out.println("[MultiChatServer]start() Exception occured....!!");
		}

	}

	// 연결된 클라이언트에게 메시지 중계함
	void msgSendAll(String msg) {

		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
			// 인풋아웃풋 스트림 형성 후 위의 행이 활성화 됨(스래드 클래스에서

		}

	}

	// 각 클라이언트 관리를 위한 스레드 클래스
	class ChatThread extends Thread {
		// 수신메시지와 파싱메시지 처리를 위한 변수 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		public ChatThread() {

		}

		@Override
		public void run() {

			// 채팅할 준비가 되었는지의 여부에 대한
			boolean status = true;
			// 스레드의 시작여부

			System.out.println("ChatThread Start .............................");

			try {
				// (인아웃 엠에스지 이용한)입출력 스트림 생성
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);

				// status 상태정보가 true이면 루프를 돌면서 사용자에게서 수신된 메시지 처리함
				while (status) {
					// 수신된 메시지를 msg 변수에 저장함
					msg = inMsg.readLine();
					// 읽어들인 메시지를 파싱함 구분자를 기준으로 함
					// 구분자는 '/' 구분자를 기준으로 메시지를 문자열 배열로 파싱(바꿔주는 것: 문자를 숫자로 숫자를 문자로 등)함
					rmsg = msg.split("/"); //스트링으로 파싱해주는 메소드.

					// 파싱된 문자열 배열의 두번째 인덱스 값에 따라 처리됨
					// 배열에 첫번째로 접속자의 이름 그 다음 로그인 오아 로그아웃 등의 문자열을 저장하게 되므로
					// 로그인 로그아웃이 처리되는 인덱스는 두 번째.

					// 로그인로그아웃 모든 접속자에게 정보를 뿌려줘야 함 (그런 정보의 처리가 필요
					// 로그아웃 메시지 일 때 :지워야 함
					if (rmsg[1].equals("logout")) {

						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료하셨습니다.");
						// 해당 클라이언트 스레드 종료로 인해 status상태로 false로 설정
						status = false;

						// 로그인 메시지일 때
					} else if (rmsg[1].equals("login")) {
						msgSendAll("server/" + rmsg[0] + "님이 로그인하셨습니다.");

					} else// 그 밖의 메시지 일 때
					{
						msgSendAll(msg);
					}

				} // end of while

				// 반복문인 루프를 벗어나면 클라이언트 연결이 종료되므로 인터럽트가 발생됨

				this.interrupt();// 인터럽트 + 스톱 시키면 모든 것들이 지워짐
				System.out.println("##" + this.getName() + "Stop");

			} catch (IOException io) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException Occured.....!");

			}

		}// end of run

	} // end of ChatThread

	public static void main(String[] args) {

		MultiChatServer server = new MultiChatServer();
		server.strat();

	}

}
