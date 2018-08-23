package com.chat;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiServerClient implements ActionListener, Runnable {

	 //페이지 설정
	 private String ip;
	 private String id;
	 private Socket socket;
	 private BufferedReader inMessage = null;
	 private PrintWriter outMessage = null;

	 
	 //로그인 단
	 //로그인 패널
	 private JPanel jpLogin;
	 //로그인 버튼
	 private JButton jbLogin;
	 //로그인 라벨
	 private JLabel jlLogin;
	 //대화명 라벨
	 private JLabel jlInName;
	 //대화명 입력 텍스트 필드
	 private JTextField jtName;
	 
	 
	 
	 //로그아웃 단
	 //로그아웃 패널
	 private JPanel jpLogout;
	 //로그아웃 버튼
	 private JButton jbLogout;
	 //대화명 출력 라벨
	 private JLabel jlOutName;
	 
	 //입력단
	 //입력 패널
	 private JPanel jpInput;
	 //메시지 입력 텍스트 필드
	 private JTextField jtInput;
	 //종료 버튼
	 private JButton jbExit;
	 
	 //메인 윈도
	 private JFrame jframe;
	 //채팅내용 출력창
	 private JTextArea jaWindow ;
	 //카드 레이아웃 구성
	 private CardLayout cardlayout;
	 //스레드 구성
	 private Thread thread;
	 //상태 플러그
	 boolean status;
	 
	 
	 public MultiServerClient(String ip) {
	 
	  this.ip = ip;
	  
	  //로그인 패널 구성
	  jpLogin = new JPanel();
	  //레이아웃 설정
	  jpLogin.setLayout(new BorderLayout());
	  //아이디 입력
	  jtInput= new JTextField(15);
	  //로그인 버튼
	  jbLogin = new JButton("login");
	  //이벤트 등록
	  
	  // 대화명 라벨
	  jlInName = new JLabel("대화명");
	  //패널구성
	  //로그인 패널에 컴포넌트 등록
	  jpLogin.add(jlInName, BorderLayout.WEST);
	  
	  
	  //로그아웃 패널
	  jpLogout= new JPanel();
	  //레이아웃 설정
	  jpLogout.setLayout(new BorderLayout());
	  //이벤트 등록
	  
	  //패널 구성
	  jpLogout.add(jlOutName, BorderLayout.CENTER);
	  jpLogout.add(jbLogout, BorderLayout.EAST);
	  //입력 패널 구성
	  jpInput=new JPanel();
	  //레이아웃 설정
	  jpInput.setLayout(new BorderLayout());
	  jtInput= new JTextField(30);
	  //이벤트 등록
	  
	  //종료 버튼 이벤트
	  jbExit = new JButton("Exit");
	  //입력 패널 구성
	  jpInput.add(jtInput, BorderLayout.CENTER);
	  jpInput.add(jbExit, BorderLayout.EAST);
	  //로그인 로그아웃 패널 선택을 위한 카드 레이아웃 패널 구성
	  
	  Container con = new Container();
	  con= new JPanel();
	  cardlayout = new CardLayout();
	  con.setLayout(cardlayout);
	  con.add(jpLogin, "login");
	  con.add(jpLogout, "logout");
	  //메인 프레임 구성
	  jframe = new JFrame("Multi chatting program");
	  //메시지 출력창
	  jaWindow = new JTextArea("", 10, 30);
	  //출력창의 내용을 수정하지 못하게 설정
	  jaWindow.setEditable(false);
	  //수직 스크롤 바는 항상 나타나고 수평 스크롤 바는 필요할 때만 나타나게 함
	  JScrollPane jscroll = new JScrollPane(jaWindow, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	  jframe.add(con, BorderLayout.NORTH);
	  jframe.add(jscroll, BorderLayout.CENTER);
	  jframe.add(jpInput, BorderLayout.SOUTH);
	  //로그인 패널을 우선적으로 보여줌
	  cardlayout.show(con, "login");
	  //프레임 자동 크기 설정
	  jframe.pack();
	  //프레임 크기 조정 불가 설정을 펄스로
	  jframe.setResizable(false);
	  //프레임 보여줌
	  jframe.setVisible(true);
	 
	  jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	 }
	 
	 //서버연결
	 public void connectServer() {
	  try {
	   
	   //소켓 생성
	   socket = new Socket(ip, 5000);
	   //입출력 스트림 생성
	   inMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	   outMessage = new PrintWriter(socket.getOutputStream(), true);
	   //서버레 로그인 메시지 전달
	   outMessage.println(id + "/"+"login");
	   //메시지 수신을 위한 스레드 생성
	   thread = new  Thread(this);
	   //스레드 시작
	   thread.start();
	   
	  } catch (Exception e) {
	   System.out.println("error occured!!!!");
	  }
	  
	 }
	 
	 @Override
	 public void run() {
	  
	  //수신메시지를 처리하는 변수 선언
		 String strMessage;
		 String[] strArrMessage;
	  //상태를 표시해 준다.
		 status = true;
		 
		 while(status) {
			 
			 try {
				 //메시지 수신과 파싱
				 strMessage = inMessage.readLine();
				 strArrMessage = strMessage.split("/");
				 
				 //텍스트에리아에 수신한 메시지 추가
				 outMessage.append(strArrMessage[0]+">"+strArrMessage[1]+"\n");
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 } catch (Exception e) {
			
				 
				 				 
				 
				 
				 
			}
			 
			 
			 
			 
		 }
		 
		 
	  
	 }

	 @Override
	 public void actionPerformed(ActionEvent e) {
	  

	 }

	 public static void main(String[] args) {
	  

	 }

}
