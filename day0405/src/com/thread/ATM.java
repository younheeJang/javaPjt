package com.thread;

import static java.lang.System.out;

public class ATM implements Runnable {

	// �� �ܾ�
	private long depositeMoney = 10000;

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void setDepositeMoney(long depositeMoney) {
		this.depositeMoney = depositeMoney;
	}

	public void withDraw(long howMuch) {

		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ�:%d��\n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� �����մϴ�.");
		}

	}

	@Override
	public void run() {

		synchronized (this) {
			// ����ȭ ���� �켱���� this�� ������ �ȴ�. 10�� ����� ��ȸ�� ����

			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);

				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {
					try {
						this.wait();// ����Ʈ �Լ��� �ָ� �θ� ��� �� �ڽĿ��� �켱���� ���� �� ���� �θ�� ��ٸ��� �ȴ�.
						// Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();// ��ٸ��� �ʴ� �޼ҵ� �� �޼ҵ带 �̿��ϸ� ������� �Ϲ������� �Ѱܹ޴´�.
				}
			}

		}

	}

}
