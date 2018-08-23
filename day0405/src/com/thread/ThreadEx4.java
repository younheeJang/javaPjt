/*package com.thread;

public class ThreadEx4 {

	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+"start");
		Runnable r = new JoinEx();
		
		
		Thread myThread = new Thread(r);
		myThread.start(); //호출한 스레드가 끝이 날 때까지 여기서부터 기다렸다가 다시 메인 실행됨
		try {
			Thread.sleep(1000);
			myThread.join();
		} catch (InterruptedException ee) {
			ee.printStackTrace();
			
			
		}
		
		System.out.println(Thread.currentThread().getName()+"end");
	}
	
}
*/