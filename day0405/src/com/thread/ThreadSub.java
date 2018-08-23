package com.thread;

import static java.lang.System.out;

public class ThreadSub extends Thread {

	private String name;
	private String lastname;

	public ThreadSub(String a, String b, int x) {
		name = a;
		lastname = b;
		setPriority(x);
		setDaemon(true);// 데몬 설정

	}

	@Override
	public void run() {

		// 구현해 봅시다.
		out.println(Thread.activeCount());
		// 활성화되어 있는 스레드의 개수를 알아보기
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];
		// 스레드를 배열로 잡읍시다.
		// 스레드를 배열로 활용할 때 사용하는 메소드는 enumerate임
		Thread.enumerate(th);
		for (int i = 0; i < th.length; i++) {
			System.out.println(
					th[i].getName() + ":" + th[i].getPriority() + ":" + th[i].isDaemon() + ":" + th[i].isAlive());
			// 스레드의 이름, 우선순위, 데몬스레드인지의 여부, 아직 살아있는지의 여부를 알아보기 위한 출력폼
		}

		while (true) {
			System.out.print("이름:" + name);
			try {
				sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();

			}
			System.out.println("\t이름2:" + lastname);
		}

	}

}
