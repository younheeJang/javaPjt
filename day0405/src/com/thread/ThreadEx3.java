package com.thread;

public class ThreadEx3 extends Thread {

	@Override
	public void run() {

		for (char ch = 'A'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {

				sleep(150);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
//1 5 10 우선순위의 원칙
		ThreadEx3 th3 = new ThreadEx3();
		th3.start();

		
		for (int i = 1; i <= 60; i++) {
			System.out.println(i);
		}

	}

}
