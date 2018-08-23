package com.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient implements ActionListener, Runnable {

	// 페이지 설정
	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// 로그인 단
	// 로그인 패널
	private JPanel loginPanel;
	// 로그인 버튼
	private JButton loginButton;
	// 대화명 라벨
	private JLabel jlPersonNameIn;
	// 대화명 입력 텍스트 필드
	private JTextField idInput;

	// 로그아웃 닷
	// 로그아웃 패널
	private JPanel logoutPanel;
	// 로그아웃 버튼
	private JButton logoutButton;
	// 대화명 출력 라벨
	private JLabel jlPersonNameOut;

	// 입력단
	// 입력 패널
	private JPanel msgPanel;
	// 메시지 입력 텍스트 필드
	private JTextField msgInput;
	// 종료 버튼
	private JButton exitButton;

	// 메인 윈도
	private JFrame jframe;

	// 채팅 내용 출력창
	private JTextArea msgOut;

	// 카드 레이아웃 구성
	private Container tab;
	private CardLayout cardLayout;

	// 스레드 구성
	private Thread thread;

	// 상태 플래그
	boolean status;

	public MultiChatClient(String ip) {

		this.ip = ip;

		// 로그인 패널 구성
		loginPanel = new JPanel();
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		// 아이디 입력
		idInput = new JTextField(15);
		// 로그인 버튼
		loginButton = new JButton("login");
		// 이벤트 등록
		loginButton.addActionListener(this);
		

		// 대화명 라벨
		jlPersonNameIn = new JLabel("대화명");

		// 패널 구성
		// 로그인 패널에 컴포넌트 등록
		loginPanel.add(jlPersonNameIn, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		// 로그아웃패널
		logoutPanel = new JPanel();

		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		jlPersonNameOut = new JLabel();
		logoutButton = new JButton("logout");

		// 이벤트 등록
		logoutButton.addActionListener(this);
		
		
		// 패널 구성
		logoutPanel.add(jlPersonNameOut, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// 입력 패널 구성
		msgPanel = new JPanel();
		// 레이아웃 설정
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		// 이벤트 등록
		msgInput.addActionListener(this);
		
		
		// 종료버튼 이벤트
		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);

		
		// 입력 패널 구성
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// 로그인 로그아웃 패널 선택을 위한 카드 레이아웃 패널 구성
		tab = new JPanel();
		cardLayout = new CardLayout();
		tab.setLayout(cardLayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// 메인 프레임 구성
		jframe = new JFrame("multi chatting program");
		// 메시지 출력창
		msgOut = new JTextArea("", 10, 30);
		// 출력창의 내용을 수정하지 못하게 설정
		msgOut.setEditable(false);

		// 수직 스크롤 바는 항상 나타내고 수평 스크롤 바는 필요할 때만 나타나게 함
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		// 로그인패널을 우선적으로 보여줌
		cardLayout.show(tab, "login");

		// 프레임 자동 크기 설정
		jframe.pack();

		// 프레임 크기 조정 불가설정을 false로
		jframe.setResizable(false);

		// 프레임 보여줌
		jframe.setVisible(true);

		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

	}

	// 서버연결
	public void connectServer() {

		try {
			// 소켓 생성
			socket = new Socket(ip, 5000);
			System.out.println("[Client]Server connect Success!");

			// 입출력 스트림 생성
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);

			// 서버에 로그인 메시지 전달
			outMsg.println(id + "/" + "login");
			// 메시지 수신을 위한 스레드 생성
			thread = new Thread(this);
			// 스레드 시작
			thread.start();

		} catch (Exception e) {
			System.out.println("[MultiChatClient]connectServer() Exception Occured!! ");

		}

	}// end of connectServer()

	@Override
	public void run() {

		// 수신메시지를 처리하는 변수 선언
		String msg;
		String[] rmsg;

		status = true;

		while (status) {

			try {
				// 메시지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");

				// JTextArea에 수신한 메시지 추가함
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");

				// 커서를 현재 대화 메시지에 표시함 셋케어포지션은 커서의 위치(깜빡이는 위치를 말함)
				msgOut.setCaretPosition(msgOut.getDocument().getLength());

			} catch (IOException e) {
				status = false;
			}

		} // end of while

		System.out.println("[MultiChatClient]" + thread.getName() + "종료됨");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == exitButton) {
			System.exit(0);

		} else if (obj == loginButton) {
			// 아이디 가져오기
			id = idInput.getText();

			// 대화명 두개 어차피 대화명은 똑같으니까 아무 거나 가져와도 상관이 없음
			jlPersonNameIn.setText("대화명:" + id);

			// 로그인을 하면 카드레이아웃이 로그아웃으로 바뀜으로 설정
			cardLayout.show(tab, "logout");

			connectServer();
		} else if (obj == logoutButton) {
			// 로그아웃 메시지 전송
			outMsg.println(id + "/" + "logout");
			// 대화창 클리어
			msgOut.setText("");

			// 로그인 패널로 전환한다.
			cardLayout.show(tab, "login");
			outMsg.close();

			// 예외처리
			try {
				inMsg.close();
				socket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			status = false;
		} else if (obj == msgInput) {
			// 메시지 전송
			outMsg.println(id + "/" + msgInput.getText());
			// 입력창 클리어
			msgInput.setText("");

		}

	}

	public static void main(String[] args) {
		new MultiChatClient("127.0.0.1");
	}

}
