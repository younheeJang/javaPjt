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

	 //������ ����
	 private String ip;
	 private String id;
	 private Socket socket;
	 private BufferedReader inMessage = null;
	 private PrintWriter outMessage = null;

	 
	 //�α��� ��
	 //�α��� �г�
	 private JPanel jpLogin;
	 //�α��� ��ư
	 private JButton jbLogin;
	 //�α��� ��
	 private JLabel jlLogin;
	 //��ȭ�� ��
	 private JLabel jlInName;
	 //��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	 private JTextField jtName;
	 
	 
	 
	 //�α׾ƿ� ��
	 //�α׾ƿ� �г�
	 private JPanel jpLogout;
	 //�α׾ƿ� ��ư
	 private JButton jbLogout;
	 //��ȭ�� ��� ��
	 private JLabel jlOutName;
	 
	 //�Է´�
	 //�Է� �г�
	 private JPanel jpInput;
	 //�޽��� �Է� �ؽ�Ʈ �ʵ�
	 private JTextField jtInput;
	 //���� ��ư
	 private JButton jbExit;
	 
	 //���� ����
	 private JFrame jframe;
	 //ä�ó��� ���â
	 private JTextArea jaWindow ;
	 //ī�� ���̾ƿ� ����
	 private CardLayout cardlayout;
	 //������ ����
	 private Thread thread;
	 //���� �÷���
	 boolean status;
	 
	 
	 public MultiServerClient(String ip) {
	 
	  this.ip = ip;
	  
	  //�α��� �г� ����
	  jpLogin = new JPanel();
	  //���̾ƿ� ����
	  jpLogin.setLayout(new BorderLayout());
	  //���̵� �Է�
	  jtInput= new JTextField(15);
	  //�α��� ��ư
	  jbLogin = new JButton("login");
	  //�̺�Ʈ ���
	  
	  // ��ȭ�� ��
	  jlInName = new JLabel("��ȭ��");
	  //�гα���
	  //�α��� �гο� ������Ʈ ���
	  jpLogin.add(jlInName, BorderLayout.WEST);
	  
	  
	  //�α׾ƿ� �г�
	  jpLogout= new JPanel();
	  //���̾ƿ� ����
	  jpLogout.setLayout(new BorderLayout());
	  //�̺�Ʈ ���
	  
	  //�г� ����
	  jpLogout.add(jlOutName, BorderLayout.CENTER);
	  jpLogout.add(jbLogout, BorderLayout.EAST);
	  //�Է� �г� ����
	  jpInput=new JPanel();
	  //���̾ƿ� ����
	  jpInput.setLayout(new BorderLayout());
	  jtInput= new JTextField(30);
	  //�̺�Ʈ ���
	  
	  //���� ��ư �̺�Ʈ
	  jbExit = new JButton("Exit");
	  //�Է� �г� ����
	  jpInput.add(jtInput, BorderLayout.CENTER);
	  jpInput.add(jbExit, BorderLayout.EAST);
	  //�α��� �α׾ƿ� �г� ������ ���� ī�� ���̾ƿ� �г� ����
	  
	  Container con = new Container();
	  con= new JPanel();
	  cardlayout = new CardLayout();
	  con.setLayout(cardlayout);
	  con.add(jpLogin, "login");
	  con.add(jpLogout, "logout");
	  //���� ������ ����
	  jframe = new JFrame("Multi chatting program");
	  //�޽��� ���â
	  jaWindow = new JTextArea("", 10, 30);
	  //���â�� ������ �������� ���ϰ� ����
	  jaWindow.setEditable(false);
	  //���� ��ũ�� �ٴ� �׻� ��Ÿ���� ���� ��ũ�� �ٴ� �ʿ��� ���� ��Ÿ���� ��
	  JScrollPane jscroll = new JScrollPane(jaWindow, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	  jframe.add(con, BorderLayout.NORTH);
	  jframe.add(jscroll, BorderLayout.CENTER);
	  jframe.add(jpInput, BorderLayout.SOUTH);
	  //�α��� �г��� �켱������ ������
	  cardlayout.show(con, "login");
	  //������ �ڵ� ũ�� ����
	  jframe.pack();
	  //������ ũ�� ���� �Ұ� ������ �޽���
	  jframe.setResizable(false);
	  //������ ������
	  jframe.setVisible(true);
	 
	  jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	 }
	 
	 //��������
	 public void connectServer() {
	  try {
	   
	   //���� ����
	   socket = new Socket(ip, 5000);
	   //����� ��Ʈ�� ����
	   inMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	   outMessage = new PrintWriter(socket.getOutputStream(), true);
	   //������ �α��� �޽��� ����
	   outMessage.println(id + "/"+"login");
	   //�޽��� ������ ���� ������ ����
	   thread = new  Thread(this);
	   //������ ����
	   thread.start();
	   
	  } catch (Exception e) {
	   System.out.println("error occured!!!!");
	  }
	  
	 }
	 
	 @Override
	 public void run() {
	  
	  //���Ÿ޽����� ó���ϴ� ���� ����
		 String strMessage;
		 String[] strArrMessage;
	  //���¸� ǥ���� �ش�.
		 status = true;
		 
		 while(status) {
			 
			 try {
				 //�޽��� ���Ű� �Ľ�
				 strMessage = inMessage.readLine();
				 strArrMessage = strMessage.split("/");
				 
				 //�ؽ�Ʈ�����ƿ� ������ �޽��� �߰�
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
