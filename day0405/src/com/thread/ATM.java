package com.thread;

import static java.lang.System.out;

public class ATM implements Runnable {

	// 현 잔액
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
			System.out.printf("잔액:%d원\n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
		}

	}

	@Override
	public void run() {

		synchronized (this) {
			// 동기화 들어가면 우선권을 this가 가지게 된다. 10번 출력의 기회가 있음

			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);

				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {
					try {
						this.wait();// 웨이트 함수를 주면 부모가 출금 후 자식에게 우선권이 가고 그 동안 부모는 기다리게 된다.
						// Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();// 기다리지 않는 메소드 이 메소드를 이용하면 제어권을 일방적으로 넘겨받는다.
				}
			}

		}

	}

}
