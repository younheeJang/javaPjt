package com.thread;

public class ThreadSubMain {

	public static void main(String[] args) {

		//����, ������, ������ �� 3�� ���ư���.
		ThreadSub ts = new ThreadSub("�浿", "ȫ", 1);
		ts.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {	}

		
		ThreadSub ts1 = new ThreadSub("����","��", 5);
		
		ts1.start();
		try {
			
			Thread.sleep(300);//��ư Ÿ���� �ø� ������ ������ �������� �ʱ� �����̴�.
			
		} catch (InterruptedException e) {
			
			
		}
	}

}
