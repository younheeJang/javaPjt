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

	// ������ ����
	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// �α��� ��
	// �α��� �г�
	private JPanel loginPanel;
	// �α��� ��ư
	private JButton loginButton;
	// ��ȭ�� ��
	private JLabel jlPersonNameIn;
	// ��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	private JTextField idInput;

	// �α׾ƿ� ��
	// �α׾ƿ� �г�
	private JPanel logoutPanel;
	// �α׾ƿ� ��ư
	private JButton logoutButton;
	// ��ȭ�� ��� ��
	private JLabel jlPersonNameOut;

	// �Է´�
	// �Է� �г�
	private JPanel msgPanel;
	// �޽��� �Է� �ؽ�Ʈ �ʵ�
	private JTextField msgInput;
	// ���� ��ư
	private JButton exitButton;

	// ���� ����
	private JFrame jframe;

	// ä�� ���� ���â
	private JTextArea msgOut;

	// ī�� ���̾ƿ� ����
	private Container tab;
	private CardLayout cardLayout;

	// ������ ����
	private Thread thread;

	// ���� �÷���
	boolean status;

	public MultiChatClient(String ip) {

		this.ip = ip;

		// �α��� �г� ����
		loginPanel = new JPanel();
		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		// ���̵� �Է�
		idInput = new JTextField(15);
		// �α��� ��ư
		loginButton = new JButton("login");
		// �̺�Ʈ ���
		loginButton.addActionListener(this);
		

		// ��ȭ�� ��
		jlPersonNameIn = new JLabel("��ȭ��");

		// �г� ����
		// �α��� �гο� ������Ʈ ���
		loginPanel.add(jlPersonNameIn, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		// �α׾ƿ��г�
		logoutPanel = new JPanel();

		// ���̾ƿ� ����
		logoutPanel.setLayout(new BorderLayout());
		jlPersonNameOut = new JLabel();
		logoutButton = new JButton("logout");

		// �̺�Ʈ ���
		logoutButton.addActionListener(this);
		
		
		// �г� ����
		logoutPanel.add(jlPersonNameOut, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// �Է� �г� ����
		msgPanel = new JPanel();
		// ���̾ƿ� ����
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		// �̺�Ʈ ���
		msgInput.addActionListener(this);
		
		
		// �����ư �̺�Ʈ
		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);

		
		// �Է� �г� ����
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// �α��� �α׾ƿ� �г� ������ ���� ī�� ���̾ƿ� �г� ����
		tab = new JPanel();
		cardLayout = new CardLayout();
		tab.setLayout(cardLayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// ���� ������ ����
		jframe = new JFrame("multi chatting program");
		// �޽��� ���â
		msgOut = new JTextArea("", 10, 30);
		// ���â�� ������ �������� ���ϰ� ����
		msgOut.setEditable(false);

		// ���� ��ũ�� �ٴ� �׻� ��Ÿ���� ���� ��ũ�� �ٴ� �ʿ��� ���� ��Ÿ���� ��
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		// �α����г��� �켱������ ������
		cardLayout.show(tab, "login");

		// ������ �ڵ� ũ�� ����
		jframe.pack();

		// ������ ũ�� ���� �Ұ������� false��
		jframe.setResizable(false);

		// ������ ������
		jframe.setVisible(true);

		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

	}

	// ��������
	public void connectServer() {

		try {
			// ���� ����
			socket = new Socket(ip, 5000);
			System.out.println("[Client]Server connect Success!");

			// ����� ��Ʈ�� ����
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);

			// ������ �α��� �޽��� ����
			outMsg.println(id + "/" + "login");
			// �޽��� ������ ���� ������ ����
			thread = new Thread(this);
			// ������ ����
			thread.start();

		} catch (Exception e) {
			System.out.println("[MultiChatClient]connectServer() Exception Occured!! ");

		}

	}// end of connectServer()

	@Override
	public void run() {

		// ���Ÿ޽����� ó���ϴ� ���� ����
		String msg;
		String[] rmsg;

		status = true;

		while (status) {

			try {
				// �޽��� ���Ű� �Ľ�
				msg = inMsg.readLine();
				rmsg = msg.split("/");

				// JTextArea�� ������ �޽��� �߰���
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");

				// Ŀ���� ���� ��ȭ �޽����� ǥ���� ���ɾ��������� Ŀ���� ��ġ(�����̴� ��ġ�� ����)
				msgOut.setCaretPosition(msgOut.getDocument().getLength());

			} catch (IOException e) {
				status = false;
			}

		} // end of while

		System.out.println("[MultiChatClient]" + thread.getName() + "�����");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == exitButton) {
			System.exit(0);

		} else if (obj == loginButton) {
			// ���̵� ��������
			id = idInput.getText();

			// ��ȭ�� �ΰ� ������ ��ȭ���� �Ȱ����ϱ� �ƹ� �ų� �����͵� ����� ����
			jlPersonNameIn.setText("��ȭ��:" + id);

			// �α����� �ϸ� ī�巹�̾ƿ��� �α׾ƿ����� �ٲ����� ����
			cardLayout.show(tab, "logout");

			connectServer();
		} else if (obj == logoutButton) {
			// �α׾ƿ� �޽��� ����
			outMsg.println(id + "/" + "logout");
			// ��ȭâ Ŭ����
			msgOut.setText("");

			// �α��� �гη� ��ȯ�Ѵ�.
			cardLayout.show(tab, "login");
			outMsg.close();

			// ����ó��
			try {
				inMsg.close();
				socket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			status = false;
		} else if (obj == msgInput) {
			// �޽��� ����
			outMsg.println(id + "/" + msgInput.getText());
			// �Է�â Ŭ����
			msgInput.setText("");

		}

	}

	public static void main(String[] args) {
		new MultiChatClient("127.0.0.1");
	}

}
