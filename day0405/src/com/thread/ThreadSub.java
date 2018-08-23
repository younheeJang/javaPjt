package com.thread;

import static java.lang.System.out;

public class ThreadSub extends Thread {

	private String name;
	private String lastname;

	public ThreadSub(String a, String b, int x) {
		name = a;
		lastname = b;
		setPriority(x);
		setDaemon(true);// ���� ����

	}

	@Override
	public void run() {

		// ������ ���ô�.
		out.println(Thread.activeCount());
		// Ȱ��ȭ�Ǿ� �ִ� �������� ������ �˾ƺ���
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];
		// �����带 �迭�� �����ô�.
		// �����带 �迭�� Ȱ���� �� ����ϴ� �޼ҵ�� enumerate��
		Thread.enumerate(th);
		for (int i = 0; i < th.length; i++) {
			System.out.println(
					th[i].getName() + ":" + th[i].getPriority() + ":" + th[i].isDaemon() + ":" + th[i].isAlive());
			// �������� �̸�, �켱����, ���󽺷��������� ����, ���� ����ִ����� ���θ� �˾ƺ��� ���� �����
		}

		while (true) {
			System.out.print("�̸�:" + name);
			try {
				sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();

			}
			System.out.println("\t�̸�2:" + lastname);
		}

	}

}
