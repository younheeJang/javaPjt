package com.chat;

//io���� �ʿ��� ����Ʈ ����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//net���� ����Ʈ �ؾ��� ��
import java.net.ServerSocket;
import java.net.Socket;

//��ƿ���� ����Ʈ �ؾ��� ��
import java.util.ArrayList;

public class MultiChatServer {

	// �������ϰ� Ŭ���̾�Ʈ ���� ����
	private ServerSocket ss = null;
	private Socket s = null;

	// ����� Ŭ���̾�Ʈ ������(ChatThread )�� �����ϴ� ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();

	// ��Ƽä�� ���� ���� :��ŸƮ��� �޼ҵ� ����
	public void strat() {
		try {

			// ���� ���� ����(��Ʈ�ѹ�)
			ss = new ServerSocket(5000);
			System.out.println("server start..........................");

			// ���ѷ����� ���鼭 Ŭ���̾�Ʈ ������ ��ٸ�
			while (true) {
				s = ss.accept(); // ������ �Ǹ�, (���� = ���� ����.�׼�Ʈ();��
				// ����� Ŭ���̾�Ʈ���� ������ Ŭ���� ������
				ChatThread chat = new ChatThread();
				// Ŭ���̾�Ʈ�� ����Ʈ�� �߰�
				chatlist.add(chat);
				// ������ ����
				chat.start();

			} // end of while

		} catch (Exception e) {

			System.out.println("[MultiChatServer]start() Exception occured....!!");
		}

	}

	// ����� Ŭ���̾�Ʈ���� �޽��� �߰���
	void msgSendAll(String msg) {

		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
			// ��ǲ�ƿ�ǲ ��Ʈ�� ���� �� ���� ���� Ȱ��ȭ ��(������ Ŭ��������

		}

	}

	// �� Ŭ���̾�Ʈ ������ ���� ������ Ŭ����
	class ChatThread extends Thread {
		// ���Ÿ޽����� �Ľ̸޽��� ó���� ���� ���� ����
		String msg;
		String[] rmsg;

		// ����� ��Ʈ�� ����
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		public ChatThread() {

		}

		@Override
		public void run() {

			// ä���� �غ� �Ǿ������� ���ο� ����
			boolean status = true;
			// �������� ���ۿ���

			System.out.println("ChatThread Start .............................");

			try {
				// (�ξƿ� �������� �̿���)����� ��Ʈ�� ����
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);

				// status ���������� true�̸� ������ ���鼭 ����ڿ��Լ� ���ŵ� �޽��� ó����
				while (status) {
					// ���ŵ� �޽����� msg ������ ������
					msg = inMsg.readLine();
					// �о���� �޽����� �Ľ��� �����ڸ� �������� ��
					// �����ڴ� '/' �����ڸ� �������� �޽����� ���ڿ� �迭�� �Ľ�(�ٲ��ִ� ��: ���ڸ� ���ڷ� ���ڸ� ���ڷ� ��)��
					rmsg = msg.split("/"); //��Ʈ������ �Ľ����ִ� �޼ҵ�.

					// �Ľ̵� ���ڿ� �迭�� �ι�° �ε��� ���� ���� ó����
					// �迭�� ù��°�� �������� �̸� �� ���� �α��� ���� �α׾ƿ� ���� ���ڿ��� �����ϰ� �ǹǷ�
					// �α��� �α׾ƿ��� ó���Ǵ� �ε����� �� ��°.

					// �α��ηα׾ƿ� ��� �����ڿ��� ������ �ѷ���� �� (�׷� ������ ó���� �ʿ�
					// �α׾ƿ� �޽��� �� �� :������ ��
					if (rmsg[1].equals("logout")) {

						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "���� �����ϼ̽��ϴ�.");
						// �ش� Ŭ���̾�Ʈ ������ ����� ���� status���·� false�� ����
						status = false;

						// �α��� �޽����� ��
					} else if (rmsg[1].equals("login")) {
						msgSendAll("server/" + rmsg[0] + "���� �α����ϼ̽��ϴ�.");

					} else// �� ���� �޽��� �� ��
					{
						msgSendAll(msg);
					}

				} // end of while

				// �ݺ����� ������ ����� Ŭ���̾�Ʈ ������ ����ǹǷ� ���ͷ�Ʈ�� �߻���

				this.interrupt();// ���ͷ�Ʈ + ���� ��Ű�� ��� �͵��� ������
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
