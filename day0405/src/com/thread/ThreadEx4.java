/*package com.thread;

public class ThreadEx4 {

	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+"start");
		Runnable r = new JoinEx();
		
		
		Thread myThread = new Thread(r);
		myThread.start(); //ȣ���� �����尡 ���� �� ������ ���⼭���� ��ٷȴٰ� �ٽ� ���� �����
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